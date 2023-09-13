package corejava;
import java.util.Scanner;
public class Assignment1 {  
	public static void main(String[] args) {
//Given number is palindrome or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First  Number:");
	int FN = sc.nextInt();
	Scanner pc=new Scanner(System.in);
	System.out.println("Enter any  Operator (+,-,*,/,%):");
	char opt= pc.next().charAt(0);
	Scanner gc=new Scanner(System.in);
	System.out.println("Enter Second  Number:");
	int SN=gc.nextInt();	
	if (opt=='+'){
		System.out.println(FN+SN);	
	}
	else if(opt=='-') {
		System.out.println(FN-SN);
	}
	else if(opt=='*') {
		System.out.println(FN*SN);
	}
	else if(opt=='/') {
		System.out.println(FN/SN);
	}
	else if(opt=='%') {
		System.out.println(FN%SN);
	}
	}
	}
	
	
		

		
//		
//		int num[][]=new int[3][4];
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(num[i][j]+" ");
//			}
//			System.out.println();
		
//		}
//	
	
		
		/*int a [] = {7, 2, 3, 1, 9, 8, 10},temp;
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i;j<i;j=i-1) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				 System.out.println(temp);	*/
			
		
		
				 
				 
				
			
			
		
	
		
			
		
	
		 

			

