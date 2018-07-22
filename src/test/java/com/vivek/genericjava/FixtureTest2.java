package com.vivek.genericjava;

import junit.framework.*;

public class FixtureTest2 extends TestCase {
   protected int value1, value2;
   
   // assigning the values
   protected void setUp(){
      value1 = 2;
      value2 = 3;
   }

   // test method to add two values
   public void testAdd(){
      double result = value1 + value2;
      assertTrue(result == 5);
   }
}