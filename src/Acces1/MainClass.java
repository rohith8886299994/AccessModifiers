package Acces1;

public class MainClass {
	public static void main(String[] args) {
		FirstNormal obj = new FirstNormal();
		 System.out.println(obj.i);
		 System.out.println(obj.var);
		 
		 FirstNormal obj2 = new FirstNormal();
		 System.out.println(obj2.i1);
		 System.out.println(obj2.var1);
		 
//		 FirstNormal obj3 = new FirstNormal();
//		 obj3.setQ(6);
//		 System.out.println(obj3.getQ());     ONLY IN SAME CLASS PRIVATE .. NO PACK AND OUT CLASS
		 
		 
		 
		FirstNormal obj4 = new FirstNormal();
		System.out.println(obj4.i4);
		System.out.println(obj4.var4);
;

System.out.println(obj.getHours());
		
	}

}
