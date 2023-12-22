import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		String[] A = new String[H + 1];	
		String[][] a = new String[H + 2][W + 2];
		int[][] b = new int[H + 2][W + 2];
		int[] c = new int[H + 2];
		
		int count = 0;
		
		for(int i = 1; i <= H; i++) {
			A[i] = sc.next();
			for(int j = 1; j <= W; j++) {
				a[i][j] = A[i].substring(j - 1, j);
				if(a[i][j].equals("#")) {
					b[i][j] = 1;
					c[i]++;
					count++;
				}
			}
		}	
		
		int x = 2;
	
		while(count != H * W) {
			int y = x - 1;
			for(int i = 1; i <= H; i++) {
				if(c[i] == W && c[i - 1] == W && c[i + 1] == W) {
					continue;
				}
				for(int j = 1; j <= W; j++) {
					if(b[i][j] == y) {
						b[i][j] = x;
						if(j > 1 && b[i][j - 1] != y) {
							if(b[i][j - 1] == 0) {
								count++;
								c[i]++;
							}
							b[i][j - 1] = x;
						}
						if(i > 1 && b[i - 1][j] != y) {
							if(b[i - 1][j] == 0) {
								count++;
								c[i - 1]++;
							}
							b[i - 1][j] = x;
						}
						if(j < W && b[i][j + 1] != y) {
							if(b[i][j + 1] == 0) {
								count++;
								c[i]++;
							}
							b[i][j + 1] = x;
						}
						if(i < H && b[i + 1][j] != y) {
							if(b[i + 1][j] == 0) {
								count++;
								c[i + 1]++;
							}
							b[i + 1][j] = x;
						}
					}	
				}	
			}
			x++;
		}
		System.out.println(x - 2);
	}
}
