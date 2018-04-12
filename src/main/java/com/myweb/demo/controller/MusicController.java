package com.myweb.demo.controller;

import java.util.HashMap;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.myweb.demo.domain.Comment;

@RestController
public class MusicController {

	@Autowired  
    private RestTemplate restTemplate;
	
	@RequestMapping(value = "/get/music/list/{id}", method = RequestMethod.GET)
	public Object getMusicList(@PathVariable("id") String id) {
//		String url = "http://music.163.com/api/playlist/detail?id=2092846544&updateTime=-1";
		String url = "https://api.hibai.cn/api/index/index";
		HttpHeaders headers = new HttpHeaders();
//		headers.set("Referer","http://music.163.com/");
//        headers.set("appver","1.5.2");
        headers.set("Content-Type", "application/json");
        HttpEntity<JSONObject> entity = new HttpEntity<JSONObject>(headers); 
        HttpEntity<Object> response = restTemplate.exchange(  
        		url, HttpMethod.GET, entity, Object.class);
        System.out.println(response);
        return response;
    }
}
