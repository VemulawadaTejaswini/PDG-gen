import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int[] sum = new int[n];
		int all = Math.abs(a[0]);
		for(int i = 1 ; i < n ; i++) {
			all += Math.abs(a[i] - a[i - 1]);
		}
		all += Math.abs(a[n - 1]);
		for(int i = 0 ; i < n ; i++) {
			if(i == 0) {
				sum[i] = Math.abs(a[i]) + Math.abs(a[i + 1] - a[i]);
			} else if(i == n - 1) {
				sum[i] = Math.abs(a[i]) + Math.abs(a[i] - a[i - 1]);
			} else {
				sum[i] = Math.abs(a[i] - a[i - 1]) + Math.abs(a[i + 1] - a[i]);
			}
		}
//		System.out.println(all);
//		System.out.println(Arrays.toString(sum));
		for(int i = 0 ; i < n ; i++) {
			if(i == 0) {
				System.out.println(all - sum[i] + Math.abs(a[1]));
			} else if(i == n - 1) {
				System.out.println(all - sum[i] + Math.abs(a[n - 2]));
			} else {
				System.out.println(all - sum[i] + Math.abs(a[i + 1] - a[i - 1]));
			}
		}
	}
}
