
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n + 2];
		long[] b = new long[n + 2];
		for(int i = 1; i < n + 1; i++) {
			b[i] = sc.nextLong();
		}
		for(int i = 1; i < n + 1; i++) {
			a[i] = sc.nextLong();
		}
		a[0] = a[n];
		a[n + 1] = a[1];
		b[0] = b[n];
		b[n + 1] = b[1];
		long cnt = 0;
		boolean flag = true;
		while(flag) {
			flag = false;
			for(int i = 1; i < n + 1; i++) {
				if(a[i] > a[i - 1] && a[i] > a[i + 1] && a[i] - a[i - 1] - a[i + 1] >= b[i]) {
					flag = true;
					a[i] = a[i] - a[i - 1] - a[i + 1];
					cnt++;
					if(i == 1)
						a[n + 1] = a[1];
					if(i == n)
						a[0] = a[n];
				}
			}
		}
		boolean ans = true;
		for(int i = 1; i < n + 1; i++) {
			if(a[i] != b[i]) {
				ans = false;
				break;
			}
		}
		if(ans) {
			System.out.println(cnt);
		} else {
			System.out.println(-1);
		}
	}

}
