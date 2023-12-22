import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		String S = scan.next();
		int[][] n = new int[N][2];
		
		int index = 0;
		int count = 1;
		char cur = S.charAt(0);
		for (int i = 0; i < N; i++) {
			if (i == N - 1 || cur != S.charAt(i + 1)) {
				n[index++][cur == '1' ? 1 : 0] = count;
				count = 0;
				if (i != N - 1)
					cur = S.charAt(i + 1);
			}
			count++;
		}
//		for (int i = 0; i < n.length; i++)
//			System.out.println(Arrays.toString(n[i]));
		int ans = 0;
		for (int i = 0; i < index; i++) {
			int sum = 0;
			for (int j = 0; j < K + (K + (n[i][1] > 0 ? 1 : 0)); j++) {
				if (n.length > i + j)
					sum += n[i + j][1] + n[i + j][0];
			}
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
	}
    public static void main(String[] args) {
    	new Main().run();
    }
}