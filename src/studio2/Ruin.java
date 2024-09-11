package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
	
	// Creating Inputs
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your start amount: ");
		double startAmount = in.nextDouble(); 
		
		System.out.println("Enter your win limit: ");
		int winLimit = in.nextInt(); 
	
		System.out.print("How many days are you playing? ");
		int totalSimulations = in.nextInt();
		double totalMoney = startAmount;
	
	// Creating win Boolean 
		
	// Creating Gamble
		int count = 0;
		int counter = 0;
		
	for(int i = 0; i < totalSimulations; i++) {
		while(totalMoney != winLimit && totalMoney > 0) {
			boolean win = false; 
			if(Math.random() > .5) {
				 win = true; 
			}
			if(win) {
				totalMoney ++; 
				System.out.print(totalMoney);
				counter++;
			}
			else {
				totalMoney --;
				System.out.print(totalMoney);
				counter++;
			}
		}
			
		if(totalMoney == winLimit) {
			System.out.println("You reached the limit. It took you " + counter + "times to win"); 
			count++;
			totalMoney = startAmount; }
		else if (totalMoney < 1) {
			System.out.println("You reached 0, you lose " + counter + " times to lose");
			totalMoney = startAmount;}
				
			}
		System.out.println("Out of the " + totalSimulations + " simulations you played, you won " + count + " of them!");
		}
	
	}


