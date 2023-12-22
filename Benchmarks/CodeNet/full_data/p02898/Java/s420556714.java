import java.util.Arrays;
import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		int N = in.nextInt();
		int K = in.nextInt();
		int cnt = 0;
		for(int i=0;i<N;i++) {
			if ( in.nextInt() >= K) cnt++;
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