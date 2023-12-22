import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		
		int black = 0;
		int white = 0;
		int x = 0;
		
		int min = 2 * 10^5 + 1;
		
		for(int i = 0; i < N; i++) {
			if(S.charAt(i) == '.') {
				white++;
			} else {
				x++;
			}
		}
		
		for(int i = 0; i < N; i++) {
			if(S.charAt(i) == '#') {
				black++;
			} else {
				white--;
			}

			min = Math.min(min, black + white);
		}
		if(x != N) {
			System.out.println(min);
		} else {
			System.out.println(0);
		}
	}
}
