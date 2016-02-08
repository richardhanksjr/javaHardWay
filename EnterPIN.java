import java.util.Scanner;

public class EnterPIN{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		String password="access", passEntry;

		System.out.println("PLEASE ENTER YOUR PASSWORD");
		passEntry = keyboard.next();

		while (! passEntry.equals(password)){
			System.out.println("PLEASE ENTER YOUR PASSWORD");
			passEntry = keyboard.next();
		}

		pin = 12345;

		System.out.println("WELCOME TO THE BANK OF JAVA.");
		System.out.print("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();

		while (entry != pin){
			System.out.println("\nINCORRECT PIN. TTRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\n PIN ACCEPTED.  YOUR ACCOUNT BALANCE IS $425.17");
	}
}