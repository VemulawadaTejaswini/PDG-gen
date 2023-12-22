import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int l = a + b;
		int r = c + d;
		String message = "Balanced";
		if(l > r) {
			message = "Left";
		} else if(l < r) {
			message = "Right";
		}
		System.out.println(message);
	}
}