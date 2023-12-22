import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			String t = new String();
			int ans = Integer.MAX_VALUE;
			int tmp = 0;
			int dif = 0;
			int n = s.length();
			
			for (int i = 0; i < n - 1; i++) {
				t = s.substring(i, i + 3);
				tmp = Integer.parseInt(t);
				dif = Math.abs(753 - tmp);
				if (dif < ans) {
					ans = dif;
				}
			}
			System.out.println(tmp);
		}
	}
}
