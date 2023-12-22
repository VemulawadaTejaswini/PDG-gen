import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

// Genericを使った 多分これがよい？
// 実際のソートするときはComparatorで持たせる（下記参照）
class Pair<F, S>{
    public final F first;
    public final S second;

    public Pair (F first, S second) {
        this.first = first;
        this.second = second;
    }
}
class Main{
	public static void main(String args[]){
	    final int INF = Integer.MAX_VALUE/2;
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Pair<Integer, Integer>>[] edge = new ArrayList[N];
		for(int i = 0; i < N; i++) {
			edge[i] = new ArrayList<Pair<Integer, Integer>>();
		}
		for(int i = 0; i < N - 1; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			edge[u - 1].add(new Pair<Integer, Integer>(v - 1, w));
			edge[v - 1].add(new Pair<Integer, Integer>(u - 1, w));
		}

        int[] d = new int[N];
        boolean[] used = new boolean[N];
        Arrays.fill(used, false);
        Arrays.fill(d, INF);
        d[0] = 0;

        PriorityQueue<Pair<Integer, Integer>> que=new PriorityQueue<Pair<Integer, Integer>>(new Comparator<Pair<Integer, Integer>>() {
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return o1.second - o2.second;
            }
        });

        que.add(new Pair<Integer, Integer>(0, 0));
        while(!que.isEmpty()){
            Pair<Integer, Integer> now = que.poll();
            int point = now.first;
            if(used[point]) continue;
            used[point]=true;
            for(Iterator<Pair<Integer, Integer>> it = edge[point].iterator(); it.hasNext();) {
                Pair<Integer, Integer> next = it.next();
                if(!used[next.first] && d[next.first] > d[point] + next.second) {
                    d[next.first] = d[point] + next.second;
                    que.add(new Pair<Integer, Integer>(next.first, d[next.first]));
                }
            }
        }

        for(int i = 0;  i < N; i++) {
        	System.out.println((d[i] % 2 == 0) ? 0 : 1);
        }
	}
}