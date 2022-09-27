package com.runnerclass;

import com.BaseClass.Pojo_A;

public class Pojo_B {
	
	public static void main(String[] args) {

		Pojo_A a = new Pojo_A();
		
		String name = a.getName();
		System.out.println(name);
		
		a.setName("James");
		
		String name2 = a.getName();
		System.out.println(name2);
	}
	

}
