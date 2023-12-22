import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println(fanc(a, b));
	}
	static long fanc(long a, long b) {
		long an = a / 4;
		long bn = b / 4;
		if (an == bn) {
			return XOR(a, b);
		} else {
			return XOR(a, an * 4 + 3) ^ XOR(bn * 4, b);
		}
	}
	static long XOR(long a, long b) {
		long ans = 0;
		for (long i = a; i <= b; i++) {
			ans = ans ^ i;
		}
		return ans;
	}
}
