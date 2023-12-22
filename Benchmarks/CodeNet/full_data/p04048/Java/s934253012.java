import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		
		if (n%2 == 1) {
			System.out.println(3*(n-1));
		} else if (x <= n/2) {
			System.out.println(3*(n-1)-3*(x-1));
		} else {
			System.out.println(3*(n-1)-3*(n-x-1));
		}
	}
}
