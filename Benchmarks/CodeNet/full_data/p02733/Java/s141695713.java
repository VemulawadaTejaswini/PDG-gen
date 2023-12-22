import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();

		int[][] chocolate = new int[H][W];
		int[] tate_white = new int[H];
		int[] yoko_white = new int[W];
		int choco_white = 0;

		//チョコレート取得
		for(int i = 0; i < H; i++) {
			String s = sc.next();
			for(int j = 0; j < W; j++) {
				chocolate[i][j] = s.charAt(j) - '0';
				if(chocolate[i][j] == 1) {
					tate_white[i]++;
					yoko_white[j]++;
					choco_white++;
				}
			}
		}

		//チョコ回数が制限内なら割る必要なし
		if(choco_white <= K) {
			System.out.println(0);
			return;
		}
		double tateMax = getMax(tate_white);
		double yokoMax = getMax(yoko_white);

		double white = tateMax * yokoMax;

		int cnt = 0;
		while(K < white) {
			if(tateMax < yokoMax) {
				yokoMax = yokoMax / 2;
			} else {
				tateMax = tateMax / 2;
			}
			white =  tateMax * yokoMax;
			cnt++;
		}
		System.out.println(cnt);
	}

	public static double getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
		    int v = arr[i];
		    if (v > max) {
		        max = v;
		    }
		}
		return (double) max;
	}
}