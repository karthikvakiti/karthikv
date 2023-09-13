package corejava;

public class MethodOverLoading {
	int a,b;
	float c;
	MethodOverLoading(int a, int b){
		System.out.println("Parameterizrd constructo:");
		this.a=a;
		this.b=b;
		
	}
	MethodOverLoading(int a, float c){
		System.out.println("Parameterizrd constructor:");
		 this.a=a;
		 this.c=c;
			
	}
     public static void main(String [] args) {
    	 MethodOverLoading ml1 = new MethodOverLoading(30,60);
    	 System.out.println("ML1 Values:="+ml1.a+" "+ml1.b);
    	 
    	 MethodOverLoading ml2 = new MethodOverLoading(50,45.0f);
    	 System.out.println("ML2 Values:="+ml2.a+" "+ml2.c);
    	 
     }
     
}
