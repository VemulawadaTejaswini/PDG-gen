import java.util.*;
public class Main {
	public static boolean calc(int[] a,int[] b) {
		double d = 0;
		for(int i = 0; i < a.length; i++) {
			d += Math.pow(a[i]-b[i], 2);
		}
		double s = Math.floor(Math.sqrt(d));
		
		if(s*s == d) return true;
		else return false;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int D = stdIn.nextInt();
		int[][] X = new int[N][D];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < D; j++) {
				X[i][j] = stdIn.nextInt();
			}
		}
		
		int ans = 0;
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				if(calc(X[i],X[j])) {
					ans++;
				}
			}
		}
		
		System.out.println(ans);

	}

}