import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] a = new int[N+1];
		for(int i=0; i<N+1; i++) {
			a[i] = sc.nextInt();
		}

		int[] b = new int[N];
		for(int i=0; i<N; i++) {
			b[i] = sc.nextInt();
		}

		sc.close();

		int cnt = 0;
		for(int i=N; i>0; i--) {
			if(a[i]>=b[i-1]) {
				cnt += b[i-1];
				b[i-1] = 0;
			}else if(a[i]<b[i-1]) {
				b[i-1] -= a[i];
				cnt += a[i];
				if(a[i-1]>b[i-1]) {
					cnt += b[i-1];
					a[i-1] -= b[i-1];
				}else {
					cnt += a[i-1];
					a[i-1] = 0;
				}
			}
		}

		System.out.println(cnt);
	}
}