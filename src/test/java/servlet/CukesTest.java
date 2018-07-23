package servlet;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({login_junit.class,createpage_junit.class})
public class CukesTest {
	 public static void main(String[] args){
		 System.out.println("Processing CukesTest.java");
	 }
}
