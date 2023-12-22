
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int[][] masu;
	static int H, W;
	static List<Pair> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		masu = new int[H][W];
		for(int i = 0; i < H; i++) {
			char[] tmp = sc.next().toCharArray();
			for(int j = 0; j < W; j++) {
				if(tmp[j] == '#') {
					masu[i][j] = 0;
				} else {
					masu[i][j] = 10000000;
				}
			}
		}
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(masu[i][j] == 0) {
					list.add(new Pair(i, j));
				}
			}
		}
		dik();
		int max = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				max = Math.max(max, masu[i][j]);
			}
		}
		System.out.println(max);
	}

	static void dik() {
		while(!list.isEmpty()) {
			Pair tmp = list.get(0);
			list.remove(0);
			int k = tmp.getFirst();
			int l = tmp.getSecond();
			if(k > 0) {
				if(masu[k][l] + 1 < masu[k - 1][l]) {
					masu[k - 1][l] = masu[k][l] + 1;
					list.add(new Pair(k - 1, l));
				}
			}
			if(k < H - 1) {
				if(masu[k][l] + 1 < masu[k + 1][l]) {
					masu[k + 1][l] = masu[k][l] + 1;
					list.add(new Pair(k + 1, l));
				}
			}
			if(l > 0) {
				if(masu[k][l] + 1 < masu[k][l - 1]) {
					masu[k][l - 1] = masu[k][l] + 1;
					list.add(new Pair(k, l - 1));
				}
			}
			if(l < W - 1) {
				if(masu[k][l] + 1 < masu[k][l + 1]) {
					masu[k][l + 1] = masu[k][l] + 1;
					list.add(new Pair(k, l + 1));
				}
			}
		}
	}

}

class Pair {
	int first;
	int second;

	protected Pair(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}
