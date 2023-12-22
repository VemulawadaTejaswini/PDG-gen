import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PriorityQueue<Long> q=new PriorityQueue<>();
		for(int i=0; i<n; i++){
			long a=sc.nextLong();
			q.add(a);
		}
		long ans=0;
		while(q.size()>1){
			long t1=q.poll();
			long t2=q.poll();
			ans+=t1+t2;
			q.add(t1+t2);
		}
		System.out.println(ans);
	}
}