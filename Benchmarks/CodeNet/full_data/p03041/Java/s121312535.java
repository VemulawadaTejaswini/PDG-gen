
public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();

		String[] s = S.split("");
		s[K-1] = s[K-1].toLowerCase();

		System.out.println(String.join("", s));
	}
}