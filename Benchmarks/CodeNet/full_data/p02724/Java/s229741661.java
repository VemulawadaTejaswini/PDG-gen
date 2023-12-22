import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		sc.close();
		int x_u = Integer.parseInt(X.substring(0,X.length() - 2))*100;
		int x_l = Integer.parseInt(X.substring(X.length() - 2));
		int ans = x_u*2;
		x_l -= x_l%5;
		ans += x_l;
		System.out.println(ans);
	}
}
