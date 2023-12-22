import java.util.Scanner;

public class Main {

	static String a;
	static int n, k;
	static int[] d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		n = a.length();
		k = sc.nextInt();
		d = new int[k];
		for(int i = 0 ; i < k ; i++) d[i] = sc.nextInt();
		int ans = dfs(0, "");
		System.out.println(ans == 1001001001 ? a : ans);
	}

	public static int dfs(int i, String x) {
		if(i == n) {
			if(x.charAt(0) == '0') return 1001001001;
			if(Integer.valueOf(x) >= Integer.valueOf(a)) return Integer.valueOf(x);
			return 1001001001;
		}
		int ret = 1001001001;
		for(int j = 0 ; j <= 9 ; j++) {
			boolean ok = true;
			for(int l = 0 ; l < k ; l++) {
				if(j == d[l]) ok = false;
			}
			if(ok) ret = Math.min(ret, dfs(i + 1, x + String.valueOf(j)));
		}
		return ret;
	}

}