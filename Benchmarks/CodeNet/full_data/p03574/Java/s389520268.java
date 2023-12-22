import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int H = reader.nextInt();
		int W = reader.nextInt();
		int[][] arr = new int[H][W];
		int[] Hbom = new int[H * W];
		int[] Wbom = new int[H * W];
		int count = -1;
		for (int i = 0; i < H; i++) {
			String str = reader.next();
			for (int j = 0; j < W; j++) {
				char ch = str.charAt(j);
				if (ch == '#') {
					arr[i][j] = -1;
					count++;
					Hbom[count] = i;
					Wbom[count] = j;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		for (int i = 0; i <= count; i++) {
			int height = Hbom[i];
			int width = Wbom[i];
			if (height > 0) {
				if (width > 0) {
					add(arr, height-1, width-1);
				}
				add(arr, height-1, width);
				if (width < W-1) {
					add(arr, height-1, width+1);
				}
			}
			if (width > 0) {
				add(arr, height, width-1);
			}
			if (width < W-1) {
				add(arr, height, width+1);
			}
			if (height < H-1) {
				if (width > 0) {
					add(arr, height+1, width-1);
				}
				add(arr, height+1, width);
				if (width < W-1) {
					add(arr, height+1, width+1);
				}

			}
		}
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (arr[i][j] == -1)  {
					System.out.print('#');
				} else {
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}
		reader.close();
	}
	public static void add(int[][] arr, int height, int width) {
		if (arr[height][width] != -1) {
			arr[height][width]++;
		}
	}
}



