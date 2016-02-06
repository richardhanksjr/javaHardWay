public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, num;
		double seconds, e, checking, dub;
		String firstName, lastName, title, st1, st2;

		x = 10;
		y = 400;
		age = 39;
		num = 400;

		seconds = 4.71;
		e = 2.71828182845903523536;
		checking = 1.89;
		dub = 1.939393;


		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		st1 = "This is String 1";
		st2 = "This is String 2";

		System.out.println( "The variable x contains " + x);
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopfully you have more that $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + " " + lastName );
		System.out.println( "First I added \"" + st1 + "\"  and then I added \"" + st2 + "\" and the interger " +
							num + " and the double " + dub + ".");

	}
}