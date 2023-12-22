import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int cnt = 0;
		for(int i = 0; i < N.length(); i++) {
			if(i % 2 == 0) {
				if(N.charAt(i) == 'R' || N.charAt(i) == 'U' || N.charAt(i) == 'D') {
					cnt++;
				}
			}else if(i % 2 == 1) {
				if(N.charAt(i) == 'L' || N.charAt(i) == 'U' || N.charAt(i) == 'D') {
					cnt++;
				}
			}
		}
		
		if(cnt == N.length()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}		
		sc.close();
	}
}
