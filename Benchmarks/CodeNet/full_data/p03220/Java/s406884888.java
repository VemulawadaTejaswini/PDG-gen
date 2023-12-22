import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int[] h = new int[n];
		for(i = 0; i < n; i++) {
			h[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		double tp = 1000.0;
		double tt;
		int ti = 0;
		for(i = 0; i < n; i++) {
			tt = Math.abs(a - (t - h[i] * 0.006));
			if(tp > tt) {
				tp = tt;
				ti = i;
			}
		}
		System.out.println(ti+1);
	}
}