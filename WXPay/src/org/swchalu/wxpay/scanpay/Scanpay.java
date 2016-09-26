package org.swchalu.wxpay.scanpay;

import org.swchalu.wxpay.common.WXPayContants;
import org.swchalu.wxpay.prepay.Prepay;
import org.swchalu.wxpay.prepay.PrepayCallback;
import org.swchalu.wxpay.utils.WXPayUtil;

/**
 * ɨ��֧��
 * 
 * @author swchalu
 *
 */
public class Scanpay {

	/**
	 * ɨ��֧���µ�
	 * 
	 * @param bean
	 * @param ip
	 * @return
	 */
	public static ScanpayCallback order(ScanpayBean bean, String ip) {

		ScanpayCallback back = new ScanpayCallback();

		// ��֤ǩ���Ƿ���ȷ
		boolean isVaild = WXPayUtil.validSign(bean.toString(), bean.getSign());
		System.out.println("��֤sign�Ƿ���ȷ,��֤��[ " + bean.toString() + " ],��֤���[ "
				+ isVaild + " ]");
		if (!isVaild) {
			back.setReturn_code(WXPayContants.FAIL).setReturn_msg("ǩ��ʧ��");
			return back;
		}

		// ��֤ͨ���������������
		back.setReturn_code(WXPayContants.SUCCESS)
				.setAppid(WXPayContants.getAppid())
				.setMch_id(WXPayContants.getMch_id())
				.setNonce_str(WXPayUtil.getNonceStr());

		String product_id = bean.getProduct_id();
		// ����product_id�����Ծ���������Ʒ����
		String body = "΢��ɨ��֧������";
		String detail = "΢��ɨ��֧��������ϸ";
		String fee = "1";

		// ��֤��ά�����
		if (!bean.getAppid().equals(WXPayContants.getAppid())) {
			back.setResult_code(WXPayContants.FAIL).setErr_code_des("�����˺�ID����");
			back.setSign(WXPayUtil.sign(back.toParamStr()));
			return back;
		}

		if (!bean.getMch_id().equals(WXPayContants.getMch_id())) {
			back.setResult_code(WXPayContants.FAIL).setErr_code_des("�̻��Ų���");
			back.setSign(WXPayUtil.sign(back.toParamStr()));
			return back;
		}

		// ����ͳһ�µ�
		PrepayCallback prepayCallback = Prepay.scanOrder(bean.getOpenid(),
				body, detail, ip, fee);

		// ������������
		// �������˴���ʶ��
		if (prepayCallback.getReturn_code().equals(WXPayContants.FAIL)) {
			back.setResult_code(WXPayContants.FAIL)
					.setErr_code_des("�̻�������ǩ��ʧ��");
			back.setSign(WXPayUtil.sign(back.toParamStr()));
			return back;
		}

		// ͳһ�µ����ش���ʶ��
		if (prepayCallback.getResult_code().equals(WXPayContants.FAIL)) {
			back.setResult_code(WXPayContants.FAIL).setErr_code_des(
					prepayCallback.getErr_code_des());
			back.setSign(WXPayUtil.sign(back.toParamStr()));
			return back;
		}

		// ����Ԥ֧��������
		back.setPrepay_id(prepayCallback.getPrepay_id());
		back.setResult_code(WXPayContants.SUCCESS);
		back.setSign(WXPayUtil.sign(back.toParamStr()));

		return back;
	}
}
