package com.stepdefinition;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TwoDWithHeader {
	public static void main(String[] args) {
		LinkedList<Map<String,String>>m=new LinkedList<>();
		Map<String,String>n=new HashMap<>();
		n.put("Name", "Indhu");
		n.put("email", "Indhu@gmail.com");
		n.put("phone", "9076543210");
		Map<String,String>n1=new LinkedHashMap<>();
		n1.put("Name", "Nila");
		n1.put("email", "Nila@gmail.com");
		n1.put("phone", "1234565432");
		Map<String,String>n2=new Hashtable<>();
		n2.put("Name", "Kochadi");
		n2.put("email", "Kochadi@gmail.com");
		n2.put("phone", "1234554321");
		
		System.out.println(m.add(n));
		System.out.println(m.add(n1));
		System.out.println(m.add(n2));
//		
//		Map<String, String> map = m.get(1);
//		System.out.println(map);
//		String string = map.get("Name");
//		System.out.println(string);
		
		for (int i = 0; i < m.size(); i++) {
			Map<String, String> map2 = m.get(i);
			System.out.println(map2);
			Set<Entry<String, String>> entrySet = map2.entrySet();
			for (Entry<String, String> entry : entrySet) {
				String key = entry.getKey();
				System.out.println(key);
				String value = entry.getValue();
				System.out.println(value);
			}
			
		}
	}
}
