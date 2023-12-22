import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int h;
	static int w;
	static int max = 0;
	static int[][] array;
	static boolean[][] checked;
	static boolean[][] checked2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		array = new int[h][w];
		checked = new boolean[h][w];
		checked2 = new boolean[h][w];
		for (int i = 0; i < h; i++) {
			String s = sc.next();
			for (int j = 0; j < w; j++) {
				if (s.charAt(j) == '#') {
					array[i][j] = 1;
				}
			}
		}
		int res = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				calc(0, 0, 0);
				if (max > 0) {
					--max;
				}
				res += max;
				max = 0;
				checked = checked2.clone();
			}
		}
		System.out.println(res);
	}
	
	public static int calc(int i, int j, int count) {
		if (i >= h || j >= w || i < 0 || j < 0) {
			return count;
		} else {
			checked[i][j] = true;
			if (array[i][j] > 0) {
				return count;
			} else {
				++count;
				if (i < h - 1 && !checked[i + 1][j]) {
					int a = calc(i + 1, j, count);
					if (max < a) {
						checked2 = checked.clone();
						max += a;
					}
				}
				if (j < w - 1 && !checked[i][j + 1]) {
					int b = calc(i, j + 1, count);
					if (max < b) {
						checked2 = checked.clone();
						max += b;
					}
				}
			}
			
			return count;
		}
	}
}
