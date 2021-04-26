package com.stepdefinition;

import java.util.LinkedList;
import java.util.List;

public class OneDWithoutHeader {
	public static void main(String[] args) {
		List<String>m=new LinkedList<String>();
		m.add("Indhu");
		m.add("dharani");
		m.add("nirmala");
		m.add("chandra");
		m.add("sathya");
		m.add("nila");
		for (int i = 0; i < m.size(); i++) {
			System.out.println(m.get(i));
		}
		System.out.println(m.get(1));
		System.out.println(m.get(5));
	}
}
