import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		boolean b = false;

		for (int i = 1; i <= B; i++) {
			if ((A * i) % B == C) {
				b = true;
				break;
			}
		}

		if (b == false) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}

}
