
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		
		char[][] c = new char[h][w];
		
		for(int i = 0 ;i < h ;i++) {
			String s = sc.next();
			for(int j = 0 ; j< w ;j++) {
				c[i][j] = s.charAt(j);
			}
		}
		boolean [][]grid = new boolean[h][w];
		boolean []flag = new boolean [h];
		
		for(int i = 0 ;i < h ;i++) {
			boolean jdg = true;
			for(int j = 0 ; j < w ;j++) {
				if(c[i][j] == '#')
					jdg = false;
			}
			
			if(jdg) {
				flag[i] = true;
				for(int j = 0 ; j < w ;j++) {
					grid[i][j] = true;
				}
			}
		}
		
		for(int i = 0 ; i < w ; i++) {
			boolean jdg = true;
			for(int j = 0 ; j < h ; j++) {
				if(c[j][i] == '#')
					jdg = false;
			}
			if(jdg) {
				for(int j = 0 ; j < h ;j++) {
					grid[j][i] = true;
				}
			}
		}
		
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				if(flag[i]) {
					break ;
				}
				if(grid[i][j]) {
					continue;
				}
				else {
				System.out.print(c[i][j]);
			}
		}if(!flag[i])
			System.out.println();
	}

}
	}
