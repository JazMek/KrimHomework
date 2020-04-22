package hommework;
//We are going to create an App for a Pizza menu.
//The menu will :
//Welcome to "Pizza du chef" 
//You can chose the size of your Pizza from : * "L" for large($16.00) ,*"M" for medium($12.00) ,and *"S" for small($9.00).
//You can chose the topics you want to be add to your Pizza from the list :  
//(A)for a plain Pizza
//(V)for Vegetarian Pizza add ($1.00)for a small size,($3.00)for the medium size,and ($5.00)for the large.
//(P)for Pepperoni  Pizza add ($2.00)for a small size,($4.00)for the medium size,and ($6.00)for the large.
//(M)for Pepperoni and Vegetarian  Pizza add ($3.00)for a small size,($5.00)for the medium size,and ($7.00)for the large.

import java.util.Scanner;

public class Pizza {
//To start our programe I will start by collecting the costumer order inputs to do that I will need to creat a scaner
//The inputs should be "size", and the "topics"
//I  will first declare the variables
	
	
	

	
	public static void main (String[]args) {
		double totall;
	
		
		
		Scanner pizza =new Scanner(System.in);
		
		

		
		System.out.print(" -------------------------------------------------------------------------------------------------------------------------------"
				+ "\n ****************************************   Wellcome to Pizza du Chef  *********************************************************" 
				+ "\n -------------------------------------------------------------------------------------------------------------------------------"
				+ "\n ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////"
				+ "\n -------------------------------------------------------------------------------------------------------------------------------"
				+ "\n  Chose the size of your Pizzza from the list below please :"
				+ "\n -------------------------------------------------------------------------------------------------------------------------------"
				+ "\n * L :for a large($16.00). "
				+ "\n * M :for a medium($12.00). "
				+ "\n * S :for a small($9.00). "
		        + "\n  Entre your chois : ");

//To read a char, we use next().charAt(0). next() function returns the next token/word in the input as a string and charAt(0) 
//function returns the first character in that string
			    char size = pizza.next().charAt(0);
		
	    
		System.out.print(" -------------------------------------------------------------------------------------------------------------------------------"
				+ "\n///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////"
				+ "\n ------------------------------------------------------------------------------------------------------------------------------"
				+ "\n  Chose the topics of your Pizzza from the list below please :"
				+ "\n ------------------------------------------------------------------------------------------------------------------------------"
				+ "\n * A   :for a plain Pizza."
				+ "\n * V   :for a Vegetarian Pizza add ($1.00)for a small size,($3.00)for the medium size,and ($5.00)for the large."
				+ "\n * P   :for a Pepperoni  Pizza add ($2.00)for a small size,($4.00)for the medium size,and ($6.00)for the large."
				+ "\n * W   :for a Pepperoni and Vegetarian  Pizza add ($3.00)for a small size,($5.00)for the medium size,and ($7.00)for the large."
		        + "\n  Entre your chois : ");
//To read a char, we use next().charAt(0). next() function returns the next token/word in the input as a string and charAt(0) 
//function returns the first character in that string
				char topic = pizza.next().charAt(0);
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
if (size=='S' ||size=='M'||size=='L') {
switch(size){

	
 case'S': switch(topic) {
		
		case 'A':totall=9.00;
		System.out.println("You ordered a small plain Pizza your Totall will be :  $"+totall);
			break;
		case 'V':totall=9.00 +1.00;
		System.out.println("You ordered a small Vegetarian Pizza your Totall will be :  $"+totall);
			break;
		case 'P':totall=9.00 +2.00;
		System.out.println("You ordered a small Pepperoni Pizza your Totall will be :  $"+totall);
			break;
		case 'W':totall=9.00 +3.00;
		System.out.println("You ordered a small Pepperoni and Vegetarian Pizza your Totall will be :  $"+totall);
		   break;
		   default:System.out.println("You entred a invalid order please try again");
		
		}
 break;
 case 'M': switch(topic) {
	
	case 'A':totall=12.00;
	System.out.println("You ordered a medium plain Pizza your Totall will be :  $"+totall);
		break;
	case 'V': totall=12.00 +3.00;
	System.out.println("You ordered a medium Vegetarian Pizza your Totall will be :  $"+totall);
		break;
	case 'P':totall=12.00 +4.00;
	System.out.println("You ordered a medium Pepperoni Pizza your Totall will be :  $"+totall);
		break;
	case 'W':totall=12.00 +5.00;
	System.out.println("You ordered a medium Pepperoni and Vegetarian Pizza your Totall will be :  $"+totall);
	   break;
//	default:System.out.println("You entred a invalid order please try again");
	
	   }
break;	
case 'L': switch(topic) {
	
	case 'A':totall=16.00;
	System.out.println("You ordered a large plain Pizza your Totall will be :  $"+totall);
		break;
	case 'V':totall=16.00 +5.00;
	System.out.println("You ordered a large Vegetarian Pizza your Totall will be :  $"+totall);
		break;
	case 'P':totall=16.00 +6.00;
	System.out.println("You ordered a large Pepperoni Pizza your Totall will be :  $"+totall);
		break;
	case 'W':totall=16.00 +7.00;
	System.out.println("You ordered a large Pepperoni and Vegetarian Pizza your Totall will be :  $"+totall);
	   break;
//	   default:System.out.println("You entred a invalid order please try again");
	   
	   }
break;
//default:System.out.println("You entred a invalid order please try again");
}}

else {System.out.println("You entred a invalid order please try again");}
   }
	
    }

	
	

