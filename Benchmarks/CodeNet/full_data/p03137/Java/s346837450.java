import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static int N;
	static int M;
	static int[] X;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		X = new int[M];
		if (N-1 > M-1) {
			System.out.println(0);
			return;
		}
		// 区間幅の大きい N-1子を削除
		for(int i=0;i<M;i++) {
			X[i] = sc.nextInt();
		}
		Arrays.sort(X);
		int[] band = new int[M-1];
		for(int i=0;i<M-1;i++) {
			band[i] = X[i+1]-X[i];
		}
		Arrays.parallelSort(band);
		int sum = 0;
		for(int i=0;i<M-N;i++) {
			sum += band[i];
		}
		System.out.println(sum);
	}
		
}