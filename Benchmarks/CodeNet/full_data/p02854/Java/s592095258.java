import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		long[] a = new long[n+1];
		long[] s = new long[n+1];
		s[0] = 0;

		for(int i = 1; i < n+1; i++) {
			a[i] = scan.nextInt();
			s[i] = s[i-1] + a[i];
		}

		int mid = 0;

		for(int i = 1; s[i] <= s[n]/2; i++) {mid = i;}


		long ans = Math.abs(s[n] - 2*s[mid]);

		if(s[n] - 2*s[mid] > 0) {
			mid++;
		}else {
			mid--;
		}
		long tmp = Math.abs(s[n] - 2*s[mid]);
		if(tmp < ans) {
			ans = tmp;
		}

		System.out.println(ans);

	}

}
