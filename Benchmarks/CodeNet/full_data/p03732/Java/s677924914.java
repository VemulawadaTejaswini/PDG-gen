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
		int[][] items = new int[N + 1][2];
		for(int i = 1; i <= N; i++){
			items[i][0] = in.nextInt();
			items[i][1] = in.nextInt();
		}
		
		for(int n = 1; n <= N; n++){
			for(int w = 1; w <= W; w++){
				if(w < items[n][0]){
					t[n][w] = t[n- 1][w];
				}else{
					t[n][w] = Math.max(t[n - 1][w - items[n][0]] + items[n][1], t[n - 1][w]);
				}
			}
		}
		System.out.println(t[N][W]);
	}
}
