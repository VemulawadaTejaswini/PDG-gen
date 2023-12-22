
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		for(int i = 1; i < s.length(); i++) {
			s = s.substring(0, i) + s.substring(i + 1, s.length());
		}
		System.out.println(s);
		scan.close();
	}

}
