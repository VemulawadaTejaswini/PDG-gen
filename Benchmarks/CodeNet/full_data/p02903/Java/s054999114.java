import java.util.*;

public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M[][] = new int[H][W];
		boolean able = false;
		if(H/2 >= B && W/2 >= A) {
			able = true;
		}
		if (able && H > 0) {
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					M[i][j] = 0;
				}
			}
			for(int i = 0; i < B; i++) {
				for(int j = 0; j < A; j++) {
					M[i][j] = 1;
				}
			}
			for(int i = B; i < H; i++) {
				for(int j = A; j < W; j++) {
					M[i][j] = 1;
				}
			}
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
	        	System.out.print(M[i][j]);
	        	
			}
				System.out.println();
	        }
			
		}
	}
}
