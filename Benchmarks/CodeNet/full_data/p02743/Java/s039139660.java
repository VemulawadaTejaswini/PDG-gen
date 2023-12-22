import java.util.Scanner;

public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();

		String answer =  Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c) ? "Yes" : "No";

		System.out.println(answer);
	}


	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}