import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		int[] itg = new int[100000];

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'R') {
				// 右へ
				for (int j = i; j < S.length(); j++) {
					// Lまで移動
					if (S.charAt(j) == 'L') {
						// iとjの間を偶数にする
						itg[(j - i) % 2 == 1 ? j - 1 : j]++;
                    	break;
					}
				}
			} else {
				// 左へ
				for (int j = i; j >= 0; j--) {
					// Rまで移動
					if (S.charAt(j) == 'R') {
						// iとjの間を偶数にする
						itg[(i - j) % 2 == 1 ? j + 1 : j]++;
                    	break;
					}
				}
			}
		}

		for (int i = 0; i < S.length(); i++) {
			System.out.print(String.valueOf(itg[i]) + " ");
		}
		System.out.println();
	}
}