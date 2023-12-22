import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x =  sc.nextLong();
		long y =  sc.nextLong();
		sc.close();
		System.out.println(calc(x, y));

	}

	public static long calc(long argX, long argY) {
		long x = Math.max(argX, argY);
		long y = Math.min(argX, argY);
		long d;
		long xa, ya;
		d = x / 2;
		xa = x - 2 * d;
		ya = y - d;
		long dd = ya / 2;
		long yaa = ya - 2 * dd;
		long xaa = xa - dd;

		if (yaa != 0 || xaa != 0) {
			return 0L;
		} else {
			long ans = d * dd / ((long) Math.pow(10, 9) + 7);
			return ans;
		}

	}
}
