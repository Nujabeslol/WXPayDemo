package org.swchalu.wxpay.orderquery;

/**
 * ΢��֧��������ѯʵ����
 * 
 * @author swchalu
 *
 */
public class OrderQueryBean {
	/** �����˺�ID */
	private String appid;
	/** �̻��� */
	private String mch_id;
	/** ΢�Ŷ�����(1/2ѡ1) */
	private String transaction_id;
	/** �̻�������(2/2ѡ1) */
	private String out_trade_no;
	/** ����ַ��� */
	private String nonce_str;
	/** ǩ�� */
	private String sign;

	public String getAppid() {
		return appid;
	}

	public OrderQueryBean setAppid(String appid) {
		this.appid = appid;
		return this;
	}

	public String getMch_id() {
		return mch_id;
	}

	public OrderQueryBean setMch_id(String mch_id) {
		this.mch_id = mch_id;
		return this;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public OrderQueryBean setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
		return this;
	}

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public OrderQueryBean setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
		return this;
	}

	public String getNonce_str() {
		return nonce_str;
	}

	public OrderQueryBean setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
		return this;
	}

	public String getSign() {
		return sign;
	}

	public OrderQueryBean setSign(String sign) {
		this.sign = sign;
		return this;
	}

	public String toString() {
		StringBuffer out = new StringBuffer("");
		// getAppid
		if (getAppid() != null && getAppid().length() > 0)
			out.append(out.length() > 0 ? "&appid=" + getAppid() : "appid="
					+ getAppid());
		// getMch_id
		if (getMch_id() != null && getMch_id().length() > 0)
			out.append(out.length() > 0 ? "&mch_id=" + getMch_id() : "mch_id="
					+ getMch_id());
		// getNonce_str()
		if (getNonce_str() != null && getNonce_str().length() > 0)
			out.append(out.length() > 0 ? "&nonce_str=" + getNonce_str()
					: "nonce_str=" + getNonce_str());
		// getTransaction_id()
		if (getTransaction_id() != null && getTransaction_id().length() > 0) {
			out.append(out.length() > 0 ? "&transaction_id="
					+ getTransaction_id() : "transaction_id="
					+ getTransaction_id());
		} else if (getOut_trade_no() != null && getOut_trade_no().length() > 0) {
			// getOut_trade_no()
			out.append(out.length() > 0 ? "&out_trade_no=" + getOut_trade_no()
					: "out_trade_no=" + getOut_trade_no());
		}
		return out.toString();
	}

	public String toXMLString() {
		StringBuffer out = new StringBuffer("");
		out.append("<xml>");
		// getAppid
		if (getAppid() != null && getAppid().length() > 0)
			out.append("<appid>" + getAppid() + "</appid>");
		// getMch_id
		if (getMch_id() != null && getMch_id().length() > 0)
			out.append("<mch_id>" + getMch_id() + "</mch_id>");
		// getNonce_str
		if (getNonce_str() != null && getNonce_str().length() > 0)
			out.append("<nonce_str>" + getNonce_str() + "</nonce_str>");
		// getTransaction_id()
		if (getTransaction_id() != null && getTransaction_id().length() > 0) {
			out.append("<transaction_id>" + getTransaction_id()
					+ "</transaction_id>");
		} else if (getOut_trade_no() != null && getOut_trade_no().length() > 0) {
			// getOut_trade_no()
			out.append("<out_trade_no>" + getOut_trade_no() + "</out_trade_no>");
		}
		// getSign
		if (getSign() != null && getSign().length() > 0)
			out.append("<sign>" + getSign() + "</sign>");

		out.append("</xml>");
		return out.toString();
	}
}
