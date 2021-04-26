package com.stepdefinition;

import java.util.LinkedList;
import java.util.List;

public class TwoDWithouHeader {
	public static void main(String[] args) {
		List<LinkedList<String>>m=new LinkedList<>();
		LinkedList<String>n=new LinkedList<String>();
		n.add("Indhu");
		n.add("Dharani");
		n.add("NiVi");
		n.add("Deepika");
		n.add("Anusuya");
		n.add("Pavi");
		LinkedList<String>n1=new LinkedList<String>();
		n1.add("1");
		n1.add("2");
		n1.add("3");
		n1.add("4");
		n1.add("5");
		LinkedList<String>n2=new LinkedList<String>();
		n2.add("a");
		n2.add("b");
		n2.add("c");
		n2.add("d");
		n2.add("e");
		m.add(n);
		m.add(n1);
		m.add(n2);
		for (int i = 0; i < m.size(); i++) {
			LinkedList<String> list = m.get(i);
			System.out.println(list);
			for (int j = 0; j <list.size(); j++) {
				String string = list.get(j);
				System.out.println(string);
			}
		}

	}
}
