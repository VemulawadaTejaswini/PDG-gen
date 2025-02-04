import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int N;
	int[]a;
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		a=new int[3*N];
		PriorityQueue<Integer> p=new PriorityQueue();
		PriorityQueue<Integer> q=new PriorityQueue(Comparator.reverseOrder());
		
		for(int i=0;i<3*N;i++){
			a[i]=Integer.parseInt(sc.next());
		}
		long[]max=new long[N+1];
		long[]min=new long[N+1];
		long sump=0;
		long sumq=0;
		//初期化
		for(int j=0;j<N;j++){
			p.add(a[j]);
			q.add(a[2*N+j]);
			sump+=a[j];
			sumq+=a[2*N+j];
		}
		
		max[0]=sump;
		min[N]=sumq;
		
		for(int i=1;i<=N;i++){
			p.add(a[N-1+i]);
			sump+=a[N-1+i];
			sump-=p.poll();
			max[i]=sump;
		}
		
		for(int i=1;i<=N;i++){
			q.add(a[2*N-i]);
			sumq+=a[2*N-i];
			sumq-=q.poll();
			min[N-i]=sumq;
		}
		
		long Max=-Long.MAX_VALUE/2;
		for(int i=0;i<=N;i++){
			Max=Math.max(Max, max[i]-min[i]);
		}
		System.out.println(Max);
	}
}
