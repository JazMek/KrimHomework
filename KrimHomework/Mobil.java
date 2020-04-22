package hommework;

import java.util.Scanner;

public class Mobil {
//I am going to creatate an APP how is going to take orders for
//	a defrent mobil modells
	
	 public Mobil(String a, int b, String c, double d) {
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] args) {
		 
 
		 
		 System.out.println("************  Welcome to the  best Mobil market  *************"
				 
				           +"\n Please entre the Mobil maker : ");
		 
		 Scanner stdin = new Scanner(System.in);
	
	

	 
	 
    String mobilName;
    int    mobilModell;
	String mobilMaker;
	double mobilPrice ;
	 
	
	 
//	 creatingin an argument constractor 
	  
	 
	 
		 
		 String a;
		mobilName=a;
		 int b;
		mobilModell=b;
		 String c;
		mobilMaker=c;
		 double d;
		mobilPrice=d;	 
		 
		
	 
	 
	
	 
	 
	 
	 
		 
		 
		 System.out.println("************  Welcome to the  best Mobil market  *************"
				 
				           +"\n Please entre the Mobil maker : ");
		 
		 Scanner stdin = new Scanner(System.in);
		 
		 a=stdin.nextLine();
		 b=stdin.nextInt();
		 c=stdin.nextLine();
		 d=stdin.nextDouble();
		 
		  Mobil Apel = new Mobil(a,b,c,d);  
		  Mobil Samsung = new Car("ZF22233309748","yaris",15);  
		  Apel.display();  
		  Samsung.display();  
		
	 }

	private void display() {
		// TODO Auto-generated method stub
		
	}
}


