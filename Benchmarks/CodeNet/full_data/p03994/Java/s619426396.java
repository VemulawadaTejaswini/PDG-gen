import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int K = sc.nextInt();
		sc.close();
		int n = s.length();
		int[] c = new int[n];
		int[] k = new int[n];
		for(int i = 0; i < n; i++) {
			char c0 = s.charAt(i);
			c[i] = (int)(c0 - 'a');
			int g = 26 - (int)(c0 - 'a');
			k[i] = g;
		}

		int r = K;
		for(int i = 0; i < n; i++) {
			if(r - k[i] > 0) {
				r -= k[i];
				c[i] = 0;
			}
		}
		c[n - 1] = (c[n - 1] + r % 26) % 26;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			char c0 = (char)(c[i] + (int)'a');
			sb.append(c0);
		}
		System.out.println(sb.toString());
	}
}