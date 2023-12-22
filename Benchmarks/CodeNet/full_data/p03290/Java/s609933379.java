import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int D,G;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		D = sc.nextInt();
		G = sc.nextInt();
		long[][] wk = new long[10][5];
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < D; i++) {
			wk[i][0] = (i + 1) * 100;//単価
			wk[i][1] = sc.nextLong();//問題数
			wk[i][2] = sc.nextLong();//コンプリートボーナス
			wk[i][3] = (wk[i][0] * wk[i][1]) + wk[i][2];//コンプリート総額
		}

		for (int i = 0; i < (Math.pow(2, D)); i++) {
			ArrayList<Integer> list = new ArrayList<>();
			list = make(list);

			int totale = 0;
			int count = 0;
			for (int j = 0; j < D; j++) {
				if ((1&i>>j) == 1) {
					totale += wk[j][3];
					count += wk[j][1];
					list.remove((D -1)- j);
				}
				if (totale >= G) {
					System.out.println("count:"+count);
					ans = Math.min(ans, count);
				} else {
					for (int k : list) {
						if (totale >= G) {
							break;
						}
						totale += k;
					}
//					int sizeCount = 0;
//					for (int k = D; k >= 0; k--) {
//						if (totale >= G) {
//							break;
//						}
//						if (sizeCount < wk[k][1]) {
//							sizeCount++;
//							totale += wk[k][0];
//						} else {
//							sizeCount = 0;
//							continue;
//						}
//					}

				}
				}
			}
		System.out.println(ans);
	}
	static ArrayList<Integer> make(ArrayList<Integer> list) {
		for (int i = D; i >= 0; i--) {
			list.add(i);
		}
		return list;
	}
}