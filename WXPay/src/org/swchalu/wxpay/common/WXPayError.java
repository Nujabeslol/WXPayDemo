package org.swchalu.wxpay.common;

public class WXPayError {
	/** �̻��޴˽ӿ�Ȩ�� */
	public static final String NOAUTH = "NOAUTH";
	/** ���� */
	public static final String NOTENOUGH = "NOTENOUGH";
	/** �̻�������֧�� */
	public static final String ORDERPAID = "ORDERPAID";
	/** �����ѹر� */
	public static final String ORDERCLOSED = "ORDERCLOSED";
	/** ϵͳ���� */
	public static final String SYSTEMERROR = "SYSTEMERROR";
	/** APPID������ */
	public static final String APPID_NOT_EXIST = "APPID_NOT_EXIST";
	/** MCHID������ */
	public static final String MCHID_NOT_EXIST = "MCHID_NOT_EXIST";
	/** appid��mch_id��ƥ�� */
	public static final String APPID_MCHID_NOT_MATCH = "APPID_MCHID_NOT_MATCH";
	/** ȱ�ٲ��� */
	public static final String LACK_PARAMS = "LACK_PARAMS";
	/** �̻��������ظ� */
	public static final String OUT_TRADE_NO_USED = "OUT_TRADE_NO_USED";
	/** ǩ������ */
	public static final String SIGNERROR = "SIGNERROR";
	/** XML��ʽ���� */
	public static final String XML_FORMAT_ERROR = "XML_FORMAT_ERROR";
	/** ��ʹ��post���� */
	public static final String REQUIRE_POST_METHOD = "REQUIRE_POST_METHOD";
	/** post����Ϊ�� */
	public static final String POST_DATA_EMPTY = "POST_DATA_EMPTY";
	/** �����ʽ���� */
	public static final String NOT_UTF8 = "NOT_UTF8";
	/** ����״̬-֧���ɹ� */
	public static final String TRADE_STATE_SUCCESS = "SUCCESS";
	/** ����״̬��ת���˿� */
	public static final String TRADE_STATE_REFUND = "REFUND";
	/** ����״̬��δ֧�� */
	public static final String TRADE_STATE_NOTPAY = "NOTPAY";
	/** ����״̬���ѹر� */
	public static final String TRADE_STATE_CLOSED = "CLOSED";
	/** ����״̬���ѳ�����ˢ��֧���� */
	public static final String TRADE_STATE_REVOKED = "REVOKED";
	/** ����״̬���û�֧���� */
	public static final String TRADE_STATE_USERPAYING = "USERPAYING";
	/** ����״̬��֧��ʧ��(����ԭ�������з���ʧ��) */
	public static final String TRADE_STATE_PAYERROR = "PAYERROR";

}
