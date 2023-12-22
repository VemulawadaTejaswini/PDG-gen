import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt();
		long B = sc.nextInt();
		long C = sc.nextInt();
		boolean can = false;

		for (int i = 0; i <= B; i++) {
			if (A * i % B == C) can = true;
		}

		if (can) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
