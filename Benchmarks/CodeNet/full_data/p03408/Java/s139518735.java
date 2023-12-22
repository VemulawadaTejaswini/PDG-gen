import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0 ; i < n ; i++) s[i] = sc.next();
		int m = sc.nextInt();
		String[] t = new String[m];
		for(int i = 0 ; i < m ; i++) t[i] = sc.next();
		int ans = -1001001001;
		for(int i = 0 ; i < n ; i++) {
			int cnt = 0;
			for(int j = 0 ; j < n ; j++) {
				if(s[i].equals(s[j])) {
					cnt++;
				}
			}
			for(int j = 0 ; j < m ; j++) {
				if(s[i].equals(t[j])) {
					cnt--;
				}
			}
			ans = Math.max(ans, cnt);
		}
		System.out.println(Math.max(ans, 0));
	}
}
