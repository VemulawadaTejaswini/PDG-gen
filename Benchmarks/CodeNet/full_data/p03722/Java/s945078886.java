import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    Graph g = new Graph(N);
    for (int i = 0; i < M; i ++) {
      int from = sc.nextInt() - 1;
      int to = sc.nextInt() - 1;
      long cost = -sc.nextLong();
      g.add(from, to, cost);
    }
    
    long[] ret = bellmanFord(g, 0);
    if (ret == null) {
      System.out.println("inf");
    } else {
      System.out.println(-ret[N - 1]);
    }
    
  }

  public static long[] bellmanFord(Graph graph, int start) {
    long INF = Long.MAX_VALUE / 3;
    int n = graph.size();
    long[] dist = new long[n];
    for (int i = 0; i < n; i++) {
        dist[i] = INF;
    }
    dist[start] = 0;

    for (int i = 0; i < n; i++) {
        for (int v = 0; v < n; v++) {
            for (Graph.Path edge : graph.get(v)) {
                if (dist[v] != INF && dist[edge.to] > dist[v] + edge.cost) {
                    dist[edge.to] = dist[v] + edge.cost;
                    if (i == n - 1) {
                        return null;
                    }
                }
            }
        }
    }
    return dist;
}
      
}
class Graph {
  public static class Path implements Comparable<Path> {
      public final int from;
      public final int to;
      public final long cost;

      public Path(int from, int to, long cost) {
          this.from = from;
          this.to = to;
          this.cost = cost;
      }

      @Override
      public int compareTo(Path o) {
          return Long.compare(this.cost, o.cost);
      }
  }
  
  private final List<List<Path>> edgeList;
  private final int size;

  public Graph(int n) {
      this.size = n;
      this.edgeList = new ArrayList<List<Path>>();
      for (int i = 0; i < n; i ++) {
          this.edgeList.add(new ArrayList<Path>());
      }
  }

  public void add(int from, int to, long cost) {
      this.edgeList.get(from).add(new Path(from ,to, cost));
  }
  
  public void addBoth(int v1, int v2, long cost) {
      this.add(v1, v2, cost);
      this.add(v2, v1, cost);
  }

  public void add(int from, int to) {
      this.edgeList.get(from).add(new Path(from ,to, 1));
  }
  
  public void addBoth(int v1, int v2) {
      this.add(v1, v2, 1);
      this.add(v2, v1, 1);
  }

  public List<Path> get(int from) {
      return this.edgeList.get(from);
  }
  
  public int size() {
      return this.size;
  }
}



class FastScanner {
	public static String debug = null;

	private final InputStream in = System.in;
	private int ptr = 0;
	private int buflen = 0;
	private byte[] buffer = new byte[1024];
	private boolean eos = false;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				if (debug != null) {
					buflen = debug.length();
					buffer = debug.getBytes();
					debug = "";
					eos = true;
				} else {
					buflen = in.read(buffer);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen < 0) {
				eos = true;
				return false;
			} else if (buflen == 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean isEOS() {
		return this.eos;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		return (int) nextLong();
	}

	public long[] nextLongList(int n) {
		return nextLongTable(1, n)[0];
	}

	public int[] nextIntList(int n) {
		return nextIntTable(1, n)[0];
	}

	public long[][] nextLongTable(int n, int m) {
		long[][] ret = new long[n][m];
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				ret[i][j] = nextLong();
			}
		}
		return ret;
	}

	public int[][] nextIntTable(int n, int m) {
		int[][] ret = new int[n][m];
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < m; j ++) {
				ret[i][j] = nextInt();
			}
		}
		return ret;
	}
}