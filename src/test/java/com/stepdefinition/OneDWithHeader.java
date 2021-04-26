package com.stepdefinition;

import java.util.LinkedHashMap;
import java.util.Map;

public class OneDWithHeader {
	public static void main(String[] args) {
		Map<String,String>m=new LinkedHashMap<String,String>();
		m.put("Name", "Indhu");
		m.put("email", "indhu@gmail.com");
		m.put("ph", "1234567909");
		System.out.println(m);
		System.out.println(m.get("Name"));
	}
}
