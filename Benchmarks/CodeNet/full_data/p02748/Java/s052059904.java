import java.util.Scanner;

 
public class Main {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {
 
		int A = in.nextInt();
		int B = in.nextInt();
		int M = in.nextInt();
		int[] Rfzs = new int[A];
		int[] Mcws = new int[B];
		int minRfz = Integer.MAX_VALUE;
		int minMcw = Integer.MAX_VALUE;
		for(int i=0;i<A;i++) {
			Rfzs[i]=in.nextInt();
			minRfz = Math.min(minRfz, Rfzs[i]);
		}
		for(int i=0;i<B;i++) {
			Mcws[i]=in.nextInt();
			minMcw = Math.min(minMcw, Mcws[i]);
		}

		int answer = minRfz + minMcw;
		for(int i=0;i<M;i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int c = in.nextInt();
			int val = Rfzs[x-1] + Mcws[y-1] - c;
			answer = Math.min(answer, val);
		}
		System.out.println(answer);
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}

}