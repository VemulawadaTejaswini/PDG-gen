import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		int cnt=0;
		for (int i=0;i<N;i++) {
			if (S.charAt(i)=='o') {
				cnt++;
			}
		}
		if (15-N+cnt>=8) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}