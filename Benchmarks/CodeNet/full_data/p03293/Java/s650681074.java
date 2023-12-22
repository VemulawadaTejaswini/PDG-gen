import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		boolean b = false;
		for (int i=0;i<S.length();i++) {
			boolean tempB = true;
			for (int j=0;j<S.length();j++) {
				if (S.charAt((i+j)%S.length())!=T.charAt(j)) {
					tempB =false;
					break;
				}
			}
			if (tempB == true) {
				b=true;
				break;
			}
		}
		if (b==true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}