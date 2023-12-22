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
		System.out.println("test "+wk[0][0]);

		for (int i = 0; i < (Math.pow(2, D)); i++) {
			ArrayList<Integer> list = new ArrayList<>();
			list = make(list);
//			for (int a = 0; a < list.size(); a++) {
//				System.out.println("list:"+list.get(a));
//			}

			int totale = 0;
			int count = 0;
			for (int j = 0; j < D; j++) {
					if ((1&i>>j) == 1) {
						totale += wk[j][3];
						count += wk[j][1];
						if (list.contains(j)) {
							System.out.println("j "+j);
							list.remove(j);
						}
					}
				}
				System.out.println("tataleA "+ totale);
				if (totale >= G) {
					ans = Math.min(ans, count);
				} else {
					Loop:for (int k : list) {
						System.out.println("k "+k);
						long wkNum = wk[k][1]; // monndaisuu
						while (wkNum >= 0) {
							totale += wk[k][0]; // tanka
							count++;
							wkNum--;
							if (totale >= G) {
								System.out.println("totaleB "+totale);
								ans = Math.min(ans, count);
								break Loop;
							}
						}
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
