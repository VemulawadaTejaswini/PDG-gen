import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {

	static int count = 0;
	static boolean[] m;
	static Map<Integer, List<Integer>> spoken;
	static int[][] L;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(reader.readLine().split("\\s")[0]);
		L = new int[N][];
		m = new boolean[N];
		spoken = new HashMap();
		for (int j = 0; j < N; j++) {
			String[] raw = reader.readLine().split("\\s");
			L[j] = new int[Integer.parseInt(raw[0])];
			for (int k = 0; k < L[j].length; k++) {
				L[j][k] = Integer.parseInt(raw[k+1]);
				if (!spoken.containsKey(L[j][k]))
					spoken.put(L[j][k], new ArrayList());
				spoken.get(L[j][k]).add(j);
			}
		}
		dfs(0);
		System.out.println(count == N ? "YES" : "NO");
	}

	static void dfs(int current) {
		count++;
		if (count == N) return;
		m[current] = true;
		for (int k = 0; k < L[current].length; k++) {
			int lang = L[current][k];
			for (int v: spoken.get(lang))
				if (!m[v])
					dfs(v);
		}
	}
	
}
