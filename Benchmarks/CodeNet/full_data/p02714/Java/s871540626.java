import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		int r = 0;
		int g = 0;
		int b = 0;
		
		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if (c == 'R') r++;
			if (c == 'G') g++;
			if (c == 'B') b++;
		}
		
		long ans = r * g * b;
		
		for (int st = 0; st < n - 2; st++) {
			for (int dist = 1; st + dist * 2 < n; dist++) {
				char si = s.charAt(st);
				char sj = s.charAt(st + dist);
				char sk = s.charAt(st + dist * 2);
				if (si != sj && sj != sk && sk != si)
					ans--;
			}
		}
		
		System.out.println(ans);
	}
}
