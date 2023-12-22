import java.util.Arrays;
import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		int N = in.nextInt();
		int[] A = new int[N];
		for(int i=1;i<N+1;i++) {
			int p = in.nextInt();
			A[p-1] = i;
		}

		StringBuffer s = new StringBuffer();
		s.append(A[0]);
		for(int i=1;i<N;i++) {
			s.append(" ");
			s.append(A[i]);
		}
		System.out.println(s.toString());
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}