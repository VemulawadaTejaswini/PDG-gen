import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.next());
			String S = sc.next();
			
			final char w = '.';
			final char b  = '#';
			int count = 0;
			for(int i = 1; i < S.length(); i++) {
				if(w == S.charAt(i -1) && S.charAt(i -1) != S.charAt(i)) {
					count++;
					continue;
				}
			}
			if(b == S.charAt(N -2) && S.charAt(N -2) != S.charAt(N -1)) {
				count++;
			}
			System.out.println(count);
		} // Scanner Close
	}
}