
import java.util.Scanner;

public class Main {
	
	static char [][]grid;
	static int [][]ans;

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		
		int k = Integer.parseInt(sc.next());
		
		grid = new char[h][w];
		ans = new int [h][w];
		
		for(int i = 0 ;i < h ; i++) {
			String s = sc.next();
			for(int j = 0 ; j < w ; j++) {
				grid[i][j] = s.charAt(j);
			}
		}
		
		int firstH = -1;
		boolean first = false;
		int id = 1;
		
		for(int y = 0 ; y < h ; y++) {
			boolean exsitX = false;
			
			for(int x = 0 ; x < w ; x++) {
				if(grid[y][x] == '#') {
					if(firstH == -1) {
					firstH = y;
					}
					first = true;
					exsitX = true;
				}
			}
			if(exsitX) {
				int lastX = -1;
				for(int x = 0 ; x < w ; x++) {
					ans[y][x] = id;
					if(grid[y][x] == '#') {
						id++;
						lastX = x;
					}
				}
				for(int x = lastX + 1 ; x < w ; x++) {
					ans[y][x]--;
				}
			}
			else {
				if(first) {
					for(int x = 0 ; x < w ; x++) {
					ans[y][x] = ans[y-1][x];
				}
			}	
		}
	}
		
			for(int i = firstH -1 ; i >= 0 ; i--) {
				for(int j = 0 ; j < w ; j++) {
					ans[i][j] = ans[i+1][j];
				}
			}
			
			for(int i = 0 ; i < h ; i++) {
				for(int j = 0 ; j < w ; j++) {
					System.out.print(ans[i][j]);
				}
				System.out.println();
			}
		
			
			}

	}


