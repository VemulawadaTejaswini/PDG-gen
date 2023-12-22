import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	final int MOD = 998244353;
	int N;
	int[][] p;
	int[] pow2;
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		p = new int[N][2];
		for (int i = 0; i < N; i++) {
			p[i][0] = sc.nextInt();
			p[i][1] = sc.nextInt();
		}
		pow2 = new int[N];
		pow2[0] = 0;
		for (int i = 1; i < N; i++)
			pow2[i] = (pow2[i-1]*2+1)%MOD;
		
		Arrays.sort(p, (a,b) -> Integer.compare(a[1], b[1]));
		for (int i = 0; i < N; i++) p[i][1] = i;
		Arrays.sort(p, (a,b) -> Integer.compare(a[0], b[0]));
		for (int i = 0; i < N; i++) p[i][0] = i;
		
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum = (sum + pow2[N-1] + 1)%MOD;
			
			int a12 = p[i][1];
			int a34 = N-1-p[i][1];
			int a13 = p[i][0];
			int a24 = N-1-p[i][0];
			int a1, a2, a3, a4;
			a1 = 0;
			for (int j = 0; j < N; j++) {
				if (p[j][0] > p[i][0]) continue;
				if (p[j][1] < p[i][1]) a1++;
			}
			a2 = a12 - a1;
			a3 = a13 - a1;
			a4 = a34 - a3;
			
			int s = (pow2[a12] + pow2[a34])%MOD;
			s = (s + pow2[a13])%MOD;
			s = (s + pow2[a24])%MOD;
			s = mod(s - pow2[a1], MOD);
			s = mod(s - pow2[a2], MOD);
			s = mod(s - pow2[a3], MOD);
			s = mod(s - pow2[a4], MOD);
			
			s = (pow2[N-1] - s)%MOD;
			sum = (sum + s)%MOD;
		}
		
		out(sum);
	}
	
	private int mod(int a, int m) {
		return (a >= 0)?a:(a+m)%m;
	}
	
	private void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.calc();
	}

}