import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		if(kaibun(s, n)) {
			if(kaibun(s.substring(0, n / 2 + 1), n / 2)) {
				String s2 = s.substring((n + 3) / 2 - 1);
				if(kaibun(s2, s2.length())){
					System.out.println("Yes");
				}
			}
		}
		sc.close();
	}

	public static boolean kaibun(String s, int n) {
		for(int i = 0; i < n / 2; i++) {
			if(s.charAt(i) != s.charAt(n - i - 1)){
				System.out.println("No");
				return false;
			}
		}
		return true;
	}
}
