import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int num = -1;
	void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = new char[s.length()];
		c = s.toCharArray();
		String t = sc.next();
		char[] t2 = new char[t.length()];
		t2 = t.toCharArray();
		
		for(int i = s.length()-t.length(); i >= 0; i--) {
			for(int j = 0; j < t.length(); j++) {
				if(c[i+j] != t2[j] && c[i+j] !='?')break;
				
				if(j == t.length()-1) {
					for(int k = i; k < i+t.length(); k++) {
						c[k] = t2[k-i];
					}
					for(int l = 0; l < s.length(); l++) {
						if(c[l] == '?') c[l] = 'a';
					}
					String ans = new String(c);
					System.out.println(ans);
					return;
				}
			}
		}
		System.out.println("UNRESTORABLE");
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}