import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(sc.next());
		Arrays.sort(a);
		boolean able = true;
		if (n % 2 > 0) {
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0 && a[i] == i) continue;
				if (i % 2 > 0 && a[i] == i + 1) continue;
				able = false;
			}
		}
		else {
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0 && a[i] == i + 1) continue;
				if (i % 2 > 0 && a[i] == i) continue;
				able = false;
			}
		}
		if (able) {
			long ans = n / 2;
			System.out.println(ans * ans % 1000000007);
		}
		else
			System.out.println("0");
	}
}