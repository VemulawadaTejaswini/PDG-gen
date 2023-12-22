import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();

	public static int N;

	public static void main(String[] args) {

		N = in.nextInt();
		long sum1 = 0;
		long sum2 = 0;
		if (N % 2 == 0) {
			for(long i =0; i < N; i++) {
				long tmp = in.nextLong();
				if(i % 2==0) {
					sum1 += tmp; 
				}else {
					sum2 += tmp;
				}
			}
		}else {
			sum1 = solve(N);
		}
		


		System.out.println(sum1 > sum2 ? sum1 : sum2);

	}

	public static long[] A;
	public static long max;

	public static long solve(int N) {

		A = new long[N];
		for(int i=0;i<N;i++) A[i] = in.nextLong();

//		debug.add(0);
		int f = 0;
		s(A[f], f+0, f+0, 1);
		s(A[f], f+1, f+1, 1);
		s(A[f], f+2, f+2, 1);

		return max;
	}

//	public static LinkedList<Integer> debug = new LinkedList<>();


	public static void s(long n, int i, int step, int how) {
		i = i + 2;
		if(how > (N / 2)-1) {
			return;
		}
		if(how == (N / 2) -1) {
			for(int last=i;last<N;last++) {
//				debug.add(last);
				max = Math.max(max, n+A[last]);
//				System.out.println(debug);
//				debug.pollLast();
			}
			return;
		}
		for(int j=0;j+step<3;j++) {
//			debug.add(i+j);
			s(n+A[i], i+j, j+step, how+1);
//			debug.pollLast();
		}
	}


	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}