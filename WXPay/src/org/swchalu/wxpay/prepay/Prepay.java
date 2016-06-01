package org.swchalu.wxpay.prepay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Random;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.PostMethod;
import org.swchalu.wxpay.bean.AccessToken;
import org.swchalu.wxpay.common.WXPayContants;
import org.swchalu.wxpay.utils.OauthUtils;
import org.swchalu.wxpay.utils.WXPayUtil;

public class Prepay {

	/**
	 * ͳһ�µ�
	 * 
	 * @param body
	 *            ��Ʒ
	 * @param detail
	 *            ��Ʒ����
	 * @param openid
	 *            �û�Ψһ��ʶ
	 * @param out_trade_no
	 *            �̻���̨������
	 * @param ip
	 *            �ͻ���ip��ַ
	 * @param fee
	 *            ���׽���λ��
	 * @param trade_type
	 *            ��������
	 * @return
	 */
	public static PrepayCallback prepay(String body, String detail,
			String openid, String out_trade_no, String ip, String fee,
			String trade_type) {
		// ����Ԥ֧��bean
		PrepayBean bean = new PrepayBean();
		bean.setAppid(WXPayContants.getAppid())
				.setAttach(WXPayContants.getAttach()).setBody(body)
				.setDetail(detail)
				.setDevice_info(WXPayContants.device_info_web)
				.setFee_type(WXPayContants.getFee_type())
				.setMch_id(WXPayContants.getMch_id())
				.setNonce_str(WXPayUtil.getNonceStr())
				.setNotify_url(WXPayContants.getNotify_url()).setOpenid(openid)
				.setOut_trade_no(out_trade_no).setSpbill_create_ip(ip)
				.setTotal_fee(fee).setTrade_type(trade_type);
		String time_start = WXPayUtil.createTime_start();
		String time_expire = WXPayUtil.createTime_expire();
		bean.setTime_expire(time_expire).setTime_start(time_start);
		System.out.println(bean.toString());

		// ����΢���ĵ�����ǩ��
		bean.setSign(WXPayUtil.sign(bean.toString()));
		System.out.println("sign -> " + bean.getSign());
		// ����ϴ���΢�ŵ�xml����
		System.out.println("xml -> " + bean.toXMLString());

		// ��post��ʽ�ϴ�����
		String backXMLStr = post(bean.toXMLString());
		if (backXMLStr.length() > 0) {
			// ��������Ԥ֧�����
			PrepayCallback callback = WXPayUtil.xml2PrepayCallback(backXMLStr);
			System.out.println(callback.toString());
			return callback;
		}
		return null;
	}

	/**
	 * �µ�
	 * 
	 * @param code
	 *            ��Ȩ��õ�code
	 * @param body
	 *            ��Ʒ
	 * @param detail
	 *            ��Ʒ����
	 * @param ip
	 *            �ͻ���ip��ַ
	 * @param fee
	 *            ���׽���λ��
	 * @return
	 */
	public static PrepayCallback order(String code, String body, String detail,
			String ip, String fee) {
		// ��һ���õ�code
		// �ڶ����õ�openid
		AccessToken mAccessToken = OauthUtils.getAccessToken(code);
		String openid = mAccessToken.getOpenid();

		// ���ﶩ������ʱ�䣨14λ��+�������4λ�����
		Random random = new Random();
		DecimalFormat df = new DecimalFormat("0000");
		int r = random.nextInt(1000);
		String out_trade_no = WXPayUtil.createTime_start() + df.format(r);

		// ������Ԥ֧���µ�
		return prepay(body, detail, openid, out_trade_no, ip, fee,
				WXPayContants.trade_type_jsapi);
	}

	/**
	 * ɨ��֧���µ�
	 * 
	 * @param openid
	 *            �û�Ψһ��ʶ
	 * @param body
	 *            ��Ʒ
	 * @param detail
	 *            ��Ʒ����
	 * @param ip
	 *            �û�ip��ַ
	 * @param fee
	 *            ���׽���λ��
	 * @return
	 */
	public static PrepayCallback scanOrder(String openid, String body,
			String detail, String ip, String fee) {
		// ɨ��֧��������openid
		Random random = new Random();
		DecimalFormat df = new DecimalFormat("0000");
		int r = random.nextInt(1000);
		String out_trade_no = WXPayUtil.createTime_start() + df.format(r);

		return prepay(body, detail, openid, out_trade_no, ip, fee,
				WXPayContants.trade_type_native);
	}

	/**
	 * ��POST��ʽ��΢�ŷ���Ԥ֧��xml
	 * 
	 * @param xml
	 *            Ԥ֧������xml�ַ���
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public static String post(String xml) {
		// �����ַ
		PostMethod post = new PostMethod(WXPayContants.getPrepay_url());
		String backXML = "";

		post.setRequestBody(xml);// �������xml�ַ���
		post.setRequestHeader("Content-type", "text/xml; charset=utf-8");
		HttpClient httpclient = new HttpClient();// ���� HttpClient ��ʵ��
		int result;
		try {
			result = httpclient.executeMethod(post);
			System.out.println("Response status code: " + result);// ����200Ϊ�ɹ�
			System.out.println("Response body: ");

			// ����������ȡ��������
			InputStream ins = post.getResponseBodyAsStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(ins,
					"utf-8"));
			StringBuffer sbf = new StringBuffer();
			String line = null;
			while ((line = br.readLine()) != null) {
				sbf.append(line);
			}
			br.close();

			System.out.println(sbf.toString());// ���ص�����
			post.releaseConnection();// �ͷ�����
			backXML = sbf.toString();
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return backXML;
	}
}
