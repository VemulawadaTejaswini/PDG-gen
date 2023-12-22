import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String a[] = S.split("");

		int s[] = new int[3];
		for (int i=0;i<3;i++) {
			s[i]=Integer.parseInt(a[i]);
		}
		int cnt = 0;
		for (int i=0;i<3;i++) {
			if (s[i]==1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}