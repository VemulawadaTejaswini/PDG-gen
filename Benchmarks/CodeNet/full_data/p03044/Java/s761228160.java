import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main{
	static HashMap<Integer, ArrayList<Integer>> map;
	static long[][] table;
	static boolean[] visited;
	static int[] ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in=new StringTokenizer(br.readLine());
        int N =Integer.parseInt(in.nextToken());
        in = null;
		table = new long[N][N];
		map = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < N; i++) {
			map.put(i, new ArrayList<Integer>());
		}
		for (int i = 0; i < N-1; i++) {
			in =new StringTokenizer(br.readLine());
	        int u =Integer.parseInt(in.nextToken()) - 1;
	        int v =Integer.parseInt(in.nextToken()) - 1;
	        long w = Long.parseLong(in.nextToken());
	        in = null;
	        table[u][v] = w;
	        table[v][u] = w;
	        map.get(u).add(v);
	        map.get(v).add(u);
		}
		br=null;
		ans = new int[N];
		visited = new boolean[N];
		ans[0] = 0;
		execute(0);
		for (int i = 0; i < N; i++) {
			System.out.println(ans[i]);
		}

	}
	static void execute (int next) {
		ArrayList<Integer> nodes = map.get(next);
		for (Integer num : nodes) {
			if (!visited[num]) {
				visited[num] = true;
				if (table[next][num] % 2 == 0) {
					ans[num] = ans[next];
				} else {
					ans[num] = (ans[next] + 1) % 2;
				}
				execute(num);
			}
		}
	}



}