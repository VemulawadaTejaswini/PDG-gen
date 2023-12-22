import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() { ;
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long W = sc.nextLong() ;
		long H = sc.nextLong();
		long x = sc.nextLong();
		long y = sc.nextLong();

		double s = W * H / 2 ;

		System.out.print(s + " ");
		if((x == W/2)&& (y == H/2)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
