import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int prev = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < n; i++) {
			int x = sc.nextInt();
			sum += Math.min(x - prev, t);
			prev = x;
		}
		sum += t;
		System.out.println(sum);
	}
}
