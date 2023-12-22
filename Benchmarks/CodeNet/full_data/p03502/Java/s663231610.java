import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveB();
	}

	private void solveA() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(N * A < B ? N * A : B);
	}

	private void solveB() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tmp = N;
		int sum = 0;
		while (tmp > 0) {
			sum += tmp % 10;
			tmp /= 10;
		}
		if (N % sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}