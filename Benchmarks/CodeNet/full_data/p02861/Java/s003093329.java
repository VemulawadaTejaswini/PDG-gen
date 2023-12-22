import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	static int N,dSum_i = 0;
	int Factorial;
	double[][] distance;
	double[] distanceSums;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		N = nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		distance = new double[N][N];
		Factorial = factorial(N);
		distanceSums = new double [Factorial]; // 8!
		for(int i=0;i<N;i++) {
			x[i] = nextInt();
			y[i] = nextInt();
		}

		double sum = 0;

		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				distance [i][j] = getDistance(x[i],y[i],x[j],y[j]);
				if(i!=j)sum += distance[i][j];
			}
		}

		out.println(sum/N);

/*


		List<Integer> list = new ArrayList<Integer>(N);
		for(int i=1;i<=N;i++)list.add(i);
		for(int i=0;i<N;i++) {
			boolean[] f = new boolean [N];
			f[i] = true;

			SearchAllRoots(f,0+1,0);
		}
*/


	}

	/*
	Object SearchAllRoots(boolean[] f,int cnt, double sum) {
		if(cnt == N) {
			distanceSums[dSum_i] = sum;
			dSum_i++;
			return 0;
		}
		for(int i=0;i<N;i++) {
			if(f[i] == false) {
				f[i] = true;
				return SearchAllRoots(f, cnt+1, sum);
			}
		}

		return 0;
		//return SearchAllRoots(f, cnt+1, sum);
	}
	*/
	static int factorial(int n){
		  if(n == 0){
		    return 1;
		  }
		  return n * factorial(n-1);
		}
	static double getDistance (double x1, double y1, double x2, double y2) {
		double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		return d;
	}
	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

	long gcd(long m,long n) {
		if (m<n) return gcd(n,m);
		if (n==0)return m;
		return gcd(n,m%n);
	}
}