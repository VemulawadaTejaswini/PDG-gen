import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();
	
	public static void main(String[] args) {

		int N = in.nextInt();
		String S = in.next();

		for(char c: S.toCharArray())
			System.out.print(rotateAlphas(c, N));

		System.out.println();

	}

	public static char rotateAlphas(char c, int num) {
		int p = c + num;
		if (p > 90) p = p - 26;
		return Character.toChars(p)[0];
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}