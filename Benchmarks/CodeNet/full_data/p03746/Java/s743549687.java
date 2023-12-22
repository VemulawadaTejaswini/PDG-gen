import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<Integer> lAdy[];
	static ArrayList<Integer> lista;

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st;
		int n, m;
		for (String line; (line = in.readLine()) != null;) {
			st = new StringTokenizer(line);
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			profMax = 0;
			lAdy = new ArrayList[n];
			for (int i = 0; i < n; lAdy[i] = new ArrayList<>(), i++)
				;

			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(in.readLine());
				int u = Integer.parseInt(st.nextToken()) - 1;
				int v = Integer.parseInt(st.nextToken()) - 1;
				if (u != v) {
					lAdy[u].add(v);
					lAdy[v].add(u);
				}
			}
			lista = new ArrayList<>();
			int u = 0;
			int v = 0;
			for (int i = 0; i < lAdy.length; i++) {
				if (lAdy[i].size() > 0) {
					// out.println(2);
					// out.println((i + 1) + " " + (lAdy[i].get(i)));
					u = i;
					v = lAdy[i].get(0);
					break;
				}
			}
			StringBuilder sb = new StringBuilder();
			lista.add(u+1);
//			System.out.println(lAdy[v]);
			for (Integer i : lAdy[v]) {
				if (i != u && i != v)
				lista.add(i+1);
			}
			lista.add(v+1);

			for (Integer i : lista) {
					sb.append(i + " ");
			}

			out.println(lista.size());
			out.println(sb.toString().trim());

		}
		out.close();
	}

	static int profMax;

	static void dfs(int v) {

	}

}
