import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 初期化
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String[] moji_data = sc.next().split("");
		for(int i=0;i<q;i++) {
			int result_cnt=0;
			// 開始位置、終了位置の取得
			int start = sc.nextInt();
			int end = sc.nextInt();
			// 切り出し文字の取得
			String moji_substr;
			for(int j=0;j<moji_data.length;j++) {
				if(start-1<=j&&j<=end) {
					if(moji_data[j].equals("A") && moji_data[j+1].equals("C")) {
						j++;
						result_cnt++;
					}
				}
			}
			System.out.println(result_cnt);
		}
	}
}