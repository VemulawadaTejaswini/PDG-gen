import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int[] n = new int[c.length];
		for (int i = 0; i < n.length; i++) {
			n[i] = Character.getNumericValue(c[i]);
		}
		int ans = Integer.MAX_VALUE /10;
		for (int i = 0; i < n.length -2; i++) {
			int X = n[i]*100 + n[i+1]*10 + n[i+2];
			ans = Math.min(ans, Math.abs(753-X));
		}
		System.out.println(ans);
		sc.close();
	}
}
