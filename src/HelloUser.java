import java.util.Scanner;

public class HelloUser {
	public static String userName;
	
	public void greetUser() {
		System.out.println("Please, enter your name: ");	 
		Scanner scan = new Scanner(System.in);
		userName = scan.next();
		scan.close();
		System.out.println("Hello, "+ userName + "!");
	}

}
