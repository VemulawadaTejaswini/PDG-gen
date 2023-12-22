import java.util.Scanner;

public class Main {
	static int N;
	static String S;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.next();
		
		int leader = 0;
		int ans = Integer.MAX_VALUE;
		
		for (int a = 0; a < N; a++) {
			int count = 0;
			for (int i = 0; i < N; i++) {
				if (i < leader) {
					if (S.charAt(i) == 'W') {
						count++;
					}
				} else {
					if (S.charAt(i) == 'E') {
						count++;
					}
				}
			}
			ans = Math.min(ans, count);
			leader++;
		}
		System.out.println(ans);
	}
}