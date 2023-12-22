import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}

	public void solve(Scanner sc) {
		String s = sc.next();
		int result = 0;
		
		
		int originLength = s.length();
		s = s.replaceAll("01|10", "");
		while(originLength != s.length()) {
			result += originLength - s.length();
			originLength = s.length();
			s = s.replaceAll("01|10", "");
		}
		
		System.out.println(result);
		
	}
}
