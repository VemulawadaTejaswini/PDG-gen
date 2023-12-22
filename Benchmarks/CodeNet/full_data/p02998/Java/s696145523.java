import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;


public class Main {

	static class Task {
		
		int NN = 100005;
		int MOD = 1000000007;
		int INF = 2009000000;
		long INFINITY = 2000000000000000000L;

		int [][]a;
		List<Integer> [] rows;
		List<Integer> [] cols;
		
		class UnionFind {
			int parent;
			int rank;
			Set<Integer> cols;
			public UnionFind(int parent, int rank, Set<Integer> q) {
				this.parent = parent;
				this.rank = rank;
				this.cols = q;
			}
		}
		
		UnionFind [] uf;
		
		void update(int u, int v){
			Set<Integer> q1 = uf[u].cols;
			Set<Integer> q2 = uf[v].cols;
			for(int e:q2) {
				q1.add(e);
			}			
		}
		
		void union(int u, int v) {
			u = find(u);
			v = find(v);
			if(uf[u].rank == uf[v].rank) {
				++uf[v].rank;
				uf[u].parent = v;
				update(v, u);
			} else {
				if(uf[u].rank > uf[v].rank) {
					uf[v].parent = u;
					update(u, v);
				} else {
					uf[u].parent = v;
					update(v, u);
				}
			}
		}
		
		int find(int x) {
			return uf[x].parent == x 
					? x 
					: (uf[x].parent = find(uf[x].parent));
		}
		
		public void solve(InputReader in, PrintWriter out) {
			int n = in.nextInt();
			a = new int[n][2];
			rows = new ArrayList[NN];
			cols = new ArrayList[NN];
			uf = new UnionFind[NN];
			for(int i=0;i<NN;++i) {
				rows[i] = new ArrayList<>();
				cols[i] = new ArrayList<>();
			}
			for(int i=0;i<n;++i) {
				a[i][0] = in.nextInt();
				a[i][1] = in.nextInt();
				cols[a[i][0]].add(a[i][1]);
				rows[a[i][1]].add(a[i][0]);
			}
			for(int i=1;i<NN;++i) {
				uf[i] = new UnionFind(
						i, 0, cols[i].stream().collect(Collectors.toSet()));
			}
			for(int col=1;col<NN;++col) {
				if(rows[col].size() < 2)continue;
				int r1= rows[col].get(0);
				for(int i=1;i<rows[col].size();++i) {
					int r2 = rows[col].get(i);
					union(r1, r2);
				}
			}
			long ans = 0;
			for(int row=1;row<NN;++row) {
				if(cols[row].isEmpty())
					continue;
				int tot = uf[find(row)].cols.size();
				ans += 1L * (tot - cols[row].size());
			}
			out.println(ans);
		}
	}
	
	static void prepareIO(boolean isFileIO) {
		//long t1 = System.currentTimeMillis();
		Task solver = new Task();
		// Standard IO
		if(!isFileIO) { 
			InputStream inputStream = System.in;
	        OutputStream outputStream = System.out;
	        InputReader in = new InputReader(inputStream);
	        PrintWriter out = new PrintWriter(outputStream);
	        solver.solve(in, out);
	        //out.println("time(s): " + (1.0*(System.currentTimeMillis()-t1))/1000.0);
	        out.close();
		}
        // File IO
		else {
			String IPfilePath = System.getProperty("user.home") + "/Downloads/ip.in";
	        String OPfilePath = System.getProperty("user.home") + "/Downloads/op.out";
	        InputReader fin = new InputReader(IPfilePath);
	        PrintWriter fout = null;
	        try {
				fout = new PrintWriter(new File(OPfilePath));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	        solver.solve(fin, fout);
	        //fout.println("time(s): " + (1.0*(System.currentTimeMillis()-t1))/1000.0);
	        fout.close();
		}
	}
	
	public static void main(String[] args) {
        prepareIO(false);
	}
	
	static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        
        public InputReader(String filePath) {
        	File file = new File(filePath);
            try {
				reader = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            tokenizer = null;
        }
        
        public String nextLine() {
        	String str = "";
        	try {
				str = reader.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	return str;
        }
        
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
        	return Double.parseDouble(next());
        }
        
    }

}