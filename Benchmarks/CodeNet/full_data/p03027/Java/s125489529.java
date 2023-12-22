import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for (int i = 0; i<q; i++) {
			int x = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();
			calc(x,d,n);
		}
	}

	static void calc(Integer x, Integer d, Integer n) {
		int result = 1;
		for (int i = 0; i < n; i++) {
			int val = x + i * d;
			result = result * val;
		}

		result = result % 1000003;
		System.out.println(result);
	}


}
