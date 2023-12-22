import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = Integer.MAX_VALUE;
		for(int i = 0 ; i <= c ; i++) {
			int x = a * b * i;
			int y = a * b * c - x;
			ans = Math.min(ans, Math.abs(x - y));
		}
		for(int i = 0 ; i <= a ; i++) {
			int x = c * b * i;
			int y = a * b * c - x;
			ans = Math.min(ans, Math.abs(x - y));
		}
		for(int i = 0 ; i <= b ; i++) {
			int x = a * c * i;
			int y = a * b * c - x;
			ans = Math.min(ans, Math.abs(x - y));
		}
		System.out.println(ans);
	}
}
