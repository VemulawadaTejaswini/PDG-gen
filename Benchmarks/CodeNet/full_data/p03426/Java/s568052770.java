import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt();
		int W = in.nextInt();
		int D = in.nextInt();
		
		int[][] A = new int[H*W+1][2];
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				int num = in.nextInt();
				int[] xy = {i + 1, j + 1};
				A[num] = xy;
			}
		}
		
		int[] distSum = new int[H*W+1];
		for(int i = D + 1; i <= H * W; i++) {
			int[] n = A[i];
			int[] p = A[i-D];
			distSum[i] = distSum[i-D] + Math.abs(n[0] - p[0]) + Math.abs(n[1] - p[1]);
		}
		
		int Q = in.nextInt();
		for(int i = 0; i < Q; i++) {
			int L = in.nextInt();
			int R = in.nextInt();
			if(R == L) System.out.println(0);
			else System.out.println(distSum[R] - distSum[L-1]);
		}
	}
}