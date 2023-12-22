import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String S = scan.next();
			char[] s = new char[3];
			s[0] = S.charAt(0);
			s[1] = S.charAt(1);
			s[2] = S.charAt(2);
			int num = 0;
			for (int i = 0; i < 3; i++) {
				if (s[i] == 'o') {
					num++;
				}
			}
			System.out.println(700 + 100 * num);
		}
	}
	
