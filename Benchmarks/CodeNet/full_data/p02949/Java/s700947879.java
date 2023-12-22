import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.util.Arrays;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		int N = reader.nextInt();
		int M = reader.nextInt();
		int P = reader.nextInt();
		Edge[] edges = new Edge[M];
		for (int i=0; i<M; i++) {
		    Edge e = new Edge(reader.nextInt()-1, reader.nextInt()-1, P-reader.nextInt());
		    edges[i] = e;
		}
		solver(N, M, edges);
	}
	
	public static void solver(int N, int M, Edge[] edges) {
		// write logic
		int ans = bellmanford(N, edges, 0, N-1);
		if (ans == Integer.MIN_VALUE) System.out.println(-1);
		else if (ans > 0) System.out.println(0);
		else System.out.println(-ans);
	}
	
	// Read Class
	static class FS {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;
		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}
	
		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	
		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public int nextInt() {
			return (int)nextLong();
		}
		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
	
    static int bellmanford(int n, Edge[] edges, int s, int g) {
	    int[] distance = new int[n];
        int[] count    = new int[n];
        
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[s] = 0;
        boolean negative = false;
        boolean update = true;
        
        while (update && !negative) {
            update = false;
            for (Edge e : edges) {
                if (distance[e.source] != Integer.MAX_VALUE && distance[e.source] + e.cost < distance[e.target]) {
                    distance[e.target] = distance[e.source] + e.cost;
                    update = true;
                    
                    if (++count[e.target] >= n) {
                        negative = true;
                        break;
                    }
                }
            }
        }
        
        if (negative) {
            // check end score stable or not
            int tmp = distance[g];
            for (Edge e : edges) {
                if (distance[e.source] != Integer.MAX_VALUE && distance[e.source] + e.cost < distance[e.target]) {
                    distance[e.target] = distance[e.source] + e.cost;
                    update = true;
                    
                    if (++count[e.target] >= n) {
                        negative = true;
                        break;
                    }
                }
            }
            if (tmp != distance[g]) return Integer.MIN_VALUE;
            else return distance[g];
        }
        else return distance[g];
    }

	static class Edge {
	    public int source = 0;
	    public int target = 0;
	    public int cost   = 0;
	    
	    public Edge(int source, int target, int cost) {
	        this.source = source;
	        this.target = target;
	        this.cost   = cost;
	    }
	    
	    public int compareTo(Edge e) {
	        return this.cost - e.cost;
	    }
	}
}
