import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s += "T";
		int x = sc.nextInt();
		int y = sc.nextInt();
		int right = 0;
		while (s.startsWith("F")) {
			s = s.substring(1);
			right++;
		}
		x -= right;
		ArrayList<Integer> RorL = new ArrayList<>();
		ArrayList<Integer> UorD = new ArrayList<>();
		boolean isRorL = true;
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c == 'T') {
				if (isRorL) {
					if (count != 0) {
						RorL.add(count);
					}
				} else {
					if (count != 0) {
						UorD.add(count);
					}
				}
				count = 0;
				isRorL = !isRorL;
			} else {
				count++;
			}
		}
		final int magic = 10000;
		x += magic;
		y += magic;
		//テーブル構築//dp[i][j]でi回目の操作で座標軸上のn+magicに居られるかどうか
		boolean xdp[][] = new boolean[RorL.size() + 1][2*magic+100];
		boolean ydp[][] = new boolean[UorD.size() + 1][2*magic+100];
		//dp初期条件
		xdp[0][magic] = true;
		ydp[0][magic] = true;
		//dp
		for (int i = 0; i < RorL.size(); i++) {
			for (int j = 0; j < 2*magic+100; j++) {
				if (xdp[i][j]) {
					if (j - RorL.get(i) >= 0) {
						xdp[i + 1][j - RorL.get(i)] = true;
					}
					if (j + RorL.get(i) < 2*magic+100) {
						xdp[i + 1][j + RorL.get(i)] = true;
					}
				}
			}
		}
		for (int i = 0; i < UorD.size(); i++) {
			for (int j = 0; j < 2*magic+100; j++) {
				if (ydp[i][j]) {
					if (j - UorD.get(i) >= 0) {
						ydp[i + 1][j - UorD.get(i)] = true;
					}
					if (j + UorD.get(i) < 2*magic+100) {
						ydp[i + 1][j + UorD.get(i)] = true;
					}
				}
			}
		}
		if (xdp[RorL.size()][x] && ydp[UorD.size()][y]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}