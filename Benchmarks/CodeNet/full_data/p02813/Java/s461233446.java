
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			q[i] = sc.nextInt();
		}
		boolean flag = false;
		long ans = 0;
		for(int i = 0; i < n; i++) {
			if(flag) {
				if(i == n - 1)
					ans++;
				long temp = 0;
				for(int j = i + 1; j < n; j++) {
					if(p[j] < p[i]) {
						temp++;
					}
				}
				for(int j = 1; j < n - i; j++) {
					temp *= j;
				}
				ans += temp;
				temp = 0;
				for(int j = i + 1; j < n; j++) {
					if(q[j] > q[i]) {
						temp++;
					}
				}
				for(int j = 1; j < n - i; j++) {
					temp *= j;
				}
				ans += temp;
			} else {
				if(i == n - 1 && p[i] != q[i])
					ans++;
				if(p[i] != q[i]) {
					if(p[i] < q[i]) {
						int[] temp = q;
						q = p;
						p = temp;
					}
					flag = true;
					for(int j = i + 1; j < n; j++) {
						if(p[j] < p[i] && p[j] > q[i]) {
							ans++;
						}
					}
					for(int j = 1; j < n - i; j++) {
						ans *= j;
					}
				}
			}
		}
		System.out.println(ans);

	}

}
