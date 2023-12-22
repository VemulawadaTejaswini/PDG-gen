import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int n = scan.nextInt();
		int i = 0;
		for(i = 0; i < d; i++) {
			n = n * 100;
		}
		System.out.println(n);
	}
}