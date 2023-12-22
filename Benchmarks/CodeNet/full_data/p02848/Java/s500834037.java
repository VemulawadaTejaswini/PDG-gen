import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String S = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		for(int i = 0; i < s.length(); i++) {
			int a = S.indexOf(s.charAt(i)) + n;
			if(a >= 26) a -= 26;
			System.out.print(S.charAt(a));
		}
	}
}