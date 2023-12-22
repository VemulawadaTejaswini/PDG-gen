import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int K = sc.nextInt();
			int total = 9;
			if (K <= 9) {
				System.out.println("1桁までの合計値：" + total);
				System.out.println("小さい方から" + K + "番目のルンルン数は【1桁】です");
			} else if (10 <= K && K <= 35) {
				total += 26;
				System.out.println("2桁までの合計値：" + total);
				System.out.println("小さい方から" + K + "番目のルンルン数は【2桁】です");
			} else {
				total += 26;
				int keta = 0;
				for (int n = 3; total < K; n++) {
					int hiku = 0;
					double shiki = 0;
					for (int i = 0; i <= n - 4; i++) {
						hiku += 4 * Math.pow(3, i);
					}
					hiku += Math.pow(3, n - 3) + 2 * Math.pow(3, n - 3) + Math.pow(3, n - 2);
					shiki = 9 * Math.pow(3, n - 1) - hiku;

					total += shiki;
					System.out.println(n + "桁までの合計値：" + total);
					keta = n;
				}
				System.out.println("小さい方から" + K + "番目のルンルン数は【" + keta + "桁】です");
			}

			
			
			//			int K = sc.nextInt();
			//
			//			ArrayList<Integer> ketasuu = new ArrayList<Integer>();
			//			ketasuu.add(1, 9);
			//			ketasuu.add(2, 26);
			//			ketasuu.add(3, 75);
			//
			//			int n = 4;
			//			int hiku = 0;
			//			double shiki = 0;
			//			for(int i = 0; i < n - 4; i++) {
			//				hiku += 4 * Math.pow(3, i);
			//			}
			//			shiki = 9 * Math.pow(3, n - 1) - hiku;
			//
			//
			//			ArrayList<Long> lunlun = new ArrayList<Long>();
			//
			//			lunlun.add(0, 1L);

		} finally

		{
			sc.close();
		}
	}

}
