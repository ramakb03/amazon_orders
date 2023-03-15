package amazonOrders;
import java.util.Scanner;
public class AmazonOrders {
/* 
 * program calculates costs of orders on Amazon.com.
 * Using quantity, price and adding shipping cost, it calculates final bill
 * It also includes discounted price if order exceeds 10 items and if it is prime.
 */
public static void main (String[] args) {
	
	int itemNum, itemQuantity, countOrders = 0, countPrime = 0;
	double itemPrice, cost, shippingCost = 0;
	String myLine;
	char ans;
	
	Scanner scnr = new Scanner (System.in); 
	
	System.out.println("Enter item number or -1 to end.");
	itemNum = scnr.nextInt();

	
	while(itemNum != -1) {
		
		System.out.println("Enter desired quantity");
		itemQuantity = scnr.nextInt();
		System.out.println("Enter price.");
		itemPrice = scnr.nextDouble();
		System.out.println("Indicate if order used Prime by entering P, or not by entering N");
		myLine = scnr.nextLine();
		myLine = scnr.nextLine();
		ans = myLine.charAt(0);
		
		countOrders++;
	    System.out.println(itemNum + " " + itemQuantity + " " + itemPrice + " " + ans);
	    System.out.println("Item number is " + itemNum);
	    System.out.println("Quantity bought = " + itemQuantity);
	    System.out.println("The ite8Gm costs $" + itemPrice);
	
	    if(ans == 'P') {
		countPrime++;
		shippingCost = 0;
		System.out.println("It is prime!");
		System.out.println("Your shipping costs are $ " + shippingCost);
	    }
	    else if(ans == 'N') {
		shippingCost = 8;
		System.out.println("It is NOT Prime");
		System.out.println("Your shipping costs are $ " + shippingCost);
	   }

	  if(itemQuantity < 10) {
		cost = 5 * itemPrice;
		System.out.println("Total cost is $" + cost);
	  }
	  else if(itemQuantity >= 10) {
		double discountedPrice = 0.1 * itemPrice;
		System.out.println("Discount of 10% applies: Discount of $" + discountedPrice + " per item");
		discountedPrice = discountedPrice * itemQuantity;
		System.out.printf("Discounted price is $%.2f\n", discountedPrice); 
		cost = (5 * itemPrice) - discountedPrice;
		System.out.printf("Total cost is $%.2f\n", cost);
		}
	  
	  System.out.println();

	  System.out.println("Enter item number or -1 to end.");
	  itemNum = scnr.nextInt();
	
}
	scnr.close();

    System.out.println();
    System.out.println();
    System.out.println(countOrders + " order(s)processed");
    System.out.println(countPrime + " order(s)were Prime");
    System.out.println("Percentage Prime: " + (double) countPrime / countOrders);
} 
}