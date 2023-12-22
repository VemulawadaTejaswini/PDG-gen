import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		long res = 0;
		if (A + B == 0) {
			System.out.println(0);
			System.exit(0);
		}
		res += N / (A + B) * A;
		if (N % (A + B) <= A) {
			res += N % (A + B);
		} else {
			res += A;
		}
		System.out.println(res);
	}
}
