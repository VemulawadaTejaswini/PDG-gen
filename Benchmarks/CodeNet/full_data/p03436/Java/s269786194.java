import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int W = s.nextInt();
		char[][] maze = new char[H][W];
		int blacknum = 0;
		String str;
		for(int i = 0; i < H; i++) {
			str = s.next();
			blacknum += charcount(str);
			maze[i] = str.toCharArray();
		}
		
		int[] start = {0, 0, 0}; // row, col
		Queue<int[]> Q = new ArrayDeque<int[]>();
		Q.add(start);
		int[][] pass = new int[H][W];
		
		int[] vcol = {1, 0, -1,  0};
		int[] vrow = {0, 1,  0, -1};
		
		int[] tmp;
		int trow, tcol;
		while(!Q.isEmpty()) {
			tmp = Q.poll();
			for(int i = 0; i < 4; i++) {
				trow = tmp[0] + vrow[i];
				tcol = tmp[1] + vcol[i];
				if(rangecheck(trow, tcol, H, W)) {
					if(pass[trow][tcol] > 0 || maze[trow][tcol] == '#')
						continue;
					Q.add(new int[] {trow, tcol, tmp[2] + 1});
					pass[trow][tcol] = tmp[2] + 1;
				}
			}
		}
		
		if(pass[H-1][W-1] == 0) {
			System.out.println(-1);
			return;
		}
		
		System.out.println((H*W)-blacknum-pass[H-1][W-1]-1);
	}
	
	private static boolean rangecheck(int row, int col, int H, int W) {
		return (0 <= row && row < H && 0 <= col && col < W);
	}
	
	private static int charcount(String str) {
		int result = 0;
		int index = -1;
		while(index < str.length() && (index = str.indexOf('#', ++index)) > -1) {
			result++;
		}
		return result;
	}
}