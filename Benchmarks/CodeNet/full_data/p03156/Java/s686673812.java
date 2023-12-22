import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int A = sc.nextInt();
		final int B = sc.nextInt();

		int[] prob = new int[3];

		for (int i = 0; i < N; i++) {
			int pi = sc.nextInt();
			if (pi <= A) {
				prob[0]++;
			} else if (pi > A && pi <= B) {
				prob[1]++;
			} else {
				prob[2]++;
			}
		}

		System.out.println(Math.min(Math.min(prob[0], prob[1]), prob[2]));

		sc.close();
	}

}
