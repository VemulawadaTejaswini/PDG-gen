import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();

		//現在のmax値を定義
		int max = 1;
		int tmp = 1;
		for (int i = 1; i < K; i++) {

			boolean roopFlg = true;
			//繰り返し処理
			while(roopFlg) {
				tmp ++;
				if(max < tmp) {
					//ルンルンの条件チェック
					roopFlg = lunlunCheck(tmp);
				}
			}
			max = tmp;
		}

		System.out.println(max);
	}


	public static boolean lunlunCheck(int tmp) {
		boolean flg = true;
		String data = String.valueOf(tmp);

		if(data.length() == 1) {
			flg = false;
		} else {
			if(tmp == 357112) {
				System.out.print("TEST");
			}
			for(int i = 1; i < data.length(); i++) {
				int s0 = data.charAt(i-1) - '0';
				int s1 = data.charAt(i) - '0';

				if(Math.abs(s0 - s1) > 1) {
					break;
				}
				if(i+1 == data.length()) {
					flg = false;
					break;
				}
			}
		}

		return flg;

	}
}