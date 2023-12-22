import java.io.*;
import java.util.*;
 
 
public class Main implements Runnable {
 
  public static final int MOD = 998244353;

  public void run() {
    Scanner scanner = new Scanner(System.in);

    long n = scanner.nextLong();
    long a = scanner.nextLong(); 
    long b = scanner.nextLong(); 
    long k = scanner.nextLong();

    long[][] fact = calcFact((int)n + 1);
    long res = 0;
    for (int i = 0 ; i <= k / a && i <= n ; i ++) {
      if ((k - a * i) % b == 0) {
        long j = (k - a * i) / b;
        res += comb(fact, (int)n, (int)i) * comb(fact, (int)n, (int)j) % MOD;
        res %= MOD;
      }
    }

    System.out.println(res);
  }

  public long div(long a, long b) {
    return a * pow(b, MOD - 2) % MOD;
  }

  public long pow(long a, long b) {
    if (b == 0) {
      return 1;
    } else if (b % 2 == 0) {
      long d = pow(a, b / 2);
      return (d * d) % MOD;
    } else {
      long d = pow(a, b - 1);
      return (a * d) % MOD;
    }
  }

  public long[][] calcFact(int n) {
    long[] fact = new long[n];
    long[] invfact = new long[n];
    fact[0] = 1;
    for (int i = 1 ; i < n ; i ++) {
      fact[i] = (fact[i - 1] * i) % MOD;
    }
    invfact[n - 1] = pow(fact[n - 1], MOD - 2);
    for (int i = n - 2 ; i >= 0 ; i --) {
      invfact[i] = invfact[i + 1] * (i + 1) % MOD;
    }
    return new long[][]{fact, invfact};
  }

  public long comb(long[][] fact, int n, int r) {
    long res = fact[0][n];
    res *= fact[1][n - r];
    res %= MOD;
    res *= fact[1][r];
    res %= MOD;
    return res;
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.run();
  }
 
  // scanner slightly faster than usual ones
  public static class BetterScanner {
 
    private InputStream stream;
    private byte[] buffer = new byte[1024];
    private int pointer = 0;
    private int bufferLength = 0;
 
    public BetterScanner(InputStream stream) {
      this.stream = stream;
    }
 
    private boolean updateBuffer() {
      if (pointer >= bufferLength) {
        pointer = 0;
        try {
          bufferLength = stream.read(buffer);
        } catch (IOException exception) {
          exception.printStackTrace();
        }
        return bufferLength > 0;
      } else {
        return true;
      }
    }
 
    private int read() {
      if (updateBuffer()) {
        return buffer[pointer ++];
      } else {
        return -1;
      }
    }
 
    public boolean hasNext() {
      skipUnprintable();
      return updateBuffer();
    }
 
    private void skipUnprintable() { 
      while (updateBuffer() && !isPrintableChar(buffer[pointer])) {
        pointer ++;
      }
    }
 
    public String next() {
      if (hasNext()) {
        StringBuilder builder = new StringBuilder();
        int codePoint = read();
        while (isPrintableChar(codePoint)) {
          builder.appendCodePoint(codePoint);
          codePoint = read();
        }
        return builder.toString();
      } else {
        throw new NoSuchElementException();
      }
    }
 
    public long nextLong() {
      if (hasNext()) {
        long number = 0;
        boolean minus = false;
        int codePoint = read();
        if (codePoint == '-') {
          minus = true;
          codePoint = read();
        }
        if (codePoint >= '0' && codePoint <= '9') {
          while (true) {
            if (codePoint >= '0' && codePoint <= '9') {
              number *= 10;
              number += codePoint - '0';
            } else if (codePoint < 0 || !isPrintableChar(codePoint)) {
              return (minus) ? -number : number;
            } else {
              throw new NumberFormatException();
            }
            codePoint = read();
          }
        } else {
          throw new NumberFormatException();
        }
      } else {
        throw new NoSuchElementException();
      }
    }
 
    public int nextInt() {
      long number = nextLong();
      if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
        return (int)number;
      } else {
        throw new NumberFormatException();
      }
    }
 
    private boolean isPrintableChar(int codePoint) {
      return codePoint >= 33 && codePoint <= 126;
    }
 
  }
 
}
