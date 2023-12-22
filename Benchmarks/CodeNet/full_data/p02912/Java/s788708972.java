import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		Queue<Integer> que = new PriorityQueue<>((e1,e2)->-e1+e2);
		for(int i=0;i<n;i++) que.add(in.nextInt());
		for(int i=0;i<m;i++) {
			int tmp = que.poll()/2;
			que.add(tmp);
		}
		long ans = 0;
		for(int i=0;i<n;i++) {
			ans += que.poll();
		}
		System.out.println(ans);
		in.close();

	}

}
