import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;


public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    char[][] map = new char[N][];
    for (int i = 0; i < N; i++) {
      map[i] = sc.next().toCharArray();
    }


    int ret = solve(map);
    System.out.println(ret);

//    int N =3;
//     char[][] map = new char[N][N];
//     while (true) {
//     for (int i = 0; i < N; i ++) {
//     for (int j = 0; j < N; j ++) {
//     map[i][j] = Math.random() < 0.5 ? '#' : '.';
//     }
//     }
//    
//     for (char[] line : map) {
//     System.out.println(line);
//     }
//     System.out.println();
//     if (solve(map) != solve2(map)) {
//     System.out.println("NG");
//     break;
//     }
//     }
  }


  public static int solve2(char[][] map) {
    int ret = dfs(map, 0);
    if (ret == Integer.MAX_VALUE) {
      return -1;
    }
    return ret;
  }

  public static int dfs(char[][] map, int depth) {
    if (depth >= 7) {
      return Integer.MAX_VALUE;
    }

    int N = map.length;
    boolean flg = true;
    loop: for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (map[i][j] == '.') {
          flg = false;
          break loop;
        }
      }
    }
    if (flg) {
      if (depth == 2) {
        return depth;
      }
      return depth;
    }

    int ret = Integer.MAX_VALUE;

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        char[] bak = new char[N];
        char[] to = new char[N];
        for (int k = 0; k < N; k++) {
          bak[k] = map[k][j];
          to[k] = map[i][k];
        }
        for (int k = 0; k < N; k++) {
          map[k][j] = to[k];
        }
        ret = Math.min(ret, dfs(map, depth + 1));
        for (int k = 0; k < N; k++) {
          map[k][j] = bak[k];
        }
      }
    }
    return ret;
  }

  public static int solve(char[][] map) {
    int N = map.length;
    boolean flg = false;
    loop: for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (map[i][j] == '#') {
          flg = true;
          break loop;
        }
      }
    }
    if (!flg) {
      return -1;
    }

    int[] colCount = new int[N];
    int[] rowCount = new int[N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (map[i][j] == '#') {
          colCount[j]++;
          rowCount[i]++;
        }
      }
    }

    int[] lineScore = new int[N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (map[i][j] == '.') {
          if (colCount[i] > 0) {
            lineScore[i]++;
          } else {
            lineScore[i] += 2;
            colCount[i] ++;
          }
        }
      }
    }

    int ret = Arrays.stream(lineScore).min().getAsInt();

    for (int i = 0; i < N; i++) {
      if (colCount[i] != N) {
        ret++;
      }
    }
    return ret;
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
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        ret[i][j] = nextLong();
      }
    }
    return ret;
  }

  public int[][] nextIntTable(int n, int m) {
    int[][] ret = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        ret[i][j] = nextInt();
      }
    }
    return ret;
  }
}
