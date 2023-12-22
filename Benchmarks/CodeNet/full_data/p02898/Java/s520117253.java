
import java.util.Scanner;

//A
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int ritsu = sc.nextInt();
//		double ans = 0;
//		ans = ritsu/2;
////		if(ritsu%2 != 0) {
////			ans = (ritsu/2);
////		} else {
////			ans = (ritsu/2);
////		}
//		System.out.println(1- (ans/ritsu));
//		//		// Scannerクラスのインスタンスをクローズ
//				sc.close();
//	}
//}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int man = sc.nextInt();
		int cm = sc.nextInt();
		int count = 0;
		for(int i = 0; i < man; i++) {
			int oneMan = sc.nextInt();
			if(cm <= oneMan) {
				count++;
			}
		}
		System.out.println(count);
		//		// Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}