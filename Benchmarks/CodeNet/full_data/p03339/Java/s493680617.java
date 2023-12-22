import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] w = new int[n];
		int[] e = new int[n];
		// i番目の位置よりも左側にいくつのWが存在するか
		for(int i = 0 ; i < n - 1 ; i++) {
			if(s.charAt(i) == 'W') w[i + 1] = w[i] + 1;
			else w[i + 1] = w[i];
		}
		// i番目の位置よりも右側にいくつのEが存在するか
		for(int i = n - 1 ; i >= 1 ; i--) {
			if(s.charAt(i) == 'E') e[i - 1] = e[i] + 1;
			else e[i - 1] = e[i];
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 0 ; i < n ; i++) {
			ans = Math.min(ans, w[i] + e[i]);
		}
		System.out.println(Arrays.toString(w));
		System.out.println(Arrays.toString(e));
		System.out.println(ans);
	}
}
