package hommework;



public class Car {
  
	
	
    String Vinumber;  
    String Modellname;  
    int Carage;  
    //creating two arg constructor  
    Car(String i,String n){  
    Vinumber = i;  
    Modellname = n;  
    }  
    //creating three arg constructor  
    Car(String i,String n,int a){  
    Vinumber = i;  
    Modellname = n;  
    Carage=a;  
    }  
    void display(){System.out.println(Vinumber+" "+Modellname+" "+Carage);}  
   
    public static void main(String args[]){  
    Car model1 = new Car("KF11123459768","camery");  
    Car model2 = new Car("ZF22233309748","yaris",15);  
    model1.display();  
    model2.display();  
   }  
	
	
}
