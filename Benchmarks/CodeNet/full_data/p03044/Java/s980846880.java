import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int edge[][] = new int[n-1][3];
		List<int[]>[] link = new List[n];
		for(int i=0; i<n; i++) {
			link[i] = new LinkedList<int[]>();
		}
		int[] color = new int[n];
		Arrays.fill(color, -1);

		int u, v, w;
		for(int i=0; i<n-1; i++) {
			u=sc.nextInt()-1;
			v=sc.nextInt()-1;
			w=sc.nextInt();
			edge[i][0]=u;
			edge[i][1]=v;
			edge[i][2]=w;
		}
		for(int i=0; i<n-1; i++) {
			link[edge[i][0]].add(edge[i]);
			link[edge[i][1]].add(edge[i]);
		}
		Queue<Integer> q= new ArrayDeque<>();
		q.add(0);
		color[0]=0;
		int next;
		int p;
		while(q.size()!=0) {
			p = q.poll();
			for(int[] l: link[p]) {
				if(l[0]==p) next=l[1];
				else next=l[0];
				if(color[next]>=0) continue;
				q.add(next);
				color[next]=color[p]^l[2]%2;
			}
		}
		for(int c: color)
			System.out.println(c);
	}
}