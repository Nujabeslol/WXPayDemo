package org.swchalu.wxpay.orderquery;

import org.swchalu.wxpay.common.WXPayContants;

/**
 * ΢��֧��������ѯ����ʵ����
 * 
 * @author swchalu
 *
 */
public class OrderQueryCallback {
	/** ����״̬�� */
	private String return_code;
	/** ������Ϣ */
	private String return_msg;
	/* �����ֶ���return_codeΪSUCCESS��ʱ���з��� */
	/** �����˺�ID */
	private String appid;
	/** �̻��� */
	private String mch_id;
	/** ����ַ��� */
	private String nonce_str;
	/** ǩ�� */
	private String sign;
	/** ҵ���� */
	private String result_code;
	/** ������� */
	private String err_code;
	/** ����������� */
	private String err_code_des;
	/* �����ֶ���return_code ��result_code��ΪSUCCESS��ʱ���з��� */
	/** �豸�� */
	private String device_info;
	/** �û���ʶ */
	private String openid;
	/** �Ƿ��ע�����˺� */
	private String is_subscribe;
	/** �������� */
	private String trade_type;
	/** ����״̬ */
	private String trade_state;
	/** �������� */
	private String bank_type;
	/** ������� */
	private String total_fee;
	/** Ӧ�ᶩ����� */
	private String settlement_total_fee;
	/** �������� */
	private String fee_type;
	/** �ֽ�֧����� */
	private String cash_fee;
	/** �ֽ�֧���������� */
	private String cash_fee_type;
	/** ����ȯ��� */
	private String coupon_fee;
	/** ����ȯʹ������ */
	private String coupon_count;
	/** ΢��֧�������� */
	private String transaction_id;
	/** �̻������� */
	private String out_trade_no;
	/** �������� */
	private String attach;
	/** ֧�����ʱ�� */
	private String time_end;
	/** ����״̬���� */
	private String trade_state_desc;

	/* �����ֶ���ʱ���� */
	/** ����ȯ����ID $nΪ�±꣬��0��ʼ��� */
	// private String[] coupon_batch_id_$n;
	/** ����ȯ���� CASH--��ֵ����ȯ NO_CASH---�ǳ�ֵ����ȯ */
	// private String[] coupon_type_$n;
	/** ����ȯID */
	// private String[] coupon_id_$n;
	/** ��������ȯ֧����� */
	// private String[] coupon_fee_$n;
	public String getReturn_code() {
		return return_code;
	}

	public OrderQueryCallback setReturn_code(String return_code) {
		this.return_code = return_code;
		return this;
	}

	public String getReturn_msg() {
		return return_msg;
	}

	public OrderQueryCallback setReturn_msg(String return_msg) {
		this.return_msg = return_msg;
		return this;
	}

	public String getAppid() {
		return appid;
	}

	public OrderQueryCallback setAppid(String appid) {
		this.appid = appid;
		return this;
	}

	public String getMch_id() {
		return mch_id;
	}

	public OrderQueryCallback setMch_id(String mch_id) {
		this.mch_id = mch_id;
		return this;
	}

	public String getNonce_str() {
		return nonce_str;
	}

