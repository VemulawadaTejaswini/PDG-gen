import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K[][] = new int[M][2];
		int min = Integer.MAX_VALUE;
		int max = 0;
		for(int i = 0; i < M; i++) {
			K[i][0] = sc.nextInt();
			max = Math.max(max, K[i][0]);
			K[i][1] = sc.nextInt();
			min = Math.min(min, K[i][1]);
		}
		System.out.println(Math.max(min - max + 1, 0));
	}
}
