import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int N = scan.nextInt();
		String S = scan.next();
		StringBuffer ans = new StringBuffer();
		for (int i = 0; i < S.length(); i++) {
			char temp = S.charAt(i);
			char ansTemp;
			if (temp + N > 'Z') {
				ansTemp = (char)(temp + N - 26);
			} else {
				ansTemp = (char)(temp + N);
			}
			ans = ans.append(ansTemp);
		}
		System.out.println(ans);
	}
}
