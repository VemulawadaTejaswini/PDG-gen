import java.util.*;
import java.io.*;

class Main {

	void solve() {
		
		int[][] map = {
				{inint(), inint(), inint()},
				{inint(), inint(), inint()},
				{inint(), inint(), inint()}
		};
		
		boolean[][] memo = new boolean[3][3];
		
		int n = inint();
		
		for (int i=0; i<n; i++) {
			int number = inint();
			
			for (int j=0; j<3; j++) {
				for (int k=0; k<3; k++) {
					if (map[j][k] == number) {
						memo[j][k] = true;
					}
				}
			}
			
		}
		
		out.println(isBingo(memo) ? "Yes" : "No");
		
		
		
	}
	
	public boolean isBingo(boolean[][] map) {
		
		if (
				(map[0][0] && map[0][1] && map[0][2]) ||
				(map[1][0] && map[1][1] && map[1][2]) ||
				(map[2][0] && map[2][1] && map[2][2]) ||
				(map[0][0] && map[1][0] && map[2][0]) ||
				(map[0][1] && map[1][1] && map[2][1]) ||
				(map[0][2] && map[1][2] && map[2][2]) ||
				(map[0][0] && map[1][1] && map[2][2]) ||
				(map[0][2] && map[1][1] && map[2][0])
			) {
			return true;
		}
		return false;
		
	}
	
	

	public static Scanner in = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

	public int inint() {
		return in.nextInt();
	}

	public long inlong() {
		return in.nextLong();
	}

	public double indouble() {
		return in.nextDouble();
	}

	public String instr() {
		return in.next();
	}

	public char inchar() {
		return in.next().charAt(0);
	}

	public int[] inintar(int num) {
		int[] a = new int[num];
		for (int i=0; i<num; i++) {
			a[i] = in.nextInt();
		}
		return a;
	}

	public char[] incharar() {
		return in.next().toCharArray();
	}

	public char[][] incharmap(int h, int w) {
		char[][] a = new char[h][w];
		for (int i=0; i<h; i++) {
			String temp = in.next();
			for (int j=0; j<w; j++) {
				a[i][j] = temp.charAt(j);
			}
		}
		return a;
	}

}