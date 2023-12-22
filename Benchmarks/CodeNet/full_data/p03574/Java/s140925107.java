
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        char[][] map = new char[H][W];
		for (int i = 0; i < H; i++) {
			map[i] = sc.next().toCharArray();
		}
		
		int[][] ans = new int[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (map[i][j] == '#') {
					ans[i][j] = -1;
					continue;
				}
				
				int count = 0;
				if (0 <= i-1 && 0 <= j-1) {
					count = map[i-1][j-1] == '#' ? count+1 : count;
				}
				
				if (0 <= i-1) {
					count = map[i-1][j] == '#' ? count+1 : count;
				}
				
				if (0 <= i-1 && j+1 < W) {
					count = map[i-1][j+1] == '#' ? count+1 : count;
				}
				
				if (0 <= j-1) {
					count = map[i][j-1] == '#' ? count+1 : count;
				}
				
				if (j+1 < W) {
					count = map[i][j+1] == '#' ? count+1 : count;
				}
				
				if (i+1 < H && 0 <= j-1) {
					count = map[i+1][j-1] == '#' ? count+1 : count;
				}
				
				if (i+1 < H) {
					count = map[i+1][j] == '#' ? count+1 : count;
				}
				
				if (i+1 < H && j+1 < H) {
					count = map[i+1][j+1] == '#' ? count+1 : count;
				}
				
				ans[i][j] = count;
			}
		}
		
		for(int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				System.out.print(ans[i][j] == -1 ? "#" : ans[i][j]);
			}
			System.out.println();
		}
		
    }
}


