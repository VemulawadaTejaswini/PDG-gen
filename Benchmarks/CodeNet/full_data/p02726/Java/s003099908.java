import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] a = new int[n + 1];

		for(int i = 1 ; i < n ; i++) {
			for(int j = i + 1 ; j <= n ; j++) {
				a[Math.min(j - i, Math.abs(x - i) + 1 + Math.abs(j - y))]++;
			}
		}
		String s = "" + a[1];
		StringBuilder sb = new StringBuilder(s);
		for(int i = 2 ; i < n ; i++) {
		sb.append("\n" + a[i]);
		}
		System.out.println(sb.toString());
		sc.close();

	}
}

