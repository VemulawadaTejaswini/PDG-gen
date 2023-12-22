import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int range = scan.nextInt();

		int answer = 0;
		if (n % range == 0) {
			answer = n / range;
		} else {
			answer = n /range + 1;
		}
		System.out.println(answer);
	}
}