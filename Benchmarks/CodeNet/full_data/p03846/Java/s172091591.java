import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int[] iru = new int[n];
		for (int i = 0; i < n; i++) {
			iru[a[i]]++;
		}
		long count = 1;
		long mod = 1000000007;
		if (n % 2 == 0) {
			for (int i = 1; i < n; i += 2) {
				if (iru[i] != 2) {
					count = 0;
				} else {
					count *= 2;
					count %= mod;
				}
			}
		} else {
			if (iru[0] != 1) {
				count = 0;
			}
			for (int i = 2; i < n; i += 2) {
				if (iru[i] != 2) {
					count = 0;
				} else {
					count *= 2;
					count %= mod;
				}
			}
		}
		System.out.println(count);
	}
}