
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String s = scan.next();
		
		boolean flg = true;
		
		if (!s.substring(0, a).equals("[0-9]")) {
			flg = false;
		}
		
		if (!s.substring(a, a + 1).equals("-")) {
			flg = false;
		}
		
		if (!s.substring(a + 1).equals("[0-9]")) {
			flg = false;
		}
	}
}
