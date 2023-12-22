import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int ans = 753;
		for (int i = 0; i < S.length() - 2; i++) {
			int num = 753 - Integer.parseInt(S.substring(i, i+3));
			if (num < 0) num *= -1;
			if (num < ans) ans = num;
		}
		System.out.println(ans);
	}
}