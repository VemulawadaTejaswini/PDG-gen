import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if (a == 0) {
			System.out.println(0);
			return;
		}
		if (b == 0) {
			System.out.println(n);
			return;
		}
		int ans = 0;
		String s = "";
		for (int i = 0; s.length() < n; i++) {
			for (int j = 0; j < a; j++) {
				s += "b";
			}
			for (int j = 0; j < b; j++) {
				s += "r";
			}
		}
		int cnt = 0;
		for (int i = 0; i < n && i < s.length(); i++) {
			if (s.charAt(i) == 'b') {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}