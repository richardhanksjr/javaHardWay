import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ){
		String name;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);
		System.out.print( "Hello. What's your name? " );
		name = keyboard.next();

		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();

		System.out.println( "So you're " + age + " , eh?  That's not very old.");
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();

		System.out.println(weight + "! Better keep that quiet!!" );
		System.out.print("Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();

		System.out.print( "Hopfully htat is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );

		String color;

		System.out.println( "What is your favorite color? ");
		color = keyboard.next();
		System.out.println ( "Your favorite color is " + color );

		//No, it does not blow up to put an interger in a double variable.  Perhaps
		//this is because an interger is less precise than a double.
		//No.  It interprets the interger as a string and not as the numerical value.
		//I couldn't find something that made it blow up.
		//


	}
}