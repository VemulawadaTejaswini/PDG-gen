import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = 0;
		long min;
		long a[] = new long[n + 1];
		long b[] = new long[n + 1];
		long c[] = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = a[i] - b[i];
if(i==1){
min=b[i];
}
			if(c[i]!=0){
				y=1;
			}

			if (c[i] >= 0) {
				if(b[i]<=min)
			min=b[i];
			}
		}
		long ans = 0;
		for (int i = 1; i <= n; i++) {

				ans += b[i];

		}

		if (y == 0) {
			System.out.println(0);
		} else {
			System.out.println(ans-min);
		}
	}

}