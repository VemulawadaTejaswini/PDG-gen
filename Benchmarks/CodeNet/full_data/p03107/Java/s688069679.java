import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int l = S.length();
		int N = l;
		while(true) {
			String t = S.replaceAll("10", "");
			t = t.replaceAll("01", "");
			if(t.length() == l) {
				break;
			}
			S = t;
			l = t.length();
		}
		int ans = N - l;
		System.out.println(ans);
	}
}