package weatherProject;

import java.util.Scanner;

public class WeatherProject
{

	public static void main(String[] args) 
	{
	System.out.print("What is your temperature in fahrenhiet?");//asks for the user's input
	
	Scanner cin = new Scanner(System.in);//starts scanning for input
	
	int f = cin.nextInt();// declares that f is the input
	
	{
	double C=(5*(((double)f)-32))/9;//uses the equation to convert it to centigrade 
	System.out.println(C);// out prints the temperature in centigrade
	}
	cin.close();//stops scanner
	
	if (f<=32)// states the requirment for it to be cold outside
	{
	System.out.print("It is cold outside");	// states that it's cold outside
	}
	else if (f<90)// defines the moderate temperature
	{
	System.out.println("It is a moderate temperature outside");//states that is is a moderate temperature
	}
	
	else if (f>=90)// defines the temperature for it to be hot outside
	{
	System.out.println("It if hot outside");// states that it is hot outside
	}
	
	
	
	
	
	
	
	

}
}