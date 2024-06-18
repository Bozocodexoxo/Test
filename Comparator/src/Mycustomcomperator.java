package com.interview;

import java.util.Comparator;

public class Mycustomcomperator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
	
		return o2.edoj.compareTo(o1.edoj);
	}
	

}
