import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = A;
		int answer = 0;

		for (int i = 1; i < A; i++) {
			if (B <= sum) {
				answer = i;
				break;
			}
			sum += A - 1;
		}

		if (B < A) {
			System.out.println(0);
		} else {
			System.out.println(answer + 1);
		}
	}
}
