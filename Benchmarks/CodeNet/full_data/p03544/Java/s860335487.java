import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long memoMae = 2;
		long memoAto = 1;
		long memoKotae = 0;
		for (int i = 0; i < N-1; i++) {
			memoKotae = memoMae + memoAto;
			memoMae = memoAto;
			memoAto = memoKotae;
		}
		System.out.println(memoKotae);
	}

}
