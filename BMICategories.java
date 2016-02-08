import java.util.Scanner;

public class BMICategories {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double weight, height, bmi;

		System.out.print( "Enter your weight in kg: ");
		weight = keyboard.nextDouble();

		System.out.print("Enter your height in cm: ");
		height = keyboard.nextDouble();

		bmi = weight/(height * height);


		System.out.print( "BMI category: ");
		if(bmi<15.0){
			System.out.println( "very severaly underweight");
		}
		else if (bmi <= 16.0){
			System.out.println("severely underweight");
		}
		else if (bmi< 18.5){
		System.out.println("underweight");
		}
		if (bmi < 25.0){
		System.out.println("normal weight");
		}
		else if (bmi < 30){
			System.out.println("overweight");
		}
		else if (bmi<35.0){
			System.out.println("moderately obese");
		}
		else if ( bmi < 40.0){
			System.out.println( "severely obese");
		}
		else{
			System.out.println("very severely/\"morbidly\" obese");
		}
	}
}
