import java.util.*;
import java.math.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		Arrays.sort(arr);
		long sum = 0;
		long prev = 0;
		int acount = 0;
		int bcount = 0;
		int ccount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i < a) {
				sum += arr[arr.length - 1 - i];
				if (prev != arr[arr.length - 1 - i]) {
					prev = arr[arr.length - 1 - i];
					acount = 0;
				}
				prev = arr[arr.length - 1 - i];
				acount++;
			} else if (i < b) {
				if (prev == arr[arr.length - 1 - i]) {
					bcount++;
				}
			} else {
				if (prev == arr[arr.length - 1 - i]) {
					ccount++;
				}
			}
		}
		long total = 0;
		if (prev == arr[arr.length - 1]) {
			for (int i = a; i <= b && i <= acount + bcount; i++) {
				total += combination(acount + bcount + ccount, i);
			}
		} else {
			total = combination(acount + bcount + ccount, acount);
		}
		System.out.println(BigDecimal.valueOf((double)sum / (double)a).toPlainString());
		System.out.println(total);
	}
	
	static long combination(long r, long k) {
		if (k >= r - k) {
			return kaijo(k + 1, r) / kaijo(1, r - k);
		} else {
			return kaijo(r - k + 1, r) / kaijo(1, k);
		}
	}
	
	static long kaijo(long from , long to) {
		long ret = 1;
		for (long a = from; a <= to; a++) {
			ret *= a;
		}
		return ret;
	}
}
