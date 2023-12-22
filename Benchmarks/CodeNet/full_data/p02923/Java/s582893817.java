import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		int prev = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			if (prev >= b) {
				c++;
				max = Math.max(c, max);
			} else {
				c = 0;
			}
			prev = b;
		}
		System.out.println(max);
	}
}