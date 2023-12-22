import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int A = 0;
		int Z = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'A') {
				A = i;
				break;
			}
		}
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(s.length() - 1 - i) == 'Z') {
				Z = s.length() - i;
				break;
			}
		}
		System.out.println(Z - A);
	}
}
