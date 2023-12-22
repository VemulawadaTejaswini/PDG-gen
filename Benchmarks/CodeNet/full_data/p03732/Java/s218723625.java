import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		int N = in.nextInt(), W = in.nextInt();
		int[] b = new int[W + 1];
		Arrays.fill(b, 0);
		int[][] items = new int[N][2];
		for(int i = 0; i < N; i++){
			items[i][0] = in.nextInt();
			items[i][1] = in.nextInt();
		}
		
		for(int w = 0; w <= W; w++){
			for(int n = 0; n < N; n++){
				if(w - items[n][0] >= 0){
					b[w] = Math.max(b[w], b[w - items[n][0]] + items[n][1]);
				}
			}
		}
		System.out.println(b[W]);
	}
}
