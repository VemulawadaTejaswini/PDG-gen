import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		boolean[] ACcon =new boolean[N + 1];
		int[] WAcon =new int[N + 1];

		int ACans =0;
		int WAans =0;

		for (int i = 0; i < M; i++) {
			int Q = sc.nextInt();
			String result = sc.next();

			if (ACcon[Q] == false && result.equals("WA")) {
				WAcon[Q]++;
			}
			if (ACcon[Q] == false && result.equals("AC")) {
				ACcon[Q] = true;
			}
		}

		for (int i = 1; i < N+1; i++) {
			if (ACcon[i]) {
				ACans++;
				WAans += WAcon[i];
			}
		}

		System.out.println(ACans + " " + WAans);

	}
}