import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] a = new int[N][2];
		for(int i = 0;i < N;i ++) {
			for(int k = 0;k < 2;k ++) {
				a[i][k] = sc.nextInt();
			}
		}
		int sum = 0;
		for(int i = 0;i < N;i ++) {
			sum += a[i][1] - a[i][0] + 1;
		}
		System.out.print(sum);
	}
}