import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ", 3);
		int h = Integer.parseInt(first[0]);
		int w = Integer.parseInt(first[1]);
		int d = Integer.parseInt(first[2]);
		int[] spaceX = new int[h * w + 1];
		int[] spaceY = new int[h * w + 1];
		for (int j = 0; j < h; j++) {
			String[] x = br.readLine().split(" ", w);
			for (int i = 0; i < w; i++) {
				int a = Integer.parseInt(x[i]);
				spaceX[a] = i;
				spaceY[a] = j;
			}
		}
		int[] darr = new int[h * w + 1];
		for (int i = 1; i <= d; i++) {
			for (int j = i; j < h * w + 1; j += d) {
				if (j == i) {
					darr[j] = 0;
				} else {
					darr[j] = darr[j - d] + Math.abs(spaceX[j] - spaceX[j - d]) + Math.abs(spaceY[j] - spaceY[j - d]);
				}
			}
		}
		
		int q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			String[] second = br.readLine().split(" ", 2);
			int l = Integer.parseInt(second[0]);
			int r = Integer.parseInt(second[1]);
			sb.append(darr[r] - darr[l]).append("\n");
		}
		System.out.print(sb);
	}
}
