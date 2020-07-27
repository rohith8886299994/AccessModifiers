package Acces3;

import Acces1.FirstNormal;

public class SecondMainClass extends FirstNormal
{
public static void main(String[] args) 
{
//	FirstNormal obj = new FirstNormal();
// System.out.println(obj.i);
// System.out.println(obj.var);               ONLY IN CLASS AND IN PACKAGE DEFALUT
// 
	 FirstNormal obj2 = new FirstNormal();
	 System.out.println(obj2.i1);
	 System.out.println(obj2.var1);
	
//	 FirstNormal obj3 = new FirstNormal();
//	 System.out.println(obj3.i3);
//	 System.out.println(obj3.var3);            ONLY IN CLASS AND 
	
	

//		FirstNormal obj4 = new FirstNormal();   NO OUT SIDE PACKAGE 
//		System.out.println(obj4.i4);
//		System.out.println(obj4.var4);
	 
	 /*
	  * so for protected extend the secondmain with Firstnormal
	  * and create the seconclass objand call the var or methods ts work
	  */
	 
	 SecondMainClass jj = new  SecondMainClass();
	 System.out.println(jj.i4);
	 System.out.println(jj.var4);
}
}
