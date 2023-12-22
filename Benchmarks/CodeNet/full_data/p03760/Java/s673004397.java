import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		String S2 = sc.next();
		sc.close();
		if(S1.length() == S2.length()) {
			for(int i = 0; i < S1.length(); i++) {
				System.out.print(S1.charAt(i));
				System.out.print(S2.charAt(i));
			}
			System.out.println();
		}else {
			for(int i = 0; i < S1.length() - 1; i++) {
				System.out.print(S1.charAt(i));
				System.out.print(S2.charAt(i));
			}
			System.out.println(S1.charAt(S1.length() - 1));
		}
	}
}