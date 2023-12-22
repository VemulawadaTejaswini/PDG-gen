import java.util.Scanner;
 
public class Test {
 
	public static final MyScanner in = new MyScanner();
 
	public static void main(String[] args) {
 
		char[] S = in.nextLine().toCharArray();
		boolean answer = true;
		boolean b = true;
		for(char c: S) {
			if (b) {
				if (!(c == 'h')) answer = false;
				b = !b;
			}else {
				if (!(c == 'i')) answer = false;
				b = !b;
			}
		}
		System.out.println(answer ? "Yes" : "No");
	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}

}