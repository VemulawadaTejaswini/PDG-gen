import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		int[] left = new int[n];
		int[] right = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int ans = 0;
		left[0] = 0;
		for(int i = 1; i < n; i++) {
			left[i] = gcd(left[i-1], A[i-1]);
		}
		right[n-1] = 0;
		for(int i = n-2; i >= 0; i--) {
			right[i] = gcd(right[i+1], A[i+1]);
		}
		for(int i = 0; i < n; i++) {
			ans = Math.max(ans, gcd(left[i], right[i]));
		}
		//クラスにしないでL、Rをmain内に配列として入れるプランに変更
		
		System.out.println(ans);
		sc.close();
	}
	private static int gcd(int m, int n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
	
}
