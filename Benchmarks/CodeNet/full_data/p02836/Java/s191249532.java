import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int piv;
		String S_head,S_tail;
		int ans = 0;
		StringBuilder sb_head = new StringBuilder();
		StringBuilder sb_tail = new StringBuilder();

		if (S.length() % 2 == 0 ) {
			piv =  (int)Math.round(S.length()/2);
			S_head = S.substring(0,piv);
			S_tail = S.substring(piv,S.length());
		}else {
			piv =  (int)Math.round(S.length()/2) + 1;
			S_head = S.substring(0,piv - 1);
			S_tail = S.substring(piv,S.length());
		}
		sb_head.append(S_head);
		sb_tail.append(S_tail).reverse();
		for (int i = 0; i < sb_head.length(); i++) {
			if (sb_head.charAt(i) != sb_tail.charAt(i)) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}