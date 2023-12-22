
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ritsu = sc.nextInt();
		double ans = 0;
		ans = ritsu/2;
//		if(ritsu%2 != 0) {
//			ans = (ritsu/2);
//		} else {
//			ans = (ritsu/2);
//		}
		System.out.println(1- (ans/ritsu));
		//		// Scannerクラスのインスタンスをクローズ
				sc.close();
	}
}
