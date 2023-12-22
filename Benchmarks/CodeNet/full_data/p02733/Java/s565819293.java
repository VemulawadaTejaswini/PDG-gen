import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		char[][] choco = new char[H][W];
		boolean y = false;
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			for (int j = 0; j < W; j++) {
				char c = s.charAt(j);
				choco[i][j] = c;
			}
		}
		int ans0 = solve(choco, H, W, K);
		int ans1 = solve1(choco, H, W, K);
		System.out.println(Math.min(ans0, ans1));
	}
	static int solve(char[][] choco, int H, int W, int K) {

		int ans = H + W - 2;

		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 1; i < W; i++) {
			int a = countX(choco, i, H);
			if (a < K) {
				ans--;
			} else {
				array.add(i);
			}
		}
		for (int i = 1; i < H; i++) {
			if (countY(choco, i, W, array, K)) 
				ans--;
		}
		return ans;
	}
	static int solve1(char[][] choco, int H, int W, int K) {

		int ans = H + W - 2;

		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 1; i < H; i++) {
			int a = countY0(choco, i, W);
			if (a < K) {
				ans--;
			} else {
				array.add(i);
			}
		}
		for (int i = 1; i < W; i++) {
			if (countX0(choco, i, H, array, K)) 
				ans--;
		}
		return ans;
	}

	static int countX(char[][] choco, int x, int H) {

		int c = 0;
		for (int j = 0; j < H; j++) {
			for (int i = x-1; i < x+1; i++) {
				if (choco[j][i] != '0') 
					c++;
			}
		}
		return c;
	}
	static int countY0(char[][] choco, int y, int W) {

		int c = 0;
		for (int j = 0; j < W; j++) {
			for (int i = y-1; i < y+1; i++) {
				if (choco[i][j] != '0') 
					c++;
			}
		}
		return c;
	}
	static boolean countY(char[][] choco, int y, int W, ArrayList<Integer> array, int K) {

		int c = 0;

		if (array.size() > 0) {
			int b = 0;
			for (int i = 0; i < array.size(); i++) {
				c = 0;
				for (int k = b; k < array.get(i); k++) {
					for (int ii = y-1; ii < y+1; ii++) {
						if (choco[ii][k] != '0') 
							c++;
					}
					if (c > K) {
						return false;
					}
				}
				b = array.get(i);
			}
		}
		return true;
	}

	static boolean countX0(char[][] choco, int x, int H, ArrayList<Integer> array, int K) {

		int c = 0;

		if (array.size() > 0) {
			int b = 0;
			for (int i = 0; i < array.size(); i++) {
				c = 0;
				for (int k = b; k < array.get(i); k++) {
					for (int ii = x-1; ii < x+1; ii++) {
						if (choco[k][ii] != '0') 
							c++;
					}
					if (c > K) {
						return false;
					}
				}
				b = array.get(i);
			}
		}
		return true;
	}
}