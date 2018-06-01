
package com.sbiloans.bikeloan;

public class FirstClass implements withdrawl  {
	int a=1,b=2, result=0;
	public void addition() {
		result=a+b;
	System.out.println("addition of a&b is:"+result);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass obj=new FirstClass();
		obj.addition();
		obj.rbi();
		
	}

	@Override
	public void rbi() {
		// TODO Auto-generated method stub
		
	System.out.println("rbi override in withdrawl method");
	}

}
