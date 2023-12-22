import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		sc.close();
		int l = X.length();
		if(l >= 100000) {
			int k0 = l / 3;
			int k1 = k0 * 2;
			String x0 = X.substring(k0, k1);
			String x1 = X.substring(k0, k1);
			String x2 = X.substring(k1, l);
			int l0 = x0.length();
			int l1 = x1.length();
			int l2 = x2.length();
			while(true) {
				x0 = x0.replaceAll("SSSSSSSTTTTTTT", "");
				x0 = x0.replaceAll("ST", "");
				if(X.length() == l0) {
					break;
				}else {
					l0 = x0.length();
				}
			}
			while(true) {
				x1 = x1.replaceAll("SSSSSSSTTTTTTT", "");
				x1 = x1.replaceAll("ST", "");
				if(x1.length() == l1) {
					break;
				}else {
					l1 = x1.length();
				}
			}
			while(true) {
				x2 = x2.replaceAll("SSSSSSSTTTTTTT", "");
				x2 = x2.replaceAll("ST", "");
				if(x2.length() == l2) {
					break;
				}else {
					l2 = x2.length();
				}
			}
			X = x0 + x1 + x2;
			while(true) {
				X = X.replaceAll("SSSSSSSTTTTTTT", "");
				X = X.replaceAll("ST", "");
				if(X.length() == l) {
					break;
				}else {
					l = X.length();
				}
			}
			System.out.println(X.length());

		}else {
			while(true) {
				X = X.replaceAll("SSSSSSSTTTTTTT", "");
				X = X.replaceAll("ST", "");
				if(X.length() == l) {
					break;
				}else {
					l = X.length();
				}
			}
			System.out.println(X.length());
		}
	}
}