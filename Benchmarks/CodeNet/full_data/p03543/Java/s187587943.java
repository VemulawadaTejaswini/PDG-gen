import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int n4 = n / 1000;
		int n3 = (n - (n4 * 1000)) / 100;
		int n2 = (n - (n4 * 1000) - (n3 * 100)) / 10;
		int n1 = n - (n4 * 1000) - (n3 * 100) - (n2 * 10);
		String message = "No";
		if(n4 == n3 && n3 == n2) {
			message = "Yes";
		} else if(n3 == n2 && n2 == n1) {
			message = "Yes";
		}
		System.out.println(message);
	}
}