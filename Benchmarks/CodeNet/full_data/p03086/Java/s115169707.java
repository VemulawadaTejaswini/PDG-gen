import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int ans = 0;
		int tmp = 0;
		for (int i=0;i<S.length();i++) {
			if (S.charAt(i)=='A') {
				tmp++;
			} else if (S.charAt(i)=='T') {
				tmp++;
			} else if (S.charAt(i)=='G') {
				tmp++;
			} else if (S.charAt(i)=='C') {
				tmp++;
			}else {
				tmp=0;
			}
			ans = Math.max(ans,tmp);
		}
		System.out.println(ans);
	}
}