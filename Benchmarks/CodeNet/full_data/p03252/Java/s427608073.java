import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray(), t = sc.next().toCharArray();
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] != t[i]) {
				char si = s[i];
				for (int j = 0; j < s.length; j++) {
					if (s[j] == si)
						s[j] = t[i];
					else if (s[j] == t[i])
						s[j] = si;
				}
			}
		}
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] != t[i]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}