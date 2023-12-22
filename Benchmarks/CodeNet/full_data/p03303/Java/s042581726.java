import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String s = scan.next();
		int w = scan.nextInt();
		
		String ans = "";
		for(int i = 0; i < s.length(); i+= w) {
			ans += s.charAt(i);
		}
		
		System.out.println(ans);
    }
}
