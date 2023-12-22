import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] a = new int[N];
		int sum_a = 0;
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
			sum_a += a[i];
		}

		int b = (-(N+1) / 2) + (sum_a / N);

		int ans = 0;
		for(int i=0;i<N;i++) {
			ans += Math.abs(a[i] - (b + (i+1)));
		}

		System.out.println(ans);
	}

}
