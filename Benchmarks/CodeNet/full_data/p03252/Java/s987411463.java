import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		String T = scan.nextLine();
		scan.close();
		
		for(int i = 0; i < S.length(); i++) {
			char Sc = S.charAt(i);
			char Tc = T.charAt(i);
			for(int j = i; j < S.length(); j++) {
				if((S.charAt(j) == Sc) != (T.charAt(j) == Tc)) {
					System.out.print("No");
					return;
				}
			}
		}
		System.out.print("Yes");
	}
}
