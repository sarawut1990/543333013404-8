package com.rmuti.Array;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayListQueue aq = new ArrayListQueue();
		aq.enQueue("111");
		aq.enQueue("222");
		aq.enQueue("333");
		aq.enQueue("444");
		aq.enQueue("555");

		System.out.println(aq);
		aq.deQueue();

		System.out.println(aq);
		System.out.println(aq.peek());

		System.out.println("*********************************************");
		ArrayList arr = new ArrayList();
		arr.add("1");
		System.out.println(arr);
		arr.add("2");
		System.out.println(arr);
		arr.add("3");
		System.out.println(arr);
		arr.add(2, "4");
		System.out.println(arr);
	}
}