import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // 県の個数
		int m = in.nextInt(); // 市の個数

		int city[][] = new int[m + 1][4]; // id, pref, year, number in pref
		int copycity[][] = new int[m + 1][4];

		// 県、年でソート
		for ( int id = 1; id <= m; id++ ) {
			city[id][0] = id;
			city[id][1] = in.nextInt();
			city[id][2] = in.nextInt();

			copycity[id] = city[id]; // 参照のコピーを作る
		}
		// コピー側をソート
		Arrays.sort(copycity, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if ( o1[1] != o2[1] ) {
					return o1[1] - o2[1];	// １．prefでソート
				} else {
					return o1[2] - o2[2];	// ２．yearでソート
				}
			}
		});

		// 年を見てナンバリング
		DecimalFormat df = new DecimalFormat("000000");
		//		String result[] = new String[m];
		int pref = 0;
		int num = 0;
		for ( int i = 1; i <= m; i++ ) {
			int p = copycity[i][1];
			if ( pref != p ) {
				pref = p;
				num = 1;
			} else {
				num++;
			}
			copycity[i][3] = num;
			// result[city[i][0] - 1] = df.format(pref) + df.format(num);
		}

		StringBuilder sb = new StringBuilder(100000 * 13);
		for ( int i = 1; i <= m; i++ ) {
			sb.append(df.format(city[i][1])).append(df.format(city[i][3])).append("\n");
		}
		System.out.println(sb);
		in.close();
	}

	private static String padding(int n) {
		String padded = "";
		if ( n < 10 ) {
			padded = "00000" + n;
		} else if ( n < 100 ) {
			padded = "0000" + n;

		} else if ( n < 1000 ) {
			padded = "000" + n;

		} else if ( n < 10000 ) {
			padded = "00" + n;

		} else if ( n < 100000 ) {
			padded = "0" + n;

		} else {
			padded = String.valueOf(n);
		}
		return padded;
	}
}
