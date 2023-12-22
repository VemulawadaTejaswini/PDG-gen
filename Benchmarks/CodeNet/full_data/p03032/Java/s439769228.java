import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt();
		int[] a=new int[n];
		Arrays.setAll(a,i->s.nextInt());

		PriorityQueue<Integer> q=new PriorityQueue<>();
		int v=0;
		for(int l=0;l<=Math.min(n,k);++l){
			for(int r=0;l+r<=Math.min(n,k);++r){
				q.clear();
				for(int i=0;i<l;++i)
					q.add(a[i]);
				for(int i=0;i<r;++i)
					q.add(a[n-1-i]);
				for(int i=k-l-r;i>0&&!q.isEmpty()&&q.peek()<0;--i)
					q.poll();
				v=Math.max(v,q.stream().mapToInt(i->i).sum());
			}
		}
		System.out.println(v);
	}
}
