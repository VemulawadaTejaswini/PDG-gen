
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(n == 1) {
			int ans = 10;
			for(int i = 0; i < m; i++) {
				sc.next();
				int c = sc.nextInt();
				if(ans < 10 && ans != c) {
					ans = -1;
				} else {
					ans = c;
				}
			}
			System.out.println(ans);
		} else {
			int[] s = new int[m];
			int[] c = new int[m];
			for(int i = 0; i < m; i++) {
				s[i] = sc.nextInt() - 1;
				c[i] = sc.nextInt();
			}
			for(int i = (int) Math.pow(10, n - 1); i <= (int) Math.pow(10, n); i++) {
				if(i == (int) Math.pow(10, n)) {
					System.out.println(-1);
				} else {
					boolean ans = true;
					for(int j = 0; j < m; j++) {
						ans = ans && Integer.toString(i).charAt(s[j]) == Integer.toString(c[j]).charAt(0);
					}
					if(ans) {
						System.out.println(i);
						break;
					}
				}
			}
		}

	}

}
