import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int  ans = 0;
		String s = scan.next();
		for(int i = 0; i < 4; i++) {
			if(s.charAt(i) == '+') {
				ans++;
			} else {
				ans--;
			}
		}
		System.out.println(ans);
	}

}
