import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(W == a || W == b || a == b){
			System.out.print(0);
		}
		else if(a > b) {
			System.out.print(a - (W + b));
		}
		else if(b > a) {
			System.out.print(b - (W + a));
		}
	}

}
