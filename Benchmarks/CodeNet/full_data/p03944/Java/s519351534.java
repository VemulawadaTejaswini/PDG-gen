import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int x, y, a;
		int[][] area = new int[h][w];
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			a = sc.nextInt();
			black(area, x, y, a);
		}
		show(area);
	}

	private static void show(int[][] area) {
		int cnt = 0;
		for (int i = 0; i < area.length; i++) {
			for (int j = 0; j < area[0].length; j++) {
				if (area[i][j] == 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

	private static void black(int[][] area, int x, int y, int a) {
		switch (a) {
		case 1:
			for (int i = 0; i < area.length; i++) {
				for (int j = 0; j < x; j++) {
					area[i][j] = 1;
				}
			}
			break;
		case 2:
			for (int i = 0; i < area.length; i++) {
				for (int j = x; j < area[0].length; j++) {
					area[i][j] = 1;
				}
			}
			break;
		case 3:
			for (int i = 0; i < y; i++) {
				Arrays.fill(area[i], 1);
			}
			break;
		case 4:
			for (int i = y; i < area.length; i++) {
				Arrays.fill(area[i], 1);
			}
			break;
		}
	}
}
