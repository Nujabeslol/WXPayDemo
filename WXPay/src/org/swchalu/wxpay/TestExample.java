package org.swchalu.wxpay;

import org.swchalu.wxpay.prepay.Prepay;
import org.swchalu.wxpay.prepay.PrepayCallback;
import org.swchalu.wxpay.scanpay.Scanpay;
import org.swchalu.wxpay.scanpay.ScanpayBean;
import org.swchalu.wxpay.scanpay.ScanpayCallback;
import org.swchalu.wxpay.utils.WXPayUtil;

/**
 * ��ʾʹ�÷��� û�����еģ�ֻ����ʾʹ�����̣�ע�������ú�WXPayContants��ز���
 * 
 * @author swchalu
 *
 */
public class TestExample {

	// һ����ҳ��Ȩ���code��ʼ
	/**
	 * ͨ��h5��ҳ�ص��õ���Ȩ��code,����Ԥ����
	 * 
	 * @param code
	 *            ��Ȩ�ص�code
	 * @param body
	 *            ��Ʒ����
	 * @param detail
	 *            ��Ʒ����
	 * @param ip
	 *            �ͻ�ip��ַ
	 * @param fee
	 *            ���׽���λ��
	 */
	public void payByH5(String code, String body, String detail, String ip,
			String fee) {
		// ֱ�����Ԥ֧���µ�
		PrepayCallback callback = Prepay.order(code, body, detail, ip, fee);
		// �������xml��������
		System.out.println("΢��֧������xml������� -> " + callback.toString());
		// ���Ԥ֧��������Prepay_id,����return_code��result_code��ΪSUCCESSʱ��ֵ
		System.out.println("Ԥ֧��������Prepay_id -> " + callback.getPrepay_id());
	}

	/**
	 * ɨ��֧����ģʽһ
	 * 
	 * @param XmlFromQR
	 *            ɨ���΢�Ŵ���֧���ص���ַ��xml�ַ���
	 * @param ip
	 *            �ͻ�ip��ַ
	 */
	public void scanpayByModeOne(String XmlFromQR, String ip) {

		// ����xmlΪbean����
		ScanpayBean bean = WXPayUtil.xml2ScanpayBean(XmlFromQR);

		// Ԥ֧���µ�����������xml,���ɷ���΢�ſͻ���֧������
		ScanpayCallback back = Scanpay.order(bean, ip);

		// ��������xml�ַ�����΢�ţ��Զ�����֧��
		String xmlStr = back.toXMLString();
		System.out.println("����Ԥ֧�������xml-> " + xmlStr);
	}
}
