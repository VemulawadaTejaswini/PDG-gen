import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main{
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	static int ROW;
	static int COL;
	static int [][] field;
	static final int[] dx = {0,1,0,-1};
	static final int[] dy = {-1,0,1,0};
	static int max_d;
	static int max_x;
	static int max_y;
	
	public static void main(String[] args) {
		ROW = sc.nextInt();
		COL = sc.nextInt();
		char [][] map = new char[ROW][COL];
		field = new int [ROW][COL];
		
		for (int i=0; i<ROW; i++) 
			map[i]=sc.next().toCharArray();

		int ans = 0;
		for (int i=0; i<ROW; i++) {
			for (int j=0; j<COL; j++) {
				if (map[i][j]=='.') {
					Point start = new Point (i, j);
					BFS(map, start);
					int cur = max_d;
					ans = Math.max(cur, ans);
				}
			}
		}

		out.println(ans);
		out.flush();
		
	}
		
		static boolean isValid(int row, int col) { 
			return (row >= 0) && (row < ROW) && 
				(col >= 0) && (col < COL); 
		} 

		static class Point { 
			int x; 
			int y; 

			public Point(int x, int y) { 
				this.x = x; 
				this.y = y; 
			} 
		}
		
		static class queueNode { 
			Point pt; 
			int dist; 

			public queueNode(Point pt, int dist) { 
				this.pt = pt; 
				this.dist = dist; 
			} 
		}
		
		static void BFS(char map[][], Point src) { 
		 
			boolean [][] visited = new boolean[ROW][COL]; 
			visited[src.x][src.y] = true; 
			field [src.x][src.y] = 0; 

			Queue<queueNode> q = new LinkedList<>(); 

			queueNode s = new queueNode(src, 0); 
			q.add(s); 
			
			max_d=0;

			while (!q.isEmpty()) { 
				queueNode curr = q.peek(); 
				Point pt = curr.pt; 

				q.remove(); 

				for (int i = 0; i < 4; i++) { 
					int row = pt.x + dx[i]; 
					int col = pt.y + dy[i]; 

					if (isValid(row, col) && map[row][col] == '.' && !visited[row][col]) { 
						visited[row][col] = true; 	
						field [row][col] = field [row-dx[i]][col-dy[i]]+1;
						curr.dist++;
						if (curr.dist>max_d) {
							max_x = row;
							max_y = col;
							max_d = curr.dist;
						}
						queueNode Adjcell = new queueNode(new Point(row, col), curr.dist); 
						q.add(Adjcell); 
					} 
				} 
			}
		} 
	
		static class FastScanner {
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

		    private int readByte() {
		      if (hasNextByte()) return buffer[ptr++];
		      else return -1;
		    }

		    private static boolean isPrintableChar(int c) {
		      return 33 <= c && c <= 126;
		    }

		    private void skipUnprintable() {
		      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		    }

		    public boolean hasNext() {
		      skipUnprintable();
		      return hasNextByte();
		    }

		    public String next() {
		      if (!hasNext()) throw new NoSuchElementException();
		      StringBuilder sb = new StringBuilder();
		      int b = readByte();
		      while (isPrintableChar(b)) {
		        sb.appendCodePoint(b);
		        b = readByte();
		      }
		      return sb.toString();
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

		    public int[] nextIntArray(int N, boolean oneBased) {
		      if (oneBased) {
		        int[] array = new int[N + 1];
		        for (int i = 1; i <= N; i++) {
		          array[i] = sc.nextInt();
		        }
		        return array;
		      } else {
		        int[] array = new int[N];
		        for (int i = 0; i < N; i++) {
		          array[i] = sc.nextInt();
		        }
		        return array;
		      }
		    }

		    public long[] nextLongArray(int N, boolean oneBased) {
		      if (oneBased) {
		        long[] array = new long[N + 1];
		        for (int i = 1; i <= N; i++) {
		          array[i] = sc.nextLong();
		        }
		        return array;
		      } else {
		        long[] array = new long[N];
		        for (int i = 0; i < N; i++) {
		          array[i] = sc.nextLong();
		        }
		        return array;
		      }
		    }
		  }

		}	 



