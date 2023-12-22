import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String message = ":(";
		if(a <= 8 && b <= 8) {
			message = "Yay!";
		}
		System.out.println(message);
	}
}