import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		int Q = sc.nextInt();
		long lim = K - Q;
		int[] winCon = new int[N + 1];

		for (int i = 0; i < Q; i++) {
			winCon[sc.nextInt()]++;
		}

		for (int i = 1; i < winCon.length; i++) {
			if (winCon[i]+lim > 0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}