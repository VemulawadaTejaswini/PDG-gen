import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "";
		int len = s.length();

		for (int i = 0; i < len; i=i+2) {
			ans += s.charAt(i);
		}
		System.out.println(ans);
	}

}