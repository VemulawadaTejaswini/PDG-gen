import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[][] input = new int[N][2];
		for (int i = 0; i < N; i++) {
			input[i][0] = sc.nextInt();
			input[i][1] = sc.nextInt();
		}
		int ans = -1;
		while (K > 0) {
			ans++;
			K -= input[ans][1];
		}
		System.out.print(input[ans][0]);
	}
}
