import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String S = s.substring(s.indexOf("A"), s.lastIndexOf("Z"));
		int N = S.length();
		System.out.println(N + 1);
	}
}
