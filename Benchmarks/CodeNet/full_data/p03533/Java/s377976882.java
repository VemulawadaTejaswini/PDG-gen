import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = "AKIHABARA";
		String S = in.next();
		S.toUpperCase();
		if (S.length() >= 1 && S.length() <= 50) {
			boolean a = s.contains(S);
			boolean ture = false;
			if (a == ture) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
	}

}
