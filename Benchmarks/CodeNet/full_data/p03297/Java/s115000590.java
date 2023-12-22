import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		long[] a = new long[q];
		long[] b = new long[q];
		long[] c = new long[q];
		long[] d = new long[q];
		for(int i = 0; i < q; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
			c[i] = sc.nextLong();
			d[i] = sc.nextLong();
		}
		for(int i = 0; i < q; i++) {
			if(func(a[i], b[i], c[i], d[i])) System.out.println("Yes");
			else System.out.println("No");
		}
	}

	static boolean func(long a, long b, long c, long d) {
		if(a < b) return false;
		long ret = a - b;
		while(ret >= 0) {
			if(ret <= c) ret += d;
			if(ret == a) return true;
			if(ret >= b) ret %= b;
			else ret -= b;
		}
		return false;
	}

}
