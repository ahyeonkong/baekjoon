import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		
		if(a.length() >= b.length())
			System.out.println("go");
		else System.out.println("no");

		scanner.close();
	}
}
