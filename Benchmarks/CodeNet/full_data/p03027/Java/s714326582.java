import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		long[] answer = new long[q];
		for (int i = 0; i<q; i++) {
			int x = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();
			answer[i] = calc(x,d,n);
		}

		for (long a : answer ) {
			System.out.println(a);
		}

	}

	static long calc(Integer x, Integer d, Integer n) {
		long result = 1;
		for (int i = 0; i < n; i++) {
			int val = x + i * d;
			result = (result * val) % 1000003;
		}

		result = result % 1000003;
		return result;
	}


}
