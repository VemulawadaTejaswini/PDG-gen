import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		int tLen = t.length()-1;
		boolean flag = true;
		for(int i = 0; i <= s.length() / 2; i++) {
			if(s.charAt(i) == t.charAt(tLen)) {
				tLen--;
			} else {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}