import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		while (true) {
			for (int i = 0; i < N; i++) {
				if (A[i] % 2 == 0)
					A[i] /= 2;
				else {
					System.out.println(cnt);
					return;
				}
			}
			cnt++;
		}
	}

}