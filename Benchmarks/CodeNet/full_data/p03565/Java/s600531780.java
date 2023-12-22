import java.util.Scanner;

public class Main{

	public void copy(char[] a, char[] b) {
		for(int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		char[] str = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		char[] ans = new char[str.length];
		boolean f = false;

		for(int i = 0; i < str.length; i++) {
			ans[i] = str[i];
		}

		for(int i = 0; i < str.length; i++) {
			int k = 0;
			if(str[i] == t[k] || str[i] == '?') {
				// System.out.println("str[" + i + "] = " + str[i] + ", t[" + k + "] = " + t[k]);
				int j = i + 1;

				for(k = 1; k < t.length; k++) {
					// System.out.println("str[" + j + "] = " + str[j] + ", t[" + k + "] = " + t[k]);
					if(j >= str.length) {
						break;
					}
					if(str[j] != '?' && str[j] != t[k]) {
						// copy
						copy(ans, str);
						break;
					}
					if(str[j] == t[k] || str[j] == '?') {
						ans[j] = t[k];
					}
					j++;
				}

				if(k == t.length) {
					f = true;
					break;
				}
			}
		}

		if(f) {
			for(int i = 0; i < str.length; i++) {
				if(str[i] == '?' && ans[i] == '?') {
					ans[i] = 'a';
				}
			}
			System.out.println(ans);
		}
		else {
			System.out.println("UNRESTORABLE");
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
