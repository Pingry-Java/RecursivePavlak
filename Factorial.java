import java.util.Scanner;
/**
* Factorial program
* @author Mitchell Pavlak
* @author Orndorff AP Comp Sci Class
**/
public class Factorial
{
/** 
* Main method that calls the factorial method
*@param args Standard array of commandline String arguments. Not used in this program.
**/
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Welcome to the factorial calculator.");
	String response = new String();
	double answer = 0;
	//end condition
	while(!response.equals("bye")) 
	{
		System.out.println("Please enter your number, or enter 'bye' or 'exit' to stop: ");
		
		int x =0;
		while (x==0)
		//x will not be changed--this is just to give an infinite loop until it is broken
		// this could probably be worked around to not use this loop, but I wanted to be
		// certain that there is either a valid number or a bye equiv string before I 
		// started checking it (because the string typed in could be either a string or a 
		// double/int I didn't want to worry about checking types)
		{
			if (s.hasNextDouble())
			{
			  	answer = s.nextDouble(); //using double to try to get a larger range
			  	// of acceptable inputs
			  	s.nextLine(); //fixing white space after nextDouble
			 	break;
			}
			else 
			{
			// each line first needs to be checked to not contain the double, then you 
			// use a tempAnswer because you don't want to do s.nextLine for each 
			// (if you do it will move multiple lines ahead)
				String tempAnswer = s.nextLine();
				if (tempAnswer.equals("bye")||tempAnswer.equals("Bye")||tempAnswer.equals("exit"))
				{
				 	response = "bye";
				 	break;
				}
			}
		}
		// only way you can get to this portion of the loop would be if a double is entered
		// that breaks the previous, if it is a bye equiv answer it will end the whole
		// loop... 
		if (answer != 0 && !(response.equals("bye")))
		{
			System.out.println(answer +"! = " + factorial(answer));
		}
	}
	}
	/**
	*This method takes a number and finds that number factorial recursively
	*@param number the double it takes in (double for greater precision and larger inputs)
	*@return the number factorial as a double 
	**/
	public static double factorial(double number) 	
	{
		if (number == 0)
		{
			return 1.0;
		}
		else 
		{
		return number * factorial(number-1);
		}
	} 
	
}