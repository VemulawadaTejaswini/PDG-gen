import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
    	int N, M;
    	int[] p;
    	UnionFind uf;
    	Map<Integer, Set<Integer>> group = new HashMap<>();
    	
        void solve(InputReader in, PrintWriter out) {
        	N = in.nextInt();
        	M = in.nextInt();
        	
        	p = new int[N];
        	for (int i = 0; i < N; ++i) {
        		p[i] = in.nextInt() - 1;
        	}
        	
        	uf = new UnionFind(N);
        	
        	for (int i = 0; i < M; ++i) {
        		int x = in.nextInt() - 1;
        		int y = in.nextInt() - 1;
        		uf.unite(x, y);
        	}
        	
        	for (int i = 0; i < N; ++i) {
        		int rt = uf.root(i);
        		if (group.containsKey(rt)) {
        			group.get(rt).add(i);
        		} else {
        			Set<Integer> set = new HashSet<>();
        			set.add(i);
        			group.put(rt, set);
        		}
        	}
        	
        	int ans = 0;
        	
        	for (Set<Integer> set : group.values()) {
        		for (int i : set) {
        			if (set.contains(p[i])) ans++;
        		}
        	}
        	
        	out.println(ans);
        }
    }
    
    static class UnionFind {
    	private	int[] rank, parent;
    	
    	public UnionFind(int size) {
    		this.rank = new int[size];
    		this.parent = new int[size];
    		for (int i = 0; i < size; ++i) {
    			parent[i] = i;
    			rank[i] = 0;
    		}
    	}
    	
    	public boolean same(int x, int y) {
    		return root(x) == root(y);
    	}
    	
    	public void unite(int x, int y) {
    		int a = root(x);
    		int b = root(y);
    		
    		if (rank[a] < rank[b]) {
    			int tmp = a;
    			a = b;
    			b = tmp;
    		}
    		
    		parent[b] = a;
    		if (rank[a] == rank[b]) rank[a]++;
    	}
    	
    	public int root (int x) {
    		if (parent[x] != x) {
    			parent[x] = root(parent[x]);
    		}
    		return parent[x];
    	}
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int size) {
            long[] arr = new long[size];
            for (int i = 0; i < size; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
    }
}
