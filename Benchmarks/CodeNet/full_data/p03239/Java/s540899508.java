import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int te = sc.nextInt();
		int c[] = new int[n];
		int t[] = new int[n];

		for(int i=0;i<n;i++){
			c[i]=sc.nextInt();
			t[i]=sc.nextInt();
		}


		int ans = 99999;
		Boolean tle = true;
		for (int i = 0; i < n; i++) {
			if (t[i] <= te) {
				tle = false;
				if (c[i] < ans) {
					ans = c[i];
				}
			}
		}
		if (tle) {
			System.out.println("TLE");
		} else {
			System.out.println(ans);
		}

	}
}