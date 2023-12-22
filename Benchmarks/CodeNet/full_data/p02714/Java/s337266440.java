import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		long sum = 0;
		int r =0;
		int g = 0;
		int b = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'R') {
				r++;
			} else if (s.charAt(i) == 'G') {
				g++;
			} else if (s.charAt(i) == 'B') {
				b++;
			}
		}
		sum = r*g*b;
		long sub =0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (s.charAt(j) == s.charAt(i)) {
					continue;
				}
				int k = j + j -i;
				if (k>=n || s.charAt(k) == s.charAt(i) || s.charAt(k) == s.charAt(j)) {
					continue;
				}
				sub++;
			}
		}
		System.out.println(sum-sub);
	}

}
