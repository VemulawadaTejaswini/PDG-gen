import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();

		int p = Math.max(h, w);
		int ans = n % p == 0 ? n / p : n / p + 1;
		
		System.out.println(ans);
		sc.close();
		
	}
}
