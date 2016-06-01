package org.swchalu.wxpay.common;

public class WXPayContants {
	/**
	 * �����˺�ID ΢�ŷ���Ĺ����˺�ID����ҵ��corpid��Ϊ��appId��
	 */
	private static String appid = "";
	/**
	 * �̻��� ΢��֧��������̻���
	 */
	private static String mch_id = "";
	/**
	 * �豸�� �ն��豸��(�ŵ�Ż������豸ID)��ע�⣺PC��ҳ���ں���֧���봫"WEB"
	 */
	public static String device_info_web = "WEB";
	/**
	 * �������� �������ݣ��ڲ�ѯAPI��֧��֪ͨ��ԭ�����أ����ֶ���Ҫ�����̻�Я���������Զ�������
	 */
	private static String attach = "";
	/**
	 * �������� ����ISO 4217��׼����λ��ĸ���룬Ĭ������ң�CNY
	 */
	private static String fee_type = "CNY";
	/**
	 * ֪ͨ��ַ ����΢��֧���첽֪ͨ�ص���ַ��֪ͨurl����Ϊֱ�ӿɷ��ʵ�url������Я��������
	 */
	private static String notify_url = "";
	/**
	 * �������� ȡֵ���£�JSAPI��NATIVE��APP
	 */
	public static String trade_type_jsapi = "JSAPI";
	public static String trade_type_native = "NATIVE";
	public static String trade_type_app = "APP";
	/**
	 * ��ƷID trade_type=NATIVE���˲����ش�����idΪ��ά���а�������ƷID���̻����ж��塣
	 */
	private static String product_id;
	/**
	 * ָ��֧����ʽ no_credit--ָ������ʹ�����ÿ�֧��
	 */
	private static String limit_pay;
	/**
	 * ΢��Ԥ֧���µ��ӿ�
	 */
	private static String prepay_url = "https://api.mch.weixin.qq.com/pay/unifiedorder";
	/**
	 * ΢�ſ���AppSecret(Ӧ����Կ)
	 */
	private static String secret = "";
	/**
	 * ΢���̻�ƽ̨���õ�key
	 */
	private static String key = "";

	public static String FAIL = "FAIL";
	public static String SUCCESS = "SUCCESS";

	/**
	 * ��ù����˺�ID
	 * 
	 * @return String
	 */
	public static String getAppid() {
		return appid;
	}

	/**
	 * ����̻���
	 * 
	 * @return String
	 */
	public static String getMch_id() {
		return mch_id;
	}

	/**
	 * ��ø�������
	 * 
	 * @return String
	 */
	public static String getAttach() {
		return attach;
	}

	/**
	 * ��û�������
	 * 
	 * @return String
	 */
	public static String getFee_type() {
		return fee_type;
	}

	/**
	 * ���֪ͨ��ַ
	 * 
	 * @return String
	 */
	public static String getNotify_url() {
		return notify_url;
	}

	/**
	 * �����ƷID
	 * 
	 * @return String
	 */
	public static String getProduct_id() {
		return product_id;
	}

	/**
	 * ���ָ��֧����ʽ
	 * 
	 * @return String
	 */
	public static String getLimit_pay() {
		return limit_pay;
	}

	public static String getSecret() {
		return secret;
	}

	public static String getPrepay_url() {
		return prepay_url;
	}

	public static String getKey() {
		return key;
	}
}
