import java.util.Scanner;
import java.util.stream.IntStream;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static int N = 0;
	public static long K = 0L;

	public static void main(String[] args) {

		N = in.nextInt();
		K = in.nextLong();
		int[] A = new int[N];
		for(int i=0; i < N; i++) {
			A[i] = in.nextInt();
		}
		
		create(A);
		
	}

	public static void create(int[] A) {
		long cnt = 0L;
		for(int i=0;i < A.length; i++) {
			int r = A[i];
			int youso = 1;
			if(r % K == youso) cnt++;
			for(int j=i+1; j<A.length; j++) { 
				r+=A[j];
				youso = j-i+1;
				if(r % K == youso) cnt++;
			}
		}
		System.out.println(cnt);
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}