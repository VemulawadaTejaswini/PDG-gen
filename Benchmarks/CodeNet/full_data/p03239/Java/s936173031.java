import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int answer = 0;
		int min = Integer.MAX_VALUE;
		int tmp = 0;
		int tmp2 = 0;

		for (int i = 0; i < N; i++) {
			tmp2 = sc.nextInt();
			tmp = sc.nextInt();
			if (tmp < min) {
				answer = tmp2;
				min = tmp;
			}
		}

		System.out.println(answer);
	}
}
