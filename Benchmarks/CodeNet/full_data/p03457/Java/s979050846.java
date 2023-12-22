import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] t = new int[N+1];
		int[] x = new int[N+1];
		int[] y = new int[N+1];
		boolean ok = true;
		for(int i = 1; i <= N; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			if(t[i]-t[i-1] < Math.abs(x[i]-x[i-1]) + Math.abs(y[i]-y[i-1]) || (t[i] - x[i] - y[i]) % 2 != 0) {
				ok = false;
				break;
			}
		}
		System.out.println(ok ? "Yes" : "No");
	}

}