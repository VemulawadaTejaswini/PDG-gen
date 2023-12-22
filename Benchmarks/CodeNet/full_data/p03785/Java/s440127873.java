import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, c, k, ans = 0, cnt = 1, f, i;
		n = sc.nextInt();
		c = sc.nextInt();
		k = sc.nextInt();
		int[] a = new int[n];
		for(i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		f = a[0];
		for(i = 0; i  < n; i++){
				if (cnt == c) {
					ans++; cnt = 0;
				} else if (cnt == 0) {
					f = a[i++] + k;
					cnt++;
				} else {
					if (a[i] <= f) {
						cnt++; i++;
					} else {
						ans++; cnt = 0;
					}
				}
			}
			if (cnt > 0) {
				ans++;
			}
		System.out.println(ans);
	}
}