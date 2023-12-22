import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}

	public void solve(Scanner sc) {
		String s = sc.next();
		String t = sc.next();
		
		for(int i=0; i<s.length(); i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(s.charAt(s.length()-1));
			sb.append(s.substring(0, s.length()-1));
			
			if(sb.toString().equals(t)) {
				System.out.println("Yes");
				return;
			}
			s = sb.toString();
		}
		
		System.out.println("No");
	}
}