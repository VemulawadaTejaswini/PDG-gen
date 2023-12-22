import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc  = new Scanner(System.in);

		try {
		long a = sc.nextInt();
		long b = sc.nextInt();
		long n = sc.nextInt();

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
		}catch(Exception e) {
			System.out.println(0 + " " + 0);
		}

	}

}