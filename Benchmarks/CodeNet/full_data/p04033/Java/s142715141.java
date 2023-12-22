import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a= sc.nextLong();
		long b = sc.nextLong();
		if (a>0) {
			System.out.println("Positive");
		} else if (b<0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
	}
}