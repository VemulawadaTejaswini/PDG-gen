import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[N];
		long[] b = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();
		long t1 = 0;
		long t2 = 0;
		for(int i = 0; i < N; i++) {
			if(a[i] >= b[i]) {
				t1 += (a[i] - b[i]);
			}else {
				long t = b[i] - a[i];
				if(t % 2 == 0) {
					t2 += t / 2;
				}else {
					t2 += t / 2;
					t1++;
				}
			}
		}
		if(t1 <= t2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}