package com.interview;
import java.util.List;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

public class Experienceemp {

	public static void main(String[] args) throws ParseException {
		
List<Employee>myemp=new ArrayList<Employee>();
myemp.add(new Employee(1, "vamshi","27-06-2016" ));
myemp.add(new Employee(2, "santhos","16-10-2017" ));
myemp.add(new Employee(3, "tharun","2-03-2018" ));
myemp.add(new Employee(4, "sai ganesh","27-9-2014" ));

Collections.sort(myemp,new Mycustomcomperator());
for(Employee my:myemp) {
	System.out.println(my.getEname());
}
	}

}
