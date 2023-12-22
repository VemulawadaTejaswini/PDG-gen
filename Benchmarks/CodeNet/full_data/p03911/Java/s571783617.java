import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			HashMap<Integer, HashSet<Integer>> speaks = new HashMap<Integer, HashSet<Integer>>();
			for(int i = 0; i < N; i++){
				final int K = sc.nextInt();
				
				for(int j = 0; j < K; j++){
					final int L = sc.nextInt();
					
					if(!speaks.containsKey(L)){
						speaks.put(L, new HashSet<Integer>());
					}
					
					speaks.get(L).add(i);
				}
			}
			
			UnionFind uf = new UnionFind(N);
			for(final Entry<Integer, HashSet<Integer>> entry : speaks.entrySet()){
				int prev_person = -1;
				for(final int person : entry.getValue()){
					if(prev_person < 0){
						prev_person = person;
					}else{
						uf.union(prev_person, person);
					}
				}
			}
			
			System.out.println(uf.size(0) == N ? "YES" : "NO");
		}
	}
	
	public static class UnionFind{
		int[] par; //
		
		public UnionFind(int n){
			par = new int[n];
			for(int i = 0; i < n; i++){ par[i] = -1; }
		}
		
		public int find(int x){
			if(par[x] < 0){
				return x;
			}else{
				return par[x] = find(par[x]);
			}
		}
		
		public boolean union(int x, int y){
			x = find(x);
			y = find(y);
			
			if(x != y){
				if(par[y] < par[x]) {  // 多い方が根になるようにスワップする.
					int tmp = x; x = y; y = tmp;
				}
				par[x] += par[y];
				par[y] = x;
				return true;
			}else{
				return false;
			}
		}
		
		public boolean same(int x, int y){
			return find(x) == find(y);
		}
		
		public int size(int x){
			return -par[find(x)];
		}
	}
	
	public static class Scanner implements AutoCloseable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() {
			try {
				while (!hasNext()) {tok = new StringTokenizer(br.readLine());}
			} catch(IOException e){ /* ignore */ }
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() {
			getLine(); return tok.nextToken();
		}

		public int nextInt(){
			return Integer.parseInt(next());
		}
		// 他のnextXXXもXXX.parseXXX()メソッドを使って作れるので省略

		public void close() {
			try{ br.close(); } catch (IOException e){ /*ignore*/ }
		}
	}
}
