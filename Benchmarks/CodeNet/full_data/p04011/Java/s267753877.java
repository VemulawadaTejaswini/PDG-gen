import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int total =  0;
		
		for (int i = 0 ; i < n ; i++) {
			if (n <= k) total = n * x;
			if (n > k) total = k * x + (n - k) * y;
		}
		System.out.println(total);
	}
}