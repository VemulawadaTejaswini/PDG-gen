import java.util.*;
import java.lang.*;

public class Main {
	static long mod = 998244353;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		int[] toku = new int[n];
		for (int i = 0; i < n; i++) {
			toku[i] = v[i] - c[i];
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (toku[i] > 0) {
				sum += toku[i];
			}
		}
		System.out.println(sum);
	}
}