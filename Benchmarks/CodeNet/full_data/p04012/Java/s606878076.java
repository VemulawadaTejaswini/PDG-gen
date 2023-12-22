import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] alp = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		Main main = new Main();

		if (s.length() % 2 == 0) {
			for (int i = 0; i < alp.length; i++) {
				if (main.strCount(s,alp[i]) % 2 == 1) {
					System.out.println("No");
					break;
				}
				if (i==alp.length - 1) {
					System.out.println("Yes");
				}
			}
		}else {
			System.out.println("No");
		}


	}

	public int strCount(String s,char target) {
		int con=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == target) {
				con++;
			}
		}
		return con;
	}
}


