import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int K = sc.nextInt();
		Deque<Integer> temp = new ArrayDeque<>();
		
		int sum = 0;
		int max = 0;
		Object[] maxArray = null;
		for (int i = 0; i < N; i++) {
			int p = sc.nextInt();
			if (i < K) {
				sum +=p;
				temp.add(p);
				if (i == K - 1) {
					max = sum;
					maxArray = temp.toArray();
				}
			}
			else {
				sum = sum - temp.poll() + p;
				temp.add(p);
				if (sum > max) {
					max = sum;
					maxArray = temp.toArray();
				}
			}
		}
		
		// 結果の出力
		double result = 0;
		for (int i = 0; i < K; i++) {
			result += (1.0 + (int)maxArray[i]) / 2;
		}
		System.out.println(result);
		sc.close();
	}
}
