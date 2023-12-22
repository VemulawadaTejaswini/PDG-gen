import java.util.Scanner;

public class Main {
	public static long ctz(long n) {
		long ret = 0;
		while ((n & 1) == 0) {
			ret++;
			n >>= 1;
		}
		return ret;
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ret = 0;
		for (int i = 0; i < n; i++) {
			long input = sc.nextLong();
			ret += ctz(input);
		}
		System.out.println(ret);
	}
}