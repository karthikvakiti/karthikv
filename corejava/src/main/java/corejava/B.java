package corejava;

 class A {
	int c=10;
	static int b;
	static {
		b=30;
		System.out.println("A class static block");
		System.out.println("B value is:="+A.b);
	}

	public static void show() {
	B b = new B();
	b.getData();
	System.out.println("D value is:="+b.d);
	System.out.println("E value is:="+B.e);
	B.disp();
	}
	
	public void display() {
		System.out.println("C value is:="+c);
		System.out.println("B value is:="+A.b);
		System.out.println("E value is:="+B.e);
	}
}
public class B {

		// TODO Auto-generated method stub
	int d=40;
	static int e=20;
	
	public void getData() {
		System.out.println("D value is:="+d);
		System.out.println("E value is:="+e);
	}
	
    public static void disp() {
    	System.out.println("The static block Method");
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		a.display();
		System.out.println("C value is:="+a.c);
		A.show();
		System.out.println("B value is:="+A.b);
		/////////////
		B b = new B();
		b.getData();
		B.disp();
	}
	
 static {
     System.out.println(" static block");
       }
}

