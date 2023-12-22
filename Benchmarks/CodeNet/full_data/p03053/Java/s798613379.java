import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split(" ");
		int H = Integer.parseInt(str[0]);
		int W = Integer.parseInt(str[1]);
		String[][] A = new String[H][W];
		int [] HH = new int[H* W];
		int[] WW = new int[H * W];
		int count = 0;
		for (int i = 0; i < H; i++) {
			String[] str2 = reader.readLine().split("");
			for (int j = 0; j < str2.length; j++) {
				A[i][j] = str2[j];
				if (A[i][j].equals("#")) {
					HH[count] = i;
					WW[count] = j;
					count++;
				}
			}
		}
		int max = 0;
		for (int c = 0; c < count; c++) {
			int local_min = Integer.MAX_VALUE;
			for (int d = 0; d < count; d++) {
				if (Math.abs(HH[c]-HH[d]) + Math.abs(WW[c]-WW[d]) < local_min) {
					local_min = Math.abs(HH[c]-HH[d]) + Math.abs(WW[c]-WW[d]);
				}
			}
			if (local_min > max) {
				max = local_min;
			}
		}
		for (int i = 0; i < H; i++)
			for (int j = 0; j < W; j++) {
				if (i == 0 || i == H-1 || j == 0 || j == W-1) {
					boolean flag = false;
					outer:
					for (int ii = -max; ii <= max; ii++)
						for (int jj = max; jj <= max; jj++) {
							if (i+ii >= 0 && i+ii < H && j+jj >= 0 && j+jj < W && A[i+ii][j+jj].equals("#")) {
								flag = true;
								break outer;
							}
						}
					if (!flag) {
						int local_min = Integer.MAX_VALUE;
						for (int c = 0; c < count; c++) {
							if (Math.abs(HH[c]-i) + Math.abs(WW[c]-j) < local_min) {
								local_min = Math.abs(HH[c]-i) + Math.abs(WW[c]-j);
							}
						}
						if (local_min > max) {
							max = local_min;
						}
					}
				}
			}
		System.out.println(max);
	}
}