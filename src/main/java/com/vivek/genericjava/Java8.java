package com.vivek.genericjava;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 *  In programming, a Lambda expression (or function) is just an anonymous function, 
 *  i.e., a function with no name and without being bounded to an identifier.
 */

public class Java8 {
	
	private static Logger log = LoggerFactory.getLogger(Java8.class);

	public static void main(String args[]) {
		List<String> items = new ArrayList<String>();
		
		items.add("hello");
		items.add("hell");
		items.add("world");
		items.add("he");
		
		String prefix = "he";
		
		log.info("Items: "+items);
		List<String> filteredItems = items.stream().filter(e -> !e.startsWith(prefix)).collect(Collectors.toList());
		log.info("Filtered Items: "+ filteredItems);
		
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/Chicago"));
		
		log.info(""+zonedDateTime);
		
		//Functional Interface
		new Thread(() -> {log.info("Thread Started");} ).start();
		
	
		Predicate<String> p = (s) -> s.startsWith("h");
		
		for(String st: items) {
			if(p.test(st)) {
				log.info(st);
			}
		}
		
		
	}
 }
