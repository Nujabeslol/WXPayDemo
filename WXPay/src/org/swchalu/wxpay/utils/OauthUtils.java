package org.swchalu.wxpay.utils;

import org.apache.http.impl.client.DefaultHttpClient;
import org.swchalu.wxpay.bean.AccessToken;
import org.swchalu.wxpay.common.WXPayContants;

import com.alibaba.fastjson.JSON;

public class OauthUtils {

	/**
	 * ͨ����Ȩ�õ���code��ȡtoken��json�ַ���
	 * 
	 * @param code
	 * @return
	 */
	public static JSON getTokenJson(String code) {
		JSON json = null;
		DefaultHttpClient client = new DefaultHttpClient();
		String tokenStr = HttpClientHelper.doGet(
				client,
				"https://api.weixin.qq.com/sns/oauth2/access_token?appid="
						+ WXPayContants.getAppid() + "&secret="
						+ WXPayContants.getSecret() + "&code=" + code
						+ "&grant_type=authorization_code", "");

		System.out.println(tokenStr);
		json = (JSON) JSON.parse(tokenStr);
		return json;
	}

	/**
	 * ͨ��token��json�ַ���ת����
	 * 
	 * @param code
	 * @return
	 */
	public static AccessToken getAccessToken(String code) {
		AccessToken at = null;
		JSON json = getTokenJson(code);
		if (json != null) {
			at = JSON.toJavaObject(json, AccessToken.class);
		}
		System.out.println(at.toString());
		return at;
	}

}
