import java.util.*;
import java.util.stream.*;

class Main{

	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		ArrayList<ArrayList<Integer>>g=new ArrayList<>(n);
		for(int i=0;i<n;++i)
			g.add(new ArrayList<>(1));

		int[] c=new int[n];
		for(int i=0;i<n-1;++i){
			int a=s.nextInt()-1;
			int b=s.nextInt()-1;
			++c[a];
			++c[b];
			g.get(a).add(b);
			g.get(b).add(a);
		}

		PriorityQueue<Integer> v=new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0;i<n;++i)
			v.add(s.nextInt());

		int root=IntStream.range(0,n).boxed()
				.max(Comparator.<Integer>comparingInt(i->c[i]))
				.get();

		int[] w=new int[n];
		f(root,w,v,g);

		{
			IntSummaryStatistics iss=Arrays.stream(w).summaryStatistics();
			System.out.println(iss.getSum()-iss.getMax());
		}
		System.out.println(Arrays.stream(w).mapToObj(String::valueOf)
				.collect(Collectors.joining(" ")));
	}

	private static void f(int root,int[] w,PriorityQueue<Integer> v, ArrayList<ArrayList<Integer>> g){
		w[root]=v.poll();
		for(int next:g.get(root)) {
			if(w[next]==0)
				f(next,w,v,g);
		}
	}
}