import java.util.*;
public class Main {

	public static boolean aufg() {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] grid = new char[h][w];
		
		for(int i = 0; i < h; i++) {
			String line = sc.next();

			char[] thisline=line.toCharArray();
			for(int j = 0; j<thisline.length; j++) {
				grid[i][j]=thisline[j];
			}
		}
		

		
		for(int i = 0; i <h; i++) {
			for(int j = 0; j <w; j++) {
				char pat = grid[i][j];
				if(pat == '#') {
				boolean left = false, right = false,
						top = false, bottom = false;
				
				// check left
				if(i>0)if(grid[i-1][j]==pat)left = true;;
				// check right
				if(i<w-1)if(grid[i+1][j]==pat)right = true;;
				//check top
				if(j>0)if(grid[i][j-1]==pat)top = true;
				//check bottom
				if(j<h-1)if(grid[i][j+1]==pat)bottom = true;;
				
				if(!(top || bottom || left || right))return false;
				}
			}
			
			
		}
		return true;
		
	
	}
	
	public static void main(String[] args) {
		boolean possible = aufg();
		if(possible)System.out.println("Yes");
		else System.out.println("No");
	}
}
