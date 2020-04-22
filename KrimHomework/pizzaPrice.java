package hommework;

import java.util.Scanner;

public class pizzaPrice {
	public static void main (String[]args) {
		double totall;
	
		
		
		Scanner pizza =new Scanner(System.in);
		
		System.out.println(" Chose the size of your Pizzza from the list below please :"
				+ "\n "
				+ "\n * L:for a large($16.00). "
				+ "\n * M :for a medium($12.00). "
				+ "\n * S :for a small($9.00). ");
	    char size = pizza.next().charAt(0);
		System.out.println(" Chose the topics of your Pizzza from the list below please :"
				+ "\n "
				+ "\n * A   :for a plain Pizza."
				+ "\n * V   :for a Vegetarian Pizza add ($1.00)for a small size,($3.00)for the medium size,and ($5.00)for the large."
				+ "\n * P   :for a Pepperoni  Pizza add ($2.00)for a small size,($4.00)for the medium size,and ($6.00)for the large."
				+ "\n * W :for a Pepperoni and Vegetarian  Pizza add ($3.00)for a small size,($5.00)for the medium size,and ($7.00)for the large.");
		char topic = pizza.next().charAt(0);
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
		
if (size=='S') {
		switch(topic) {
		
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
		default:System.out.println("You entred a invalid order");
		}}
	
else if (size=='M') {switch(topic) {
	
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
	default:System.out.println("You entred a invalid order");
	   }}
	
else if (size=='L') {switch(topic) {
	
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
	   default:System.out.println("You entred a invalid order");
	   }}
else {System.out.println("You entred a invalid order");}
    }	
	
    }