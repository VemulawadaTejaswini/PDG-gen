import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		String ans ="";
		for(int i = 0 ;i < s.length(); i++) {
			int ch = (s.charAt(i) + n - 65)%26 + 65 ;
			char c = (char) ch;
			ans = ans  + Character.toString(c);
		}
		System.out.println(ans);
	}
}
