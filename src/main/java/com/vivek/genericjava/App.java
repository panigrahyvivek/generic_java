package com.vivek.genericjava;

import com.vivek.genericjava.oops.ChildClass;

public class App{
  public static void main(String[] args) {
    
	//Hello World  
	for(int i=0;i<2;i++){
      System.out.println("Hello World"+i);
    }
    
	// Singleton Class  
	Singleton x = Singleton.getInstance();
	Singleton y = Singleton.getInstance();
	
	y.s = "Hello Vivek!";
	
	System.out.println(x.s);
	System.out.println(y.s);
	
	//Data Structures
	DataStructures d = new DataStructures();
	d.showArrayList();
	d.showLinkedList();
	d.showHashSet();
	d.showTreeSet();
	d.showHashMap();
	d.showTreeeMap();
	
	
	//staticvariable
	
	System.out.println(staticvariable.var1); // Accessing Static variable without Instantiating
	staticvariable obj = new staticvariable(); 
	System.out.println(obj.var2); 
	System.out.println(obj.getVar3()); 
	
	obj.var1 = "New Static String";
	System.out.println(staticvariable.var1);
	
	
	//Inheritence
	
	ChildClass c = new ChildClass();
	c.disp();
	
	
	
  }
}
