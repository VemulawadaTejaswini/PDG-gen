import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] p = new int[N];

		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}

		int temp_max = p[0];
		int cnt = 1;
		for (int i = 1; i < N; i++) {
			if (temp_max > p[i]) {
				temp_max = p[i];
				cnt++;
			}
		}

		System.out.print(cnt);

		sc.close();

	}
}
