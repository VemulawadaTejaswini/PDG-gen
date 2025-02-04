import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static long MIN = Long.MIN_VALUE;

	public static void main(String[] args){
		Scanner io = new Scanner(System.in);
		int N = io.nextInt();
		PriorityQueue<Integer> que1 = new PriorityQueue<Integer>();
		int[] center = new int[N];
		PriorityQueue<Integer> que2 = new PriorityQueue<Integer>(new Bigger());
		long sum1=0,sum2=0;
		
		int a;
		for (int i = 0; i < N; i++) {
			a = io.nextInt();
			sum1 += a;
			que1.offer(a);
		}
		for (int i = 0; i < N; i++) {
			a = io.nextInt();
			center[i] = a;
		}
		for (int i = 0; i < N; i++) {
			a = io.nextInt();
			sum2 += a;
			que2.offer(a);
		}
		
		long[] max = new long[N+1];
		long[] min = new long[N+1];
		
		max[0] = sum1;
		for(int i=0;i<N;i++){
			if(que1.peek()<center[i]){
				sum1 += center[i]-que1.poll();
				que1.offer(center[i]);
			}
			max[i+1] = sum1;
		}
		
		min[N] = sum2;
		for(int i=N-1;i>=0;i--){
			if(que2.peek()>center[i]){
				sum2 -= que2.poll()-center[i];
				que2.offer(center[i]);
			}
			min[i] = sum2;
		}
		long ans = Long.MIN_VALUE;
		for(int i=0;i<N+1;i++){
			ans = Math.max(ans,max[i]-min[i]);
		}
		System.out.println(ans);
	}
}

class Bigger implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return Integer.compare(o2, o1);
	}
	
}