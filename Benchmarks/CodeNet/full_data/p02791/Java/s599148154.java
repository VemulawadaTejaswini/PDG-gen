import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//入力（Nと配列）
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] PList = new int[N];

		//左に自分より小さい数があればNG
			//今まで出てきた最も小さい数を記憶する。比較する。
		//配列の最初は比較対象がない。
		PList[0] = sc.nextInt();
		int minNumber = PList[0];
		int cnt=1;

		for(int i=1;i<N;i++) {
			PList[i] = sc.nextInt();
			if(minNumber>=PList[i]) {
				minNumber = PList[i];
				cnt++;
			}else {
			}
		}
		System.out.println(cnt);
	}
}
