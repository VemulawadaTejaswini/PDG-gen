import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力値
		int n = sc.nextInt();
		String s = sc.next();
		// 文字列の長さ
		int len = n%2 == 0 ? n/2 : 0;
		// 2度繰り返せばOK
		if(len>0) {
			String c1 = s.substring(0,len);
			String c2 = s.substring(len,s.length());
			if (c1.equals(c2)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}