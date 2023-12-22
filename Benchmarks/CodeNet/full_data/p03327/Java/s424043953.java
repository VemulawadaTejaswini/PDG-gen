import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if (a < 1000) {
			System.out.println("ABC");
		} else {
			System.out.println("ABD");
		}
	}
}
