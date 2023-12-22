import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void doIt() {
		String key = "keyence"; 
		char keyset[] = key.toCharArray();
		String s = sc.nextLine();
		int i = 0, ii = 0;
		while(i < key.length()) {
			if(s.charAt(ii) != keyset[i]) {
				ii += s.length() - key.length();
				if(ii > s.length()) {
					System.out.println("NO");
					return;
				}
			}
			i++;
			ii++;
		}
		System.out.println("YES");
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}
