import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		for (int i = 0 ; i< n ; i++) {
			d[sc.nextInt()] = i;
		}
		int cnt = 1;
		int a = 1;
		for (int i = 1 ; i < n ; i++) {
			if (d[i-1] < d[i]) {
				a++;
			} else {
				if (a > cnt) {
					cnt = a;
					a = 1;
				}
			}
		}

		System.out.println(n - cnt);
	}
}