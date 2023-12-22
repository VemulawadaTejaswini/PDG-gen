import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		sc.close();
		int l = X.length();
		int k = X.indexOf("S");
		int ans = 0;
		if(k != 0) {
			ans = k;
		}
		if(k == -1) {
			System.out.println(l);
			System.exit(0);
		}
		X = X.substring(k, l);
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
