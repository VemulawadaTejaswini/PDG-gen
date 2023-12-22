import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int ans = getAnswer(A,B,C) ;
		System.out.println(ans);
	}

	public int getAnswer(int A, int B, int C) {
		int ans = 0 ;
		int amari = A - B ;

		if(amari < C) {
			ans = C - amari ;
		}else {
			ans = 0 ;
		}

		return ans ;
	}

}
