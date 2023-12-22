import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int h = sc1.nextInt();
		int w = sc1.nextInt();
		int count = 0;
		char[][] grid = new char[h][w];
		int[][] flag = new int[h][w];
		boolean ans = false;
		boolean flag1 = false;

		for (int i = 0; i < h ; i++) {
			String str = sc1.next();
			for (int j = 0; j < w ; j++) {
				grid[i][j] = str.charAt(j);
				flag[i][j] = 0;
			}
		}


		for (int i = 0; i < h ; i++) {
			if(flag1) {
				break;
			}
			for (int j = 0; j < w ; j++) {

				if(grid[i][j] == '#') {
					if(flag[i][j] == 0) {
						if(i < h-1 && grid[i+1][j] == '#') {
							flag[i+1][j] = 1;
							ans = true;
							continue;
						}
						else if (j < w-1 && grid[i][j+1] == '#') {
							flag[i][j+1] = 1;
							ans = true;
							continue;
						}
						else if (i > 0 && grid[i-1][j] == '#') {
							ans = true;
							continue;
						}
						else if(j > 0 && grid[i][j-1] == '#') {
							ans = true;
							continue;
						}
						else {
							ans = false;
							flag1 = true;
							break;
						}
					}
				}
				else {
					count++;
				}
			}
		}

		if(ans) {
			System.out.println("Yes");
		}
		else if(count == h * w) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc1.close();
	}

}