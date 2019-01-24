import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Test {
	
	public static void m1() throws Exception{
		int x=9,y=0;
		try {
			
			int z=x/y;
		}
		catch(ArithmeticException e) {
		//	e.printStackTrace();
			m2();
			throw new Exception("new expe",e);
		
		}
		finally {
			System.out.println("Iam finally block");
		}
	}
	public static void m2() throws Exception {
		
		try {
			//System.exit(0);
			
		}
		
		finally {
			System.out.println("Iam finally block22");
		}
	}

	public static void main(String[] args) throws Exception {
		
		try {
		Test.m1();
		}
		catch(Exception e) {
		  e.printStackTrace();
			System.out.println("main");
		}
		
		
	}

}
