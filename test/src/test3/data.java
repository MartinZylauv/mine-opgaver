package test3;

import java.util.ArrayList;

import test2.domæne;

public class data {
String input;
	
public void lavData(String input){
	ArrayList test = new ArrayList();
	test.add("2");
	test.add("2");
	test.add("3");
	data2 dat2 = new data2();
	input = dat2.compareData(test);
	this.input=input;
	
	
	
}

public String returnerdata(){
	return input;
	
}
}
