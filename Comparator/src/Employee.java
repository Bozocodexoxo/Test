package com.interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
int eid;
String ename;
Date edoj;

public Employee(int eid, String ename, String i) throws ParseException{
	super();
	this.eid = eid;
	this.ename = ename;
    this.edoj = new SimpleDateFormat("yyyy-MM-dd").parse(i);
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Date getEdoj() {
	return edoj;
}
public void setEdoj(Date edoj) {
	this.edoj = edoj;
}

}
