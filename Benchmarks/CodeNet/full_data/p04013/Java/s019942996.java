import java.util.Scanner;

public class Main {

	static int a, b;
	static int[] x;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		x = new int[a];
		for(int i = 0 ; i < a ; i++) x[i] = sc.nextInt();
		int ans = dfs(0, 0, 0);
		System.out.println(ans);
	}

	public static int dfs(int n, int sum, int cnt) {
		if(n == a) {
			if(cnt == 0) return 0;
			if(sum % cnt == 0 && sum / cnt == b) return 1;
			else return 0;
		}
		int ret = 0;
		ret += dfs(n + 1, sum, cnt);
		ret += dfs(n + 1, sum + x[n], cnt + 1);
		return ret;
	}

}
