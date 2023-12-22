import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), x = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) a[i] = sc.nextInt();
		int ans = 0;
		for(int i = 0; i + 1 < N; i++) {
			if(a[i] + a[i + 1] > x) {
				int minus = a[i + 1] + a[i] - x;
				ans += Math.max(minus, 0);
				if(minus <= 0) continue;
				a[i + 1] = Math.max(a[i + 1] - minus, 0);
				minus -= a[i + 1];
				if(minus > 0) {
					a[i] -= minus;
				}
			}
		}
		System.out.println(ans);
	}
}