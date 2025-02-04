import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0 ; i < N ; i++) {
			a[i] = sc.nextInt();
		}
		long cnt = 0;
		for(int i = 0 ; i < N - 1 ; i++) {
			if(a[i] > x) {
				cnt += a[i + 1] + a[i] - x;
				a[i] = x;
				a[i + 1] = 0;
			} else {
				if(a[i] + a[i + 1] > x) {
					cnt += a[i] + a[i + 1] - x;
					a[i + 1] = x - a[i];
				}
			}
		}
		System.out.println(cnt);
	}
}
