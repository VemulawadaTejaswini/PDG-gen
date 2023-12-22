import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long ans = getLucasNumber(2, 1, n);
		System.out.println(ans);


		sc.close();
	}

	static long getLucasNumber(long l0, long l1, int n) {
		if (n == 0) {
			return l0;
		}
		n--;
		return getLucasNumber(l1, l0 + l1, n);
	}
}
