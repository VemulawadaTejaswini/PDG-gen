import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		String S = in.next();
		String T = in.next();
		long lcm = lcm(M, N);
		Pair[] n = new Pair[N];
		Pair[] m = new Pair[M];
		for (int i = 0; i < N; i++) {
			long num = i * (lcm / N) + 1;
			char c = S.charAt(i);
			n[i] = new Pair(num, c);
		}
		for (int i = 0; i < M; i++) {
			long num = i * (lcm / M) + 1;
			char c = T.charAt(i);
			m[i] = new Pair(num, c);
		}
		int index = 0;
		boolean isOk = true;
		for (int i = 0; i < N; i++) {
			while (index < M) {
				if (n[i].num < m[index].num) {
					break;
				} else if (n[i].num == m[index].num && n[i].c != m[index].c) {
					isOk = false;
					break;
				}
				index++;
			}
		}
		System.out.println(isOk ? lcm : -1);
		in.close();
	}

	//最大公約数を求める関数。ｍ＞ｎの必要がある。
	static long gcd(long x, long y) {
		if (x < y) {
			long tmp = y;
			y = x;
			x = tmp;
		}
		if (y == 0) {
			return x;
		}
		return gcd(x % y, y);
	}

	//最小公倍数を求める関数。ｍ＞ｎの必要がある。
	static long lcm(long m, long n) {
		return m * n / gcd(m, n);
	}
}

class Pair {

	long num;
	char c;

	public Pair(long num, char c) {
		this.num = num;
		this.c = c;
	}
}