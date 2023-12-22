import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		for(int i = 0; i < S.length(); i++) {
			if(i % 2 == 0) {
				if(S.charAt(i) == 'L') {
					System.out.println("No");
					return;
				}
			} else {
				if(S.charAt(i) == 'R') {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
