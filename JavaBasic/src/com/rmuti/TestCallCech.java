package com.rmuti;

import java.util.Arrays;

public class TestCallCech {

	public static void main(String[] args) {
		PeterCech peterCech = new PeterCech();
		System.out.println("Name : "+peterCech.getName());
		System.out.println("Position : "+peterCech.getPosition());
		System.out.println("Friend : "+Arrays.toString(peterCech.getFriend()));
		peterCech = new PeterCech(1);
	}
}
