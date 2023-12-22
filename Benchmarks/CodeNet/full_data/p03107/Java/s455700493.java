import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}

	public void solve(Scanner sc) {
		String s = sc.next();
		
		int red = 0, blue = 0;
		for(int i=0; i<s.length(); i++) {
			char chr = s.charAt(i);
			if(chr =='0') {
				red++;
			} else {
				blue++;
			}
		}
		
		
		System.out.println(Math.min(red, blue) * 2);
		
	}
}
