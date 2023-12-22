import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int H = sc.nextInt();
    	int W = sc.nextInt();
    	char[][] Si = new char[H][W];
    	for (int i = 0; i < H; i++) {
    		Si[i] = sc.next().toCharArray();
    	}
    	int[][] dir = {{-1, -1},{-1, 0},{-1,1},{0, -1},{0, 1},{1,-1},{1,0},{1,1}};
    	for (int i = 0; i < H; i++) {
    		for (int j = 0; j < W; j++) {
    			if (Si[i][j] == '.') {
    				int count = 0;
    				for (int k = 0; k < dir.length; k++) {
    					int h = i + dir[k][0];
    					int w = j + dir[k][1];
    					if (0 <= h && h < H &&
    						0 <= w && w < W && Si[h][w] == '#') {
    						count++;
    					}
    				}
    				Si[i][j] = (char) (count + '0');
    			}
    			
    		}
    	}
    	for (char[] si :Si) {
    		System.out.println(si);
    	}
    }
}