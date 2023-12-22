import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N, Mの入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		// PriorityQueの作成
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		// 品物の値段の入力
		for (int i = 0; i < N; i++) {
			pq.offer(sc.nextInt());
		}
		
		// その時点で最も値段の高い品物に割引券を使う
		for (int i = 0; i < M; i++) {
			int max = pq.poll();
			pq.offer(max / 2);
		}
		
		// 割引後の価格の合計を計算
		long sum = 0;
		for (int price : pq) {
			sum += price;
		}
		System.out.println(sum);
	}
}
