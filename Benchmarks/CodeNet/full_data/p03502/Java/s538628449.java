import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String N = sc.next();
		int sum = 0;
		
		for (int i = N.length() - 1; i >= 0; i--) {
			sum += Integer.valueOf(N.substring(i, i + 1));
		}
		// System.out.println(sum);
		if (Integer.valueOf(N) % sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}