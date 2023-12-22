import java.util.*;

public class Main {
	Scanner sc;
	int N;
	Vec[] v;
	
	static class Vec implements Comparable<Vec> {
		double x,y;
		double theta() {
			if (x == 0d && y == 0d) return 0d;
			return Math.atan2(y, x);
		}
		@Override public int compareTo(Vec t) {
			double t0 = theta();
			double t1 = t.theta();
			if (t0 > t1) return 1;
			if (t0 < t1) return -1;
			return 0;
		}
	}
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		v = new Vec[N];
		for (int i = 0; i < N; i++) {
			v[i] = new Vec();
			v[i].x = sc.nextInt();
			v[i].y = sc.nextInt();
		}
		
		Arrays.sort(v);
		int a = 0;
		int b = 1;
		double len = len(a, b);
		double max = len;
		while (a < N) {
			double lenb = ( b+1-N <= a )?len(a, b+1):0;
			double lena = ( b > a+1 )?len(a+1, b):0;
			if (lenb > len) {
				len = lenb;
				b++;
			} else {
				len = lena;
				a++;
			}
			if (len > max) max = len;
		}
		System.out.println(max);
	}
	
	private double len(int a, int b) {
		double x = 0d;
		double y = 0d;
		for (int i = a; i < b; i++) {
			x += v[i%N].x;
			y += v[i%N].y;
		}
		return Math.sqrt(x*x + y*y);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}

}