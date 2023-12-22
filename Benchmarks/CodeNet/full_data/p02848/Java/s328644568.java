
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String anss = "";
		
		for(int i = 0; i<s.length(); i++) {
			anss += (char)((int)s.charAt(i) + n > 90 ? (int)s.charAt(i) + n - 26 : (int)s.charAt(i) + n);
		}
		System.out.println(anss);
	}

}
