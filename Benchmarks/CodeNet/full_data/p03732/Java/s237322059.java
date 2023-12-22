import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		int N = in.nextInt(), W = in.nextInt();
		int[][] t = new int[N + 1][W + 1];
		for(int i = 0; i < N; i++){
			Arrays.fill(t[i], 0);
		}
		int[] w = new int[N + 1];
		int[] v = new int[N + 1];
		for(int i = 1; i <= N; i++){
			w[i] = in.nextInt();
			v[i] = in.nextInt();
		}
		
		for(int i = 1; i <= N; i++){
			for(int j = 1; j <= W; j++){
				if(j < w[i]){
					t[i][j] = t[i- 1][j];
				}else{
					t[i][j] = Math.max(t[i - 1][j - w[i]] + v[i], t[i - 1][j]);
				}
			}
		}
		System.out.println(t[N][W]);
	}
}