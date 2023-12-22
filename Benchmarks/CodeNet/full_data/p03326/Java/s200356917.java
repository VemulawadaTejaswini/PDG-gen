
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		

		PriorityQueue <Long> A = new PriorityQueue <Long>();
		PriorityQueue <Long> B = new PriorityQueue <Long>();
		PriorityQueue <Long> C = new PriorityQueue <Long>();
		PriorityQueue <Long> D = new PriorityQueue <Long>();
		PriorityQueue <Long> E = new PriorityQueue <Long>();
		PriorityQueue <Long> F = new PriorityQueue <Long>();
		PriorityQueue <Long> G = new PriorityQueue <Long>();
		PriorityQueue <Long> H = new PriorityQueue <Long>();
		
		
		long b=0;
		long t=0;
		long p=0;
		for (int i=0; i<N; i++){
			b=sc.nextLong();
			t=sc.nextLong();
			p=sc.nextLong();
			
			A.add(b+t+p);
			B.add(b+t-p);
			C.add(b-t-p);
			D.add(-b-t-p);
			E.add(b-t+p);
			F.add(-b-t+p);
			G.add(-b+t+p);
			H.add(-b+t-p);
		}
	
		
		for (int i=0; i<N-M; i++){
			A.poll();
			B.poll();
			C.poll();
			D.poll();
			E.poll();
			F.poll();
			G.poll();
			H.poll();
		}
		
		long ans=0;
		long temp=0;
		
		for (int i=0; i<M; i++){
			temp+=A.poll();
		}
		long temp2=0;
		for (int i=0; i<M; i++){
			temp2+=B.poll();
		}
		ans = Math.max(temp,temp2);
		temp=0;
		for (int i=0; i<M; i++){
			temp+=C.poll();
		}
		ans = Math.max(temp,ans);
		
		temp=0;
		for (int i=0; i<M; i++){
			temp+=D.poll();
		}
		ans = Math.max(temp,ans);
		
		temp=0;
		for (int i=0; i<M; i++){
			temp+=E.poll();
		}
		ans = Math.max(temp,ans);
		
		temp=0;
		for (int i=0; i<M; i++){
			temp+=F.poll();
		}
		ans = Math.max(temp,ans);
		
		temp=0;
		for (int i=0; i<M; i++){
			temp+=G.poll();
		}
		ans = Math.max(temp,ans);
		
		temp=0;
		for (int i=0; i<M; i++){
			temp+=H.poll();
		}
		ans = Math.max(temp,ans);
		
		
		System.out.println(ans);
		sc.close();

	}

}
