import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] bingo = new int[3][3];
		int[] row = new int[101];
		int[] col = new int[101];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				bingo[i][j] = in.nextInt();
				row[bingo[i][j]] = i;
				col[bingo[i][j]] = j;
			}
		}
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			int cur = in.nextInt();
			bingo[row[cur]][col[cur]] = 1;
		}
		boolean ans = false || rw(0, bingo) || rw(1, bingo) || rw(2, bingo);
		ans |= cl(0, bingo) || cl(1, bingo) || cl(2, bingo);
		int c = 0;
		boolean temp = true;
		for(int i = 0; i < 3; i++) {
			if(bingo[i][c] != 1) temp = false;
			c += 1;
		}
		ans |= temp;
		temp = true;
		c = 0;
		for(int i = 2; i >= 0; i--) {
			if(bingo[i][c] != 1) temp = false;
			c += 1;
		}
		ans |= temp;
		if(ans == true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	public static boolean rw(int r, int[][] bingo) {
		for(int i = 0; i < 3; i++) {
			if(bingo[r][i] != 1) return false;
		}
		return true;
	}
	public static boolean cl(int c, int[][] bingo) {
		for(int i = 0; i < 3; i++) {
			if(bingo[i][c] != 1) return false;
		}
		return true;
	}
} 
