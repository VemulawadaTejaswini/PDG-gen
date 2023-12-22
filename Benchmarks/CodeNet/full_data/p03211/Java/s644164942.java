import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		int l = S.length();
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < l - 2; i++) {
			String s = S.substring(i, i + 3);
			int t = Integer.parseInt(s);
			min = Math.min(min, Math.abs(t - 753));
		}
		System.out.println(min);
	}
}