import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		String T = scan.nextLine();
		scan.close();
		
		char[] SArr = S.toCharArray();
		char[] TArr = T.toCharArray();
		
		int len = SArr.length;
		for(int i = 0; i < len; i++) {
			char Sc = SArr[i];
			char Tc = TArr[i];
			for(int j = i; j < len; j++) {
				if((SArr[j] == Sc) != (TArr[j] == Tc)) {
					System.out.print("No");
					return;
				}
			}
		}
		System.out.print("Yes");
	}
}
