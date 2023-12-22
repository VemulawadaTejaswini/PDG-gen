
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int k = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			a[tmp]++;
		}
		int cnt = 0;
		for(int i = 1; i < n + 1; i++) {
			if(a[i] > 0)
				cnt++;
		}
		int ans = 0;
		for(int i = 0; i < cnt - k; i++) {
			int min = n;
			int num = 0;
			for(int j = 1; j < n + 1; j++) {
				if(a[j] != 0 && a[j] < min) {
					num = j;
					min = a[j];
				}
			}
			a[num] = 0;
			ans += min;
		}
		System.out.println(ans);
	}

}
