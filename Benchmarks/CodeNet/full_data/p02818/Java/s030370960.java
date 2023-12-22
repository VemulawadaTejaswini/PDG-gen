import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc  = new Scanner(System.in);

		try {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();

		for(int i = 0;i < n;i++) {
			if(a == 0 && b == 0) {
				break;
			}

			if(a >= 1 && a != 0) {
				a--;
			}else if(b >= 1 && b != 0){
				b--;
			}else {

			}
		}

		System.out.println(a + " " + b);
		}catch(InputMismatchException e) {
			System.out.println(0 + " " + 0);
		}

	}

}