import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int sL = S.length();

		double sD = sL/2;

		int result = 0;

		for(int i = 0 ;i< Math.floor(sD);i++) {

			String A  = S.substring(i,i+1);
			String B = S.substring(sL-(i+1),sL-i);

			if(!A.equals(B)) {
				result++;
			}

		}

		System.out.println(result);
}
}
