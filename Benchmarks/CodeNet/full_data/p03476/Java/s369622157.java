import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();
		int MAX = 100001;
		boolean[] np = new boolean[MAX];

		np[0] = true;
		np[1] = true;
		for (int i = 2; i < MAX; i++) {
			if (!np[i]) {
				for (int j = i + i; j < MAX; j += i) {
					np[j] = true;
				}
			}
		}

		int[] ans = new int[q];
		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int cnt = 0;
			if (l % 2 == 0) {
				l++;
			}
			for (int j = l; j <= r; j+=2) {
				if (!np[j] && !np[(j + 1) / 2]) {
					cnt++;
				}
			}
			ans[i] = cnt;
		}

		for (int i = 0; i < q; i++) {
			System.out.println(ans[i]);
		}
	}
}
