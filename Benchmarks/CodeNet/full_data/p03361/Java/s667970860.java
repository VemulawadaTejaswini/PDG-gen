import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] sq = new char[h][w];

		for (int i = 0; i < h; i++) {
			String s = sc.next();
			sq[i] = s.toCharArray();
		}
		
		String ans = isJoined(sq) ? "Yes" : "No";
		System.out.println(ans);

		sc.close();
	}

	static boolean isJoined(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// 白マスはスキップ
				if (arr[i][j] == '.')
					continue;
				// 上
				if (i != 0)
					if (arr[i - 1][j] == '#')
						continue;
				// 下
				if (i != arr.length - 1)
					if (arr[i + 1][j] == '#')
						continue;
				// 左
				if (j != 0)
					if (arr[i][j - 1] == '#')
						continue;
				// 右
				if (j != arr[i].length - 1)
					if (arr[i][j + 1] == '#')
						continue;
				return false;
			}
		}
		return true;
	}
}