	public OrderQueryCallback setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
		return this;
	}

	public String getSign() {
		return sign;
	}

	public OrderQueryCallback setSign(String sign) {
		this.sign = sign;
		return this;
	}

	public String getResult_code() {
		return result_code;
	}

	public OrderQueryCallback setResult_code(String result_code) {
		this.result_code = result_code;
		return this;
	}

	public String getErr_code() {
		return err_code;
	}

	public OrderQueryCallback setErr_code(String err_code) {
		this.err_code = err_code;
		return this;
	}

	public String getErr_code_des() {
		return err_code_des;
	}

	public OrderQueryCallback setErr_code_des(String err_code_des) {
		this.err_code_des = err_code_des;
		return this;
	}

	public String getDevice_info() {
		return device_info;
	}

	public OrderQueryCallback setDevice_info(String device_info) {
		this.device_info = device_info;
		return this;
	}

	public String getOpenid() {
		return openid;
	}

	public OrderQueryCallback setOpenid(String openid) {
		this.openid = openid;
		return this;
	}

	public String getIs_subscribe() {
		return is_subscribe;
	}

	public OrderQueryCallback setIs_subscribe(String is_subscribe) {
		this.is_subscribe = is_subscribe;
		return this;
	}

	public String getTrade_type() {
		return trade_type;
	}

	public OrderQueryCallback setTrade_type(String trade_type) {
		this.trade_type = trade_type;
		return this;
	}

	public String getTrade_state() {
		return trade_state;
	}

	public OrderQueryCallback setTrade_state(String trade_state) {
		this.trade_state = trade_state;
		return this;
	}

	public String getBank_type() {
		return bank_type;
	}

	public OrderQueryCallback setBank_type(String bank_type) {
		this.bank_type = bank_type;
		return this;
	}

	public String getTotal_fee() {
		return total_fee;
	}

	public OrderQueryCallback setTotal_fee(String total_fee) {
		this.total_fee = total_fee;
		return this;
	}

	public String getSettlement_total_fee() {
		return settlement_total_fee;
	}

	public OrderQueryCallback setSettlement_total_fee(
			String settlement_total_fee) {
		this.settlement_total_fee = settlement_total_fee;
		return this;
	}

	public String getFee_type() {
		return fee_type;
	}

	public OrderQueryCallback setFee_type(String fee_type) {
		this.fee_type = fee_type;
		return this;
	}

	public String getCash_fee() {
		return cash_fee;
	}

	public OrderQueryCallback setCash_fee(String cash_fee) {
		this.cash_fee = cash_fee;
		return this;
	}

	public String getCash_fee_type() {
		return cash_fee_type;
	}

	public OrderQueryCallback setCash_fee_type(String cash_fee_type) {
		this.cash_fee_type = cash_fee_type;
		return this;
	}

	public String getCoupon_fee() {
		return coupon_fee;
	}

	public OrderQueryCallback setCoupon_fee(String coupon_fee) {
		this.coupon_fee = coupon_fee;
		return this;
	}

	public String getCoupon_count() {
		return coupon_count;
	}

	public OrderQueryCallback setCoupon_count(String coupon_count) {
		this.coupon_count = coupon_count;
		return this;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public OrderQueryCallback setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
		return this;
	}

	public String getOut_trade_no() {
		return out_trade_no;
	}

	public OrderQueryCallback setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
		return this;
	}

	public String getAttach() {
		return attach;
	}

	public OrderQueryCallback setAttach(String attach) {
		this.attach = attach;
		return this;
	}

	public String getTime_end() {
		return time_end;
	}

	public OrderQueryCallback setTime_end(String time_end) {
		this.time_end = time_end;
		return this;
	}

	public String getTrade_state_desc() {
		return trade_state_desc;
	}

	public OrderQueryCallback setTrade_state_desc(String trade_state_desc) {
		this.trade_state_desc = trade_state_desc;
		return this;
	}

	public String toString() {
		StringBuffer out = new StringBuffer("");
		out.append(OrderQueryCallback.class.getName() + "[ ");
		if (getReturn_code() != null)
			out.append("return_code=" + getReturn_code() + "; ");
		if (getReturn_msg() != null)
			out.append("return_msg=" + getReturn_msg() + "; ");
		if (getReturn_code().equals(WXPayContants.SUCCESS)) {
			if (getAppid() != null)
				out.append("appid=" + getAppid() + "; ");
			if (getMch_id() != null)
				out.append("mch_id=" + getMch_id() + "; ");
			if (getNonce_str() != null)
				out.append("nonce_str=" + getNonce_str() + "; ");
			if (getSign() != null)
				out.append("sign=" + getSign() + "; ");
			if (getResult_code() != null)
				out.append("result_code=" + getResult_code() + "; ");
			if (getErr_code() != null)
				out.append("err_code=" + getErr_code() + "; ");
			if (getErr_code_des() != null)
				out.append("err_code_des=" + getErr_code_des() + "; ");
			if (getResult_code().equals(WXPayContants.SUCCESS)) {
				if (getDevice_info() != null)
					out.append("device_info=" + getDevice_info() + "; ");
				if (getOpenid() != null)
					out.append("openid=" + getOpenid() + "; ");
				if (getIs_subscribe() != null)
					out.append("is_subscribe=" + getIs_subscribe() + "; ");
				if (getTrade_type() != null)
					out.append("trade_type=" + getTrade_type() + "; ");
				if (getTrade_state() != null)
					out.append("trade_state=" + getTrade_state() + "; ");
				if (getBank_type() != null)
					out.append("bank_type=" + getBank_type() + "; ");
				if (getTotal_fee() != null)
					out.append("total_fee=" + getTotal_fee() + "; ");
				if (getSettlement_total_fee() != null)
					out.append("settlement_total_fee="
							+ getSettlement_total_fee() + "; ");
				if (getFee_type() != null)
					out.append("fee_type=" + getFee_type() + "; ");
				if (getCash_fee() != null)
					out.append("cash_fee=" + getCash_fee() + "; ");
				if (getCash_fee_type() != null)
					out.append("cash_fee_type=" + getCash_fee_type() + "; ");
				if (getCoupon_fee() != null)
					out.append("coupon_fee=" + getCoupon_fee() + "; ");
				if (getCoupon_count() != null)
					out.append("coupon_count=" + getCoupon_count() + "; ");
				if (getTransaction_id() != null)
					out.append("transaction_id=" + getTransaction_id() + "; ");
				if (getOut_trade_no() != null)
					out.append("out_trade_no=" + getOut_trade_no() + "; ");
				if (getAttach() != null)
					out.append("attach=" + getAttach() + "; ");
				if (getTime_end() != null)
					out.append("time_end=" + getTime_end() + "; ");
				if (getTrade_state_desc() != null)
					out.append("trade_state_desc=" + getTrade_state_desc()
							+ "; ");

			}
		}
		out.append(" ]");

		return out.toString();
	}
}
