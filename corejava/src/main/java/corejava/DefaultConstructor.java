package corejava;

  class Example {
	private int a;
	private String b;
	private float c;

//	DefaultConstructor() {
//		
//	}
	
//DefaultConstructor() {
//	a=10;
//	b="karthik";
//	c=45.0F;
//	}
	
//DefaultConstructor(int eid,String ename,float c) {
//		a=eid;
//		b=ename;
//		this.c=c;
//	}
	Example(int a,String b,float c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
public int getA() {
	return a;
}
public String getName() {
	return b;
}
public float getF() {
	return c;
}
}
 
public class DefaultConstructor {
    public static void main(String[] args) {
    	Example ks = new Example(22,"karthik",23.0F);
		int a=ks.getA();
		String b=ks.getName();
		float c=ks.getF();
		System.out.println("The value of A is:=" +a);
		System.out.println("The value of B is:=" + b);
		System.out.println("The value of C is:=" + c);

	}
}
