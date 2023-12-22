import java.util.Scanner;

public class Main {

	int n, m;
	String s, t;

	public static int gcd(int a, int b) {
		return b > 0 ? gcd(b, a % b) : a;
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String nm = sc.nextLine();
		String[] len = nm.split(" ");

		int n = Integer.parseInt(len[0]);
		int m = Integer.parseInt(len[1]);

		String s = sc.nextLine();
		String t = sc.nextLine();
		
		if(n > m) {
			int swap = n;
			n = m;
			m = swap;
			
			String sw = s;
			s = t;
			t = sw;
		}

		for (int i = 0; i < n; i++) {
			if ((m * i) % n == 0) {
				if (s.charAt(i) != t.charAt((m * i) / n)) {
					System.out.println("-1");
					return;
				}
			}
		}

		System.out.println(lcm(n, m));
		return;
	}
}
