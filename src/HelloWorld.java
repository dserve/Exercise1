import java.util.Scanner;

public class HelloWorld {

	private static Scanner scanner;
	private static HelloUser user;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Hello ASE2017 - How are you now? :)");
		System.out.print("Please enter your name: ");
		String userName = scanner.next();
		user = new HelloUser(userName);
		user.greetUser();
	}

}
