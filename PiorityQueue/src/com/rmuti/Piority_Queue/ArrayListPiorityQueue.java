package com.rmuti.Piority_Queue;

import java.util.ArrayList;

public class ArrayListPiorityQueue {

	ArrayList<Object> lst = new ArrayList<Object>();
	public void enQueue(Object e) {
		lst.add(e);
	}
	public Object deQueue() {	
		Object a = lst.get(maxIndex());
		lst.remove(maxIndex());
		return a;
	}
	private int maxIndex() {
	       int max = 0;
	       for (int i = 0; i < lst.size(); i++) {
	                 Comparable<Object> d = (Comparable<Object>) lst.get(i);
	                 Object maxObj = lst.get(max);
	                 if (d.compareTo(maxObj) > 0) {
	                            max = i;
	                 }
	       }
	       return max;
	}
}