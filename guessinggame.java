package guessinggame;

import java.util.Scanner;

public class guessinggame {

	public static void main(String[] args) {
		
	Scanner cin = new Scanner(System.in);// starts scanner
	
	boolean r = true;// declares the boolean variable to be used in the while loop
	
	int random = (int) (1+100* Math.random());// equation to generate the random number
	
	while(r)// start of while loop
	{
		int i=cin.nextInt();// user inputs their guess
		
			if(i==random)// what to do if the guess is correct
			{
				System.out.println(" Wow, You gueesed correct");
				r=false;// ends loop
			}
		
			if(i>random)// checking to see if their guess is greater than the number
			{
				System.out.println("Your guess is too high");
			}
		
			if(i<random)// checks to see if their guess is lower than the value
			{
				System.out.println("Your guess is too low");
			}
		
		
	}
	
	
	System.out.println(random);// prints out the number after they have guess right
	
	cin.close();// closes scanner
	

	}	
}
