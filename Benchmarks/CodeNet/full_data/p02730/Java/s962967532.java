import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		
		// 条件１
		if (!isKaibun(s)) {
			System.out.println("No");
			sc.close();
			return;
		}
		
		// 条件２
		String sub1 = s.substring(0, (n - 1) / 2);
		if (!isKaibun(sub1)) {
			System.out.println("No");
			sc.close();
			return;
		}
		
		// 条件３
		String sub2 = s.substring((n + 3) / 2 - 1, n);
		if (!isKaibun(sub2)) {
			System.out.println("No");
			sc.close();
			return;
		}
		
		System.out.println("Yes");
		sc.close();
	}
	
	static boolean isKaibun(String s) {
		char[] c = s.toCharArray();
		boolean isKaibun = true;
		int len = c.length;
		for (int i = 0; i < len / 2; i++) {
			if (c[i] != c[len - 1 - i]) {
				isKaibun = false;
				break;
			}
		}
		return isKaibun;
	}
}
