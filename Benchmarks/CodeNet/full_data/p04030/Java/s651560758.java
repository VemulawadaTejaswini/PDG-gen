import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		ArrayList<Character> c = new ArrayList<Character>();
		char[] C = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			C[i] = s.charAt(i);
			}
		for (int i = 0; i < s.length(); i++) {
			if (C[i] == '1') {
				c.add('1');
			}
			if (C[i] == '0') {
				c.add('0');
			}
			if (C[i] == 'B' && c.size()>0) {
				c.remove(c.size()-1);
			}
		}
		for (int i = 0; i < c.size(); i++) {
			System.out.print(c.get(i));
		}
	}
}

