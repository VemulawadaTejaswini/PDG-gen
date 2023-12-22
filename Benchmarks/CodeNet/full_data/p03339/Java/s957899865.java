import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] w = new int[n];
		int[] e = new int[n];
		if(s.charAt(0) == 'W') w[0] =  1;
		else e[0] = 1;
		for(int i = 0 ; i < n - 1 ; i++) {
			if(s.charAt(i + 1) == 'W') w[i + 1] = w[i] + 1;
			else w[i + 1] = w[i];
		}
		for(int i = 0 ; i < n - 1 ; i++) {
			if(s.charAt(i + 1) == 'E') e[i + 1] = e[i] + 1;
			else e[i + 1] = e[i];
		}
//		System.out.println(Arrays.toString(w));
//		System.out.println(Arrays.toString(e));
		int ans = Integer.MAX_VALUE;
		// i番目の位置よりも左のWの個数と右のEの個数を求める
		for(int i = 0 ; i < n ; i++) {
			if(i == 0) ans = Math.min(ans, e[n - 1] - e[i]);
			else ans = Math.min(ans, w[i - 1] + e[n - 1] - e[i]);
		}
		System.out.println(ans);
	}
}
