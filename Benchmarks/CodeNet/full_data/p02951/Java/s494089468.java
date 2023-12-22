
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if(C + B > A) {
			C = C- (A-B);
			System.out.println(C);
		}else {
			System.out.println(0);
		}

		sc.close();
	}

}
