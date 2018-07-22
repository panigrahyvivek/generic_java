package com.vivek.genericjava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * A thread is a lightweight process which has its own call stack, 
 * but can access shared data of other threads in the same process. 
 * A Java application runs by default in one process. Within a Java application 
 * you can work with many threads to achieve parallel processing or concurrency.
 */



class RunnableDemo implements Runnable {
	private static Logger log = LoggerFactory.getLogger(RunnableDemo.class);

	Thread t;
	String threadName;

	public RunnableDemo(String name) {
		this.threadName = name;
		log.info("Thread " + threadName + " created.");
	}

	@Override
	public void run() {
		try {
			for (int i = 4; i > 0; i--) {
				log.info("Running thread: " + threadName + " " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			log.info(e.getMessage());
			e.printStackTrace();
		}
		

	}

	public void start(int priority) {
		log.info("Starting thread: " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.setPriority(priority);
			t.start();
		}
	}
}

public class ThreadsFun {
	private static Logger log = LoggerFactory.getLogger(ThreadsFun.class);

	public static void main(String args[]) {
		log.info("Hello World!");

		RunnableDemo r1 = new RunnableDemo("Thread1");
		r1.start(1);
		RunnableDemo r2 = new RunnableDemo("Thread2");
		r2.start(10);

	}
}