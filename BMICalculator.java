import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi;

		System.out.print( "Your height in inches: " );
		m = keyboard.nextDouble();
		//Convert inches to meters
		m = m * 0.0254;

		System.out.print( "Your wieght in pounds: " );
		kg = keyboard.nextDouble();
		//Convert pounds to kg
		kg = kg * .453592;
		//BMI formula metric
		bmi = kg/ (m*m);

		System.out.println( "Your BMI is " + bmi );
	}
}