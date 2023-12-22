import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
public class Main {
	public static final int N = 100005;
	public static int n;
	public static int[] g = new int[N];

	public static int[] bfa(int s){
		int[] dist = new int[n+1];
		Arrays.fill(dist, -1);
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(s);
		dist[s] = 0;

		while(!q.isEmpty()){
			int u = q.poll();
			for(int v :g){
				if(dist [v] == -1){
					dist[v] = dist[u] + 1;
					q.add(v);
				}
			}
		}
		return dist;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i = 1;i < n;i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			g[a] = b;
			g[b] = a;
		}

		int[] d1 = bfa(1);
		int[] d2 = bfa(n);
		int l = 0;
		int r = 0;
		for (int i = 1;i <= n;i++){
			if(d1[i] <= d2[i]){
				l++;
			}else{
				r++;
			}
		}
		if(l>r){
			System.out.println("Fennec");
		}else{
			System.out.println("Snuke");
		}
	}

}
