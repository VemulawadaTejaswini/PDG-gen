import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		boolean[][] grid = new boolean[100][100];
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[x].length; y++) {
				grid[x][y] = x >= grid.length / 2;
			}
		}

		{
			int x = 0, y = 0;
			for (int i = 0; i < a - 1; i++) {
				grid[x][y] = true;
				if ((y += 2) >= grid[0].length) {
					y = 0;
					x += 2;
				}
			}
			x = grid.length - 1;
			y = 0;
			for (int i = 0; i < b - 1; i++) {
				grid[x][y] = false;
				if ((y += 2) >= grid[0].length) {
					y = 0;
					x -= 2;
				}
			}
		}

		System.out.println(grid.length + " " + grid[0].length);
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[x].length; y++) {
				System.out.print(grid[x][y] ? '#' : '.');
			}
			System.out.println();
		}
	}

}