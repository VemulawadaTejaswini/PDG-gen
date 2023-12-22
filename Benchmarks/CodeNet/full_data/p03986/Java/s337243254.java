import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		sc.close();
		int l = X.length();
		int k = X.indexOf("S");
		int t = X.lastIndexOf("T");
		int ans = 0;
		if(k != 0) {
			ans = k;
		}
		if(k == -1) {
			System.out.println(l);
			System.exit(0);
		}
		if(t == -1) {
			System.out.println(l);
			System.exit(0);
		}
		if(t != l) {
			ans += l - t;
		}
		X = X.substring(k, t);
		l = X.length();
		while(true) {
			X = X.replaceAll("ST", "");
			if(X.length() == l) {
				break;
			}else {
				l = X.length();
			}
		}
		ans += X.length();
		System.out.println(ans);
	}
}