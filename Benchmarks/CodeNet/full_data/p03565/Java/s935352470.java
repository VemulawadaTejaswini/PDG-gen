import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String sd = sc.nextLine();
		String t = sc.nextLine();
		int ls = sd.length();
		int lt = t.length();
		String S = "";
		int k = -1;

		LOOP: for (int i = ls - lt; i >= 0; i--) {
			for (int j = 0; j < lt; j++) {
				char sdi = sd.charAt(i + j);
				if (sdi != '?' && sdi != t.charAt(j)) {
					continue LOOP;
				}

			}
			k=i;
			break;
		}
		if(k==-1) {
			System.out.println("UNRESTORABLE");
			return;
		}
		S=S.concat(sd.substring(0, k));
		S=S.concat(t);
		S=S.concat(sd.substring(k + lt));
		S=S.replace('?', 'a');
		System.out.println(S);
	}
}
