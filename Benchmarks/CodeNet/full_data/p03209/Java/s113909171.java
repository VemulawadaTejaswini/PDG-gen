import static java.lang.Long.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static long N;
	public static long X;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = parseLong(st.nextToken());
		X = parseLong(st.nextToken());

		long ans = pn(N,X);
		System.out.println(ans);

	}

	public static long pn(long n, long x) {
		if(n == 0 && x==1) {
			return 1;
		}else if (x == 1) {/*1*/
			return 0;
		} else if (1 < x && x <= 1 + total(n - 1)) {/*2*/
			return pn(n - 1, x - 1);
		} else if (x == 2 + total(n - 1)) {/*3*/
			return pn(n - 1, total(n - 1)) + 1;
		} else if (2 + total(n - 1) < x && x <= 2 + 2 * total(n - 1)) {/*4*/
			return pn(n - 1, total(n - 1)) + 1 + pn(n - 1, x - 2 - total(n - 1));
		} else {/*5*/
			return 2 * pn(n - 1, total(n - 1)) + 1;
		}

	}

	public static long total(long n) {
		if (n == 0)
			return 1;
		return 3 + total(n - 1) * 2;
	}
}