import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		boolean[] s = new boolean[n];
		for (int i = 0; i < n; i++) {
			a[i] = 0;
			s[i] = false;
		}
		for (int i = 0; i < m; i++) {
			int p = sc.nextInt()-1;
			String S = sc.next();
			if(S.equals("WA")) {
				if(!s[p]) a[p]++;
			}else {
				s[p] = true;
			}
		}
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < n; i++) {
			if(s[i]) {
				count++;
				count2 += a[i];
			}
		}
		System.out.printf("%d %d",count, count2);
		sc.close();
	}
}