
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
		int num = 1;
		int check = 0;
		while(check < n + 1) {
			if(a[num] > a[num - 1] && a[num] > a[num + 1] && a[num] > a[num + 1] + a[num - 1]) {
				check = 0;
				if(a[num - 1] == b[num - 1] && a[num + 1] == b[num + 1]) {
					if((a[num] - b[num]) % (a[num + 1] + a[num - 1]) == 0) {
						cnt += (a[num] - b[num]) / (a[num + 1] + a[num - 1]);
						a[num] = b[num];
					} else {
						break;
					}
				} else {
					cnt += a[num] / (a[num + 1] + a[num - 1]);
					a[num] %= a[num + 1] + a[num - 1];
				}
				if(num == 1)
					a[n + 1] = a[1];
				if(num == n)
					a[0] = a[n];
			} else if(a[num] != b[num] && (a[num] == a[num + 1] || a[num] == a[num - 1])) {
				break;
			}
			check++;
			if(num < n)
				num++;
			else
				num = 1;

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
