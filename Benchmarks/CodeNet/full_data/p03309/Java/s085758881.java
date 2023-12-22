
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n + 1];
		long plus = 0;
		long minus = 0;
		long zero = 0;
		for(int i = 1; i < n + 1; i++) {
			a[i] = sc.nextLong() - i;
			if(a[i] > 0) {
				plus++;
			} else if(a[i] == 0) {
				zero++;
			} else {
				minus++;
			}
		}
		while((zero < minus || zero < plus) && plus != minus) {
			if(plus > minus) {
				for(int i = 1; i < n + 1; i++) {
					a[i]--;
				}
			} else {
				for(int i = 1; i < n + 1; i++) {
					a[i]++;
				}
			}
		}
		long ans = 0;
		for(int i = 1; i < n + 1; i++) {
			ans += Math.abs(a[i]);
		}
		System.out.println(ans);
	}

}
