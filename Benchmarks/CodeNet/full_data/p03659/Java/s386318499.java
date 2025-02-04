import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N;
		long ans = 0;

		N = Integer.parseInt(sc.next());

		int[] a = new int[N];

		for(int i = 0; i < N; i++){
			a[i] = Integer.parseInt(sc.next());
		}

		long x = 0;
		long y = 0;

		x = a[0];
		for(int i = 1; i < N; i++){
			y += a[i];
		}
		ans = Math.abs(x-y);

		for(int i = 1; i < N-1; i++){
			x += a[i];
			y -= a[i];
			ans = Math.min(ans, Math.abs(x-y));
		}

		System.out.println(ans);

	}

}