package com.vivek.genericjava;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({ 
   FixtureTest1.class ,FixtureTest2.class
})

public class TestSuite1 {
}