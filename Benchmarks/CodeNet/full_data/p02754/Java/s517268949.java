import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long a = scan.nextLong();
		long b = scan.nextLong();
		
		if (a == 0) {
			System.out.println(0);
			return;
		}
		if (b == 0) {
			System.out.println(n);
			return;
		}
		String s = "";
		for (int i = 0; s.length() < n; i++) {
			for (int j = 0; j < a; j++) {
				s += "b";
			}
			for (int j = 0; j < b; j++) {
				s += "r";
			}
		}
		long cnt = 0;
		for (int i = 0; i < n && i < s.length(); i++) {
			if (s.charAt(i) == 'b') {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}