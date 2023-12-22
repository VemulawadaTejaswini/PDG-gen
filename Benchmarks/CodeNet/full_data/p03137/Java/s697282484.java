import java.util.Arrays;
import java.util.Scanner;

// C - Stones
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] x = new int[M];
		int[] width = new int[M-1]; // 隣り合う二点の距離
		int sum = 0;
		int out = 0;
		if (N >= M) {
			System.out.println(0);
		} else {
			for (int i = 0; i < x.length; i++) {
				x[i]=sc.nextInt();
			}
			Arrays.sort(x); // 小さい順
			for (int i=0; i < width.length; i++) {
				width[i]=x[i+1]-x[i];
			}
			Arrays.sort(width);
			for (int i = 0; i < N-1; i++) {
				sum+=width[width.length-1-i];
			}
		}
	}
}
回答みた