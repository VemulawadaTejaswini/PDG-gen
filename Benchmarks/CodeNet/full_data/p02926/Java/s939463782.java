import java.util.*;

public class Make {
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
			return Double.compare(theta(), t.theta());
		}
	}
	public Make() {
		sc = new Scanner(System.in);
	}
	
	void calc() {
		N = sc.nextInt();
		v = new Vec[N];
		for (int i = 0; i < N; i++) {
			v[i] = new Vec();
			v[i].x = sc.nextInt();
			v[i].y = sc.nextInt();
		}
		
		Arrays.sort(v);
		double max = -1;
		for (int a = 0; a < N; a++) {
			for (int b = a+1; b < a+1+N; b++) {
				double len = len(a, b);
				if (len > max) max = len;
			}
		}
		System.out.println(max);
	}
	
	double len(int a, int b) {
		double x = 0d;
		double y = 0d;
		for (int i = a; i < b; i++) {
			x += v[i%N].x;
			y += v[i%N].y;
		}
		return Math.sqrt(x*x + y*y);
	}
	
	public static void main(String[] args) {
		new Make().calc();
	}

}