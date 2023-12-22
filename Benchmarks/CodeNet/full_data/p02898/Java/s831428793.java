import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int resultCount = 0;
		for (int i = 0; i < N; i++) {
			int[] list = new int[N];
			list[i] = sc.nextInt();
			if (list[i] >= K) {
				resultCount++;
			}
		}
		System.out.println(resultCount);
	}
}