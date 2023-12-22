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
			wk[i][0] = (i + 1) * 100;//tanka
			wk[i][1] = sc.nextLong();//monndaisuu
			wk[i][2] = sc.nextLong();//konnpuri-tobo-nasu
			wk[i][3] = (wk[i][0] * wk[i][1]) + wk[i][2];//konnpuri-tosougaku
		}

		for (int i = 0; i < (Math.pow(2, D)); i++) {
			ArrayList<Integer> list = new ArrayList<>();
			list = make(list);

			int totale = 0;
			int count = 0;
			Loop:for (int j = 0; j < D; j++) {
				if ((1&i>>j) == 1) {
					totale += wk[j][3];
					count += wk[j][1];
					list.remove((D -1)- j);
				}
				if (totale >= G) {
					ans = Math.min(ans, count);
				} else {
					for (int k : list) {
						long wkNum = wk[k][1];
						while (wkNum >= 0) {
							System.out.println("wk"+wk[k][0] + " wkNum"+wkNum);
							totale += wk[k][0];
							count++;
							wkNum--;
							if (totale >= G) {
								break Loop;
							}
						}
						
					}
					ans = Math.min(ans, count);

				}
				}
			}
		System.out.println(ans);
	}
	static ArrayList<Integer> make(ArrayList<Integer> list) {
		for (int i = D-1; i >= 0; i--) {
			list.add(i);
		}
		return list;
	}
}
