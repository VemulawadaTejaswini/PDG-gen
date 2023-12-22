import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] A = new int[H][W];
		int[][] D = new int[H][W];
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				D[i][j] = Math.abs(A[i][j] - sc.nextInt());
			}
		}
		
		int LEN = (H+W)*80;
		boolean[][][] b = new boolean[H][W][LEN];
		
		b[0][0][D[0][0]] = true;
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				if(i+1<H) {
					for(int k=0; k<LEN; k++) {
						if(b[i][j][k]) {
							b[i+1][j][k+D[i+1][j]] = true;
							b[i+1][j][Math.abs(k-D[i+1][j])] = true;
						}
					}
				}
				if(j+1<W) {
					for(int k=0; k<LEN; k++) {
						if(b[i][j][k]) {
							b[i][j+1][k+D[i][j+1]] = true;
							b[i][j+1][Math.abs(k-D[i][j+1])] = true;
						}
					}
				}
			}
		}

		for(int i=0; i<=LEN; i++) {
			if(b[H-1][W-1][i]) {
				System.out.println(i);
				sc.close();
				return;
			}
		}
		sc.close();
	}
}

