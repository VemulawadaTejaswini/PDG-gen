
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//方針：BFS
		//利用；キュー、隣接リスト
		
		List<ArrayList<int[]>> l = new ArrayList<ArrayList<int[]>>();
		for(int i=0;i<N;i++) l.add(new ArrayList<int[]>());
		
		for(int i=0;i<N-1;i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			int dist = sc.nextInt();
			from--;
			to--;
			int tmp1[] = {to,dist};
			l.get(from).add(tmp1);
			int tmp2[] = {from,dist};
			l.get(to).add(tmp2);
		}
		
		int ans[] = new int[N];
		Arrays.fill(ans,-1);
		ans[0]=0;
		
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(0);
		while(!q.isEmpty()) {
			int from = q.poll();
			List<int[]> tos = l.get(from);
			for(int tmp[] :tos) {
				int to = tmp[0];
				int dist = tmp[1];
				if(ans[to]!=-1)continue;
				ans[to]=dist%2;
				q.offer(to);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		Arrays.stream(ans).forEach(i->sb.append(i + "\n"));
		System.out.println(sb.toString());
		
	}
}
