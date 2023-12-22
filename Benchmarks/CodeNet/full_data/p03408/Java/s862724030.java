import java.util.Scanner;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 青いカードの文字列
		ArrayList<String> blue = new ArrayList<String>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String tmp = sc.next();
			blue.add(tmp);
		}
		// 赤いカードの文字列
		ArrayList<String> red = new ArrayList<String>();
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			String tmp = sc.next();
			red.add(tmp);
		}
		// すべての文字列
		ArrayList<String> all = new ArrayList<String>();
		for (String tmp : blue) {
			all.add(tmp);
		}
		for (String tmp : red) {
			all.add(tmp);
		}
		// 各文字列についてポイントを計算
		int point = 0;
		for (String target : all) {
			int pointT = 0;
			for (String tmpB : blue) {
				if (tmpB.equals(target)) {
					pointT++;
				}
			}
			for (String tmpR : red) {
				if (tmpR.equals(target)) {
					pointT = pointT - 1;
				}
				// System.out.println(pointT);
				if (point < pointT) {
					point = pointT;
				}
			}
		}
		System.out.println(point);
	}
}