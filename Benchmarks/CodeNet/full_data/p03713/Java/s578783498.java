import java.util.Scanner;

/*
 * 問題文
 * 縦 H ブロック、横 W ブロックの板チョコがあります。
 * すぬけ君は、この板チョコをちょうど 3 つのピースに分割しようとしています。
 * ただし、各ピースはブロックの境目に沿った長方形でなければなりません。
 * すぬけ君は、3 つのピースの面積 (ブロック数) をできるだけ均等にしようとしています。
 * 具体的には、3 つのピースの面積の最大値を Smax、最小値を Smin としたとき、Smax−Smin を最小化しようとしています。
 * Smax−Smin の最小値を求めてください。
 *
 * 入力は以下の形式で標準入力から与えられる。
 * H W
 */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		System.out.println(getMin(rowSplit(h, w), colSplit(h, w), aSplit(h, w), bSplit(h, w)));
	}

	private static int getMin(int x, int y, int z) {
		if(x <= y && x <= z) {
			return z;
		} else if(y <= x && y <= z) {
			return y;
		} else {
			return z;
		}
	}

	private static int getMin(int x, int y, int z, int a) {
		if(x <= y && x <= z && x <= a) {
			return z;
		} else if(y <= x && y <= z && y <= a) {
			return y;
		} else if (z <= x && z <= y&& z <= a){
			return z;
		} else {
			return a;
		}
	}

	private static int getMax(int x, int y, int z) {
		if(x >= y && x >= z) {
			return z;
		} else if(y >= x && y >= z) {
			return y;
		} else {
			return z;
		}
	}

	private static int colSplit(int h, int w) {
		int w1 = w / 3;
		int w2 = w / 3;
		int w3 = w / 3;
		if(w % 3 == 1) {
			w1 += 1;
		} else if(w % 3 == 2) {
			w1 += 1;
			w2 += 1;
		}

		return getMax(w1*h, w2*h, w3*h) - getMin(w1*h, w2*h, w3*h);
	}

	private static int rowSplit(int h, int w) {
		int h1 = w / 3;
		int h2 = w / 3;
		int h3 = w / 3;
		if(h % 3 == 1) {
			h1 += 1;
		} else if(h % 3 == 2) {
			h1 += 1;
			h2 += 1;
		}
		return getMax(h1*w, h2*w, h3*w) - getMin(h1*w, h2*w, h3*w);
	}

	private static int aSplit(int h, int w) {
		int h1 = h / 2;
		int h2 = h / 2;
		int w1 = w / 2;
		int w2 = w / 2;
		int ansA = h+w;

		if(h % 2 == 1) {
			h1 += 1;
		}
		if(w % 2 == 1) {
			w1 += 1;
		}
		while(true) {
			int a = h1 * w1;
			int b = h1 * w2;
			int c = h2 * w;
			if(getMax(a, b, c) - getMin(a, b, c) <= ansA) {
				ansA = getMax(a, b, c) - getMin(a, b, c);
			}
			h1 += 1;
			h2 -= 1;

			if(h2 < 1) {
				break;
			}
		}
		return ansA;
	}

	private static int bSplit(int h, int w) {
		int h1 = h / 2;
		int h2 = h / 2;
		int w1 = w / 2;
		int w2 = w / 2;
		int ansB = h+w;

		if(w % 2 == 1) {
			w1 += 1;
		}
		if(h % 2 == 1) {
			h1 += 1;
		}
		while(true) {
			int a = w1 * h1;
			int b = w1 * h2;
			int c = w2 * h;
			if(getMax(a, b, c) - getMin(a, b, c) <= ansB) {
				ansB = getMax(a, b, c) - getMin(a, b, c);
			}
			h1 += 1;
			h2 -= 1;

			if(h2 < 1) {
				break;
			}
		}
		return ansB;
	}

}
