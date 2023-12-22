import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		StringBuffer alpha = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
		for(int i = 0; i < s.length(); i++) {
			alpha.setCharAt(s.charAt(i)-'a', '0');			
		}
		int i;
		for(i = 0; i < alpha.length(); i++) {
			if(alpha.charAt(i) != '0') {
					break;
		}
		}
		if(i < alpha.length()) {
			System.out.println(alpha.charAt(i));
		} else {
			System.out.println("None");
		}
	}

}
