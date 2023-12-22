import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		int N = in.nextInt();
		char[] S = in.next().toCharArray();
		char[] T = in.next().toCharArray();

		StringBuffer sb = new StringBuffer();
		for(int i=0; i < N*2; i++) {
			if (i % 2 == 0) {
				sb.append(S[i/2]);
			}else {
				sb.append(T[i/2]);
			}
		}

		System.out.println(sb.toString());

	}

	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}