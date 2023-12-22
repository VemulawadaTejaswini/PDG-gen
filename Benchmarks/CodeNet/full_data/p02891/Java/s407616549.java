import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String S_2 = S + S;
		int N = Integer.parseInt(sc.next());
		char first = S.charAt(0);
		char before = first;
		long cnt_1 = 0L;
		for (int i=1;i<S.length();i++) {
			if (S.charAt(i)==before) {
				cnt_1++;
				i++;
			}
			if (i<=S.length()-1) {
				before=S.charAt(i);
			}
		}

		long cnt_2 = 0L;
		int flag=0;
		before = first;
		for (int i=1;i<S_2.length();i++) {
			if (S_2.charAt(i)==before) {
				cnt_2++;
				i++;
			}
			if (i<=S_2.length()-1) {
				before=S_2.charAt(i);
			}
			if (i==S_2.length()-1) {
				if (S_2.charAt(i)==first) {
					flag=1;
				}
			}
		}

		long ans = 0L;
		if (N%2==0) {
			ans = cnt_2*(N/2);
		} else {
			ans = cnt_2*(N/2)+cnt_1+flag;
		}
		System.out.println(ans);
		// System.out.println(cnt_1);
		// System.out.println(cnt_2);
	}
}