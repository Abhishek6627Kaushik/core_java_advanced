package com.lara;

import java.util.TreeSet;

public class M9 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(100);
		set.add(10);
		set.add(900);
		set.add(120);
		set.add(140);
		set.add(20);
		set.add(120);
		set.add(90);
		System.out.println(set);
		System.out.println(set.headSet(100, true));
	}
}
