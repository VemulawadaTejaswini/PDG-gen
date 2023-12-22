import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();scan.nextLine();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = scan.nextLine();
		}
		for (int i = 0; i < n-1; i++) {
			char c = s[i].charAt(s[i].length()-1);
			if (c != s[i+1].charAt(0)) {
				//System.out.println(c + "" + s[i+1].charAt(0));
				System.out.println("No");
				return;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (s[i].equals(s[j]) && i != j) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}
