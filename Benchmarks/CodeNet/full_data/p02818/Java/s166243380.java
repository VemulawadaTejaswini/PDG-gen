import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		long A = in.nextLong();
		long B = in.nextLong();
		long K = in.nextLong();

		long a=A;
		long b=B;
		long k=K;

		if (A < K) {
			a = 0;
			k = k - A;
			b = b < k ? 0 : b - k;
		} else {
			a=a-k;
		}

		System.out.println(a+" "+b);

	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}