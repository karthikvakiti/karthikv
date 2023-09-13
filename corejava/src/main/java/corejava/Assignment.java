package corejava;

public class Assignment {
	
	int id;
	String name;
	
	Assignment(int id,String name){
		this.id=id;
		this.name=name;
	}
	static String company_name;
	
	public static void main(String[] args) {
		
		
		Assignment b=new Assignment(100,"TCS");
		System.out.println("ID:="+b.id);
		System.out.println("Nameis:="+b.name);
		
		Assignment c=new Assignment(200,"WIPRO");
		System.out.println("ID:="+c.id);
		System.out.println("Nameis:="+c.name);
	
		
	}

}
