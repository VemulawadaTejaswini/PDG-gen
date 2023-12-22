import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] pos = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() - 1;
			pos[arr[i]] = i;
		}
		int ans = 0;
		int cur = 1;
		for (int i = 0; i + 1 < N; i++) {
			if (pos[i] < pos[i + 1]) {
				cur++;
				ans = Math.max(ans, cur);
			} else {
				cur = 1;
			}
		}
		ans = Math.max(ans, cur);
		System.out.println(N - ans);
	}
}
