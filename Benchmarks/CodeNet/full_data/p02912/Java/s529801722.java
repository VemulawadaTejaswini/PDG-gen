import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i = 0 ; i < N ; ++i){
			int ai = sc.nextInt();
			pq.add(- ai);
		}
		for(int i = 0 ; i < M ; ++i){
			int top = pq.poll();
			int discount = top / 2;
			pq.add(discount);
		}
		long S = 0;
		while(!pq.isEmpty()){
			int top = pq.poll();
			S += top;
		}
		System.out.println(-S);
	}
}
