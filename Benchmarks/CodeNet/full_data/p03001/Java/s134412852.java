import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long W = sc.nextLong();
		long H = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();
		int ans2 = 0;
		if (x * 2 == W && y * 2 == H) {
			ans2 = 1;
		}

		System.out.print(W * H / 2);
		System.out.println(" " + ans2);
	}
}
