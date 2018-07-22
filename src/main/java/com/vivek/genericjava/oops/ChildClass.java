package com.vivek.genericjava.oops;

public class ChildClass extends ParentClass{
	public ChildClass(){
		System.out.println("Child class constructor");
	}
	
	public void disp() {
		
		System.out.println("child display");
		super.disp();
	}
}