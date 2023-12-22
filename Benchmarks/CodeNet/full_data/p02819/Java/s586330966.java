import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		while (!isPrime(X)) {
			X++;
		}
		System.out.println(X);
		in.close();
	}

	static boolean isPrime(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i * i <= n; ++i) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}