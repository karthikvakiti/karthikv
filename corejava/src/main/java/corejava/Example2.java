package corejava;
class Emp {
	private int id;
	private String name;
		
	  private Emp(int id,String name){
			this.id=id;
			this.name=name;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public static Emp getInstance() {
			Emp obj=new Emp(100,"Infosys");
			return obj;
	}

}
public class Example2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		
		Emp e=Emp.getInstance();
		int eid=e.getId();
		String ename=e.getName();
		System.out.println("ID is:="+eid);
		System.out.println("Name is:="+ename);
	}

}