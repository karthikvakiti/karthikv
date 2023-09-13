package corejava;

public class Hello {
	static Hello h;
	int id=10;
  	String name="kk";
  	static String company_name;
  	static {
  		company_name="TCS";
  		System.out.println("It is static block");
  		System.out.println("The Company_Name:="+company_name);
  	}
	
	public void getId() {
		System.out.println("The ID is:="+id);
		System.out.println("The Name is:="+name);
		System.out.println("The Company_Name:="+company_name);
	}
	public static void getName() {
		System.out.println("The Company_Name:="+Hello.company_name);
		System.out.println("The ID is:="+h.id);
		System.out.println("The Name is:="+h.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		h=new Hello();
		h.getId();
		getName();
	}

}
