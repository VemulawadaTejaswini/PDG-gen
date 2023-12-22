import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] H = new long[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextLong();
		}
		sc.close();

		int ans = 0;

		for (int left = 0; left < N; left++) {
			int now = left;
			int right = left + 1;
			// 右隣がいまのマスより小さければright++
			while(right < N && H[right] <= H[now]) {
				now++;
				right++;
			}

			// 更新
			ans = Math.max(ans, (right - 1) - left);
		}

		System.out.println(ans);
	}
}
