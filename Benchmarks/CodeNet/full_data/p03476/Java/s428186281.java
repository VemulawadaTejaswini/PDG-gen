import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int[] l = new int[q];
		int[] r = new int[q];
		for(int i = 0 ; i < q ; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		// エラトステネスの篩で素数を調べる
		int[] sosuu = new int[100010];
		for(int i = 3 ; i <= 100000 ; i++) {
			boolean ok = true;
			for(int j = 2 ; j * j <= i ; j++) {
				if(i == j) continue;
				if(i % j == 0 || ((i + 1) / 2) % j == 0) ok = false;
			}
			if(ok) sosuu[i]++;
		}
		int[] cnt = new int[100010];
		for(int i = 2 ; i < cnt.length ; i++) {
			cnt[i] = cnt[i - 1] + sosuu[i];
		}
		for(int i = 0 ; i < q ; i++) {
			System.out.println(cnt[r[i]] - cnt[l[i] - 1]);
		}
	}
}
