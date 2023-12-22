import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0 ; i < n ; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		long ans = 1L<<62;
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				for(int k = 0 ; k < n ; k++) {
					for(int l = 0 ; l < n ; l++) {
						long cnt = 0;
						for(int m = 0 ; m < n ; m++) {
							if(x[i] <= x[m] && x[m] <= x[j] && y[k] <= y[m] && y[m] <= y[l]) {
								cnt++;
							}
						}
						if(cnt >= a) {
							ans = Math.min(ans, 1L * (x[j] - x[i]) * (y[l] - y[k]));
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
