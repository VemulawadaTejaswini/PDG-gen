import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		B025 b = new B025();
	}
}


class B025 {
	
	B025() {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		String str = cin.next();
		
		int max = 0;
		int x = 0;
		for (int i = 0; i < N; i++) {
			if (str.charAt(i) == 'I') {
				x++;
			} else if (str.charAt(i) == 'D') {
				x--;
			}
			max = Math.max(max, x);
		}
		System.out.println(max);
	}
}