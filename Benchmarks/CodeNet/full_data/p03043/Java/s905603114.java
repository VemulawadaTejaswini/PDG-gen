import java.util.Scanner;

public class Main {
	static int N,K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();

		double n = N;
		double ans = 0;
		double a[] = new double[N];

		for (int i = 1; i <= N; i++) {
			//System.out.println("count "+count(i));
			a[i-1] = n * (double)Math.pow(2, count(i));
		}

		for (int i = 0; i < N; i++) {
			//System.out.println("a[] "+(1.0/a[i]));
			ans += (1.0/a[i]);
		}
		System.out.println(ans);


//		double a = (1.0/48.0)+(1.0/24.0)+(1.0/12.0);
//		System.out.println(a);
	}
	static int count(int a) {
		int count = 0;
		while (a <= K) {
			a *= 2;
			count++;
		}
		return count;
	}
}

