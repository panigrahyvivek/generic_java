package com.vivek.genericjava;

import java.util.Collection;
import java.util.Iterator;

public class CollectionUtil{
	public static void outputToConsole(Collection collection) {
		Iterator it = collection.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}