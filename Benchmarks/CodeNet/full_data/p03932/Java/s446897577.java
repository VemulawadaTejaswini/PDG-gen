import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;


public class Main {
  private static int H;
  private static int W;
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    H = sc.nextInt();
    W = sc.nextInt();
    
    int[][] map = new int[H][W];
    for (int i = 0; i < H; i ++) {
      for (int j = 0; j < W;j ++) {
        map[i][j] = sc.nextInt();
      }
    }
    

    System.out.println(solve2(map));
  }
  
  
  private static long solve2(int[][] map) {
    long[][] from = new long[W][W];
    long[][] to = new long[W][W];
    
    from[0][0] = map[0][0];
    for (int i = 1; i < H + W - 1; i ++) {
      int xMin = Math.max(0, i - (W - 1));
      int xMax = Math.min(W - 1, i);

      for (int x1 = xMin; x1 <= xMax; x1 ++) {
        int y1 = i - x1;
        
        
        for (int x2 = xMin; x2 <= xMax; x2 ++) {
          int y2 = i - x2;
          
          
          long now = x1 == x2 ? map[y1][x1] : (map[y1][x1] + map[y2][x2]);
          to[x1][x2] = from[x1][x2];
          if (x2 > 0) {
            to[x1][x2] = Math.max(to[x1][x2], from[x1][x2 - 1]);
          }
          if (x1 > 0) {
            to[x1][x2] = Math.max(to[x1][x2], from[x1 - 1][x2]);
          }
          if (x1 > 0 && x2 > 0) {
            to[x1][x2] = Math.max(to[x1][x2], from[x1 - 1][x2 - 1]);
          }
          to[x1][x2] += now;
        }
      }
      long[][] tmp = from;
      from = to;
      to = tmp;
    }
    return from[W - 1][W - 1];
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