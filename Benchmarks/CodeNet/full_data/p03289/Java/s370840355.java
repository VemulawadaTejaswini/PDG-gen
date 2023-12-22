import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    String S = sc.nextLine();
		int flagA = 0;
		int flagC = 0;
		int flag = 1;
		for(int i = 0; i < S.length(); i++) {
			//System.out.println("test");
			if(S.charAt(i) == 'A' && i == 0) {
				flagA = 1;
				continue;
			}
			if(i >= 2 && i <= S.length() - 2 && S.charAt(i) == 'C') {
				if(flagC == 0) {
					flagC = 1;
					continue;
				} else {
					flagC = -1;
					continue;
				}
			}
			if(Character.isUpperCase(S.charAt(i))) {
				flag = -1;
			}
		}
		if(flagA == 1 && flagC == 1 && flag == 1) {
			System.out.println("AC");
		} else {
			System.out.println("WA");
		}
	}
}