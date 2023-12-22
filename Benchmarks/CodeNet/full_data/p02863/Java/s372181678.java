import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int t = Integer.parseInt(sa[1]);
		Obj[] arr = new Obj[n];
		for (int i = 0; i < arr.length; i++) {
			Obj o = new Obj();
			sa = br.readLine().split(" ");
			o.i = i;
			o.a = Integer.parseInt(sa[0]);
			o.b = Integer.parseInt(sa[1]);
			arr[i] = o;
		}
		br.close();

		Arrays.parallelSort(arr, (o1, o2) -> o2.b - o1.b);
		int[][] dp = new int[n + 1][t];
		int[][] dp2 = new int[n + 1][t];
		for (int i = 0; i < n; i++) {
			int a = arr[i].a;
			int b = arr[i].b;
			for (int j = 0; j < t; j++) {
				if (j >= a && dp[i][j] < dp[i][j - a] + b) {
					dp[i + 1][j] = dp[i][j - a] + b;
					dp2[i + 1][j] = j - a; 
				} else {
					dp[i + 1][j] = dp[i][j];
					dp2[i + 1][j] = j; 
				}
			}
		}

		int w = t - 1;
		Set<Integer> set = new HashSet<>();
		for (int i = n - 1; i >= 0; i--) {
			int a = arr[i].a;
			if (dp2[i + 1][w] == w - a) {
				set.add(i);
			}
			w = dp2[i + 1][w];
		}

		int ans = dp[n][t - 1];
		for (int j = 0; j < arr.length; j++) {
			if (!set.contains(j)) {
				ans += arr[j].b;
				break;
			}
		}
		System.out.println(ans);
	}

	static class Obj {
		int i, a, b;
	}
}
