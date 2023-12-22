import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		int[] a = new int[N];
		for (int i=0; i<N; i++) {
			a[i]  = sc.nextInt();
		}
		int res = 0;
		for (int i=2; i<100000; i++) {
			int x = 0;
			for (int j=0; j<N; j++) {
				x += (i%a[j]);
			}
			res = Math.max(res, x);
		}
		System.out.println(res);
	}
}
