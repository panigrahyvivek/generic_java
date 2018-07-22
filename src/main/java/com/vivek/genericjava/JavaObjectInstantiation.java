package com.vivek.genericjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Sample classes
class A {
	int a;
}

class B {
	int b;
}

public class JavaObjectInstantiation {
	public static void fun(String c) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Object obj = Class.forName(c).newInstance();

		System.out.println("Object created for class:" + obj.getClass().getName());
	}

	// Driver code that calls main()
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		fun("A");
	}
}