import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		long cnt = 0;
		
		for (int i = 0; i < n - 2; i++) {
			char ci = s.charAt(i);
			// System.out.println("ci=" + ci);
			for (int j = i + 1; j < n - 1; j++) {
				char cj = s.charAt(j);
				// System.out.println("  cj=" + cj);
				if (ci == cj) {
					continue;
				}
				
				String tmp = s.substring(j + 1);
				// System.out.println("  " + tmp);
				tmp = tmp.replaceAll("[" + ci + cj + "]", "");
				// System.out.println("  " + tmp);
				cnt += tmp.length();
				// System.out.println("  cnt=" + cnt);
				
				int k = j + (j - i);
				if (k < n && ci != s.charAt(k) && cj != s.charAt(k)) {
					// System.out.println("  ck=" + s.charAt(k));
					cnt--;
				}
				// System.out.println("  cnt=" + cnt);
			}
		}
		
		System.out.println(cnt);
	}
}
