import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = 0;
		while (true) {
			x++;
			if (x%2==0 && x%n==0) {
				break;
			}
		}
		System.out.println(x);
	}
}
