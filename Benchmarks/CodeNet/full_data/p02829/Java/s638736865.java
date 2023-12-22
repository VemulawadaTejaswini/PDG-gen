import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		int A = in.nextInt();
		int B = in.nextInt();

		if (A+B == 3) {
			System.out.println(3);
		} else if (A+B == 4) {
			System.out.println(2);
		} else if (A+B == 5) {
			System.out.println(1);
		}
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}