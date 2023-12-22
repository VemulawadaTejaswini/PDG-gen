import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Long> q=new PriorityQueue();
		PriorityQueue<Long> p=new PriorityQueue(Comparator.reverseOrder());
		long[] min=new long[n+1];
		long[] max=new long[n+1];
		long[] mid=new long[n];
		long sumn=0;
		long sumx=0;
		for(int i = 0; i<3*n; i++){
			long a = sc.nextLong();
			if(i<n){
				q.add(a);
				sumx+=a;
			}else if(i>=2*n){
				p.add(a);
				sumn+=a;
			}else{
				mid[i-n]=a;
			}
		}
		max[0]=sumx;
		min[0]=sumn;
		for(int i = 1; i<=n; i++){
			q.add(mid[i-1]);
			p.add(mid[n-i]);
			max[i]=max[i-1]+mid[i-1]-q.poll();
			min[i]=min[i-1]+mid[n-i]-p.poll();
		}
		long ans=Long.MIN_VALUE;
		for(int i = 0; i<=n; i++){
			ans=Math.max(ans,max[i]-min[n-i]);
		}
		System.out.println(ans);
	}
}
