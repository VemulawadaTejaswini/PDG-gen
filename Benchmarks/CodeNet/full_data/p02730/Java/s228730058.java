import java.util.Scanner;

public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		String S = in.next();
		StringBuilder sb = new StringBuilder();
		sb.append(S);
		if (!S.equals(sb.reverse().toString())) {
			System.out.println("No");
			return;
		}

		String s1 = S.substring(0,(S.length()-1)/2);
		sb = new StringBuilder();
		sb.append(s1);
		if (!s1.equals(sb.reverse().toString())) {
			System.out.println("No");
			return;
		}

		int idx1 = (S.length()+3)/2-1;
		int idx2 = S.length()-1;
		if(idx2 < idx1) {
			idx2 = idx1;
			idx1 = S.length()-1;
		}
		String s2 = S.substring((S.length()+3)/2-1, S.length());
		sb = new StringBuilder();
		sb.append(s2);
		if (!s2.equals(sb.reverse().toString())) {
			System.out.println("No");
			return;
		}

		System.out.println("Yes");
	}


	public static class MyScanner {
		Scanner sc = new Scanner(System.in);
		String next() { return sc.next();}
		int nextInt() { return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next()); }
	}
}