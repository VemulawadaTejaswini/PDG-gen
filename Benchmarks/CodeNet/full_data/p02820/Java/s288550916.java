
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		int p = sc.nextInt();
		String t = sc.next();
		char[] pre = new char[k];
		for(int i = 0; i < k; i++) {
			pre[i] = 'a';
		}
		long ans = 0;
		for(int i = 0; i < n; i++) {
			char te = t.charAt(i);
			if(te != pre[i % k]) {
				if(te == 'r')
					ans += p;
				if(te == 's')
					ans += r;
				if(te == 'p')
					ans += s;
				pre[i % k] = te;
			} else {
				pre[i % k] = 'a';
			}
		}
		System.out.println(ans);
	}

}
