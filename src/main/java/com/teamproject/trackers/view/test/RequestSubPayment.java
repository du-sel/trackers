package com.teamproject.trackers.view.test;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.google.gson.Gson;


import lombok.Setter;

@Service
public class RequestSubPayment {

	/*
	@Autowired
	private ImportPay pay;

	public String requestSubPay() {
		System.out.println("RequestSubPayment - requestSubPay() 실행");

		String token = pay.getToken();
		Gson str = new Gson();
		token = token.substring(token.indexOf("response") + 10);
		token = token.substring(0, token.length() - 1);

		GetTokenVO vo = str.fromJson(token, GetTokenVO.class);

		String access_token = vo.getAccess_token();
		System.out.println(access_token);

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization", access_token);

		Map<String, Object> map = new HashMap<>();
		map.put("customer_uid", "24");
		map.put("merchant_uid", "162443471100");
		map.put("amount", "10000");
		map.put("name", "test05");

		Gson var = new Gson();
		String json = var.toJson(map);
		System.out.println(json);
		HttpEntity<String> entity = new HttpEntity<>(json, headers);
		
		return restTemplate.postForObject("https://api.iamport.kr/subscribe/payments/again", entity, String.class);

	}
	*/

}
