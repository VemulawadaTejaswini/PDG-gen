import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int N = sc.nextInt();                
		int K = sc.nextInt();

		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
		}
        Arrays.sort(h);
		// 答えを出力
        int ans = 0;
        int sum = 0;
        boolean first = true;
		for (int i = 0; i <= N-K; i++) {
          sum = h[i+K-1] - h[i];
          if (first || sum < ans) {
            ans = sum;
            first = false;
          } 
		}
		System.out.println(ans);
	}
}
