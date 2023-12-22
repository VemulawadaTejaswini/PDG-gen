import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;


public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();

    long[] array = new long[1001];
    for (int i = 1; i <= N; i++) {
      array[i] = i;
    }

    int[] primes = sieveAtkin(10000);
    
    Map<Long, Long> map = new HashMap<>();
    for (int i = 1; i <= N; i ++) {
      long[][] factors = factorize(array[i], primes);
      
      for (long[] f : factors) {
        long now = !map.containsKey(f[0]) ? 0 : map.get(f[0]);
        map.put(f[0], now + f[1]);
      }
    }
    
    long mod = 1000000000 + 7;
    
    long ret = 1;
    for (Map.Entry<Long, Long> entry : map.entrySet()) {
      long p = entry.getValue();
      ret *= p + 1;
      ret %= mod;
    }
    System.out.println(ret);
  }

  public static long[][] factorize(long n, int[] primes) {
    int rp = (int) Math.sqrt(n + 1);
    long[][] factors = new long[100][2];
    int idx = 0;
    for (int i = 0; primes[i] <= rp; i++) {
      int p = primes[i];
      int count = 0;
      while (n % p == 0) {
        count++;
        n /= p;
      }
      if (count > 0) {
        factors[idx][0] = p;
        factors[idx][1] = count;
        idx++;
      }
      if (n == 1) {
        break;
      }
    }
    if (n != 1) {
      factors[idx][0] = n;
      factors[idx][1] = 1;
      idx++;
    }

    return Arrays.copyOf(factors, idx);
  }

  public static int[] sieveAtkin(int size) {
    boolean[] isPrime = new boolean[size + 1];
    int sqrtN = (int) Math.sqrt(size);
    int n;
    for (int x = 1; x <= sqrtN; ++x) {
      for (int y = 1; y <= sqrtN; ++y) {
        n = 4 * x * x + y * y;
        if (n <= size && (n % 12 == 1 || n % 12 == 5)) {
          isPrime[n] = !isPrime[n];
        }
        n = 3 * x * x + y * y;
        if (n <= size && n % 12 == 7) {
          isPrime[n] = !isPrime[n];
        }
        n = 3 * x * x - y * y;
        if (x > y && n <= size && n % 12 == 11) {
          isPrime[n] = !isPrime[n];
        }
      }
    }

    for (n = 5; n <= sqrtN; ++n) {
      if (isPrime[n]) {
        for (int k = n * n; k <= size; k += n * n) {
          isPrime[k] = false;
        }
      }
    }
    isPrime[2] = isPrime[3] = true;

    int[] ret = new int[size];
    int count = 0;
    for (int i = 1; i < size; i++) {
      if (isPrime[i]) {
        ret[count++] = i;
      }
    }
    return Arrays.copyOf(ret, count);
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
