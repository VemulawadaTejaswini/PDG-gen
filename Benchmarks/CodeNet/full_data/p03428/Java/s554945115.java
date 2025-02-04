import java.io.*;
import java.util.*;
 
 
public class Main implements Runnable {
 
  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);
  
    int n = scanner.nextInt();
    int[] xx = new int[n];
    int[] yy = new int[n];

    int a = 0;
    int minY = 10000000;
    int minX = 10000000;
    for (int i = 0 ; i < n ; i ++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      xx[i] = x;
      yy[i] = y;
      if (y <= minY) {
        minY = y;
        if (y < minY) {
          minX = 10000000;
        }
        if (y == minY && x < minX) {
          minX = x;
          a = i;
        }
      }
    }
    List<Integer> hulls = new ArrayList(n);
    int b, c;
    do {
      hulls.add(a);
      b = 0;
      for (int i = 1 ; i < n ; i ++) {
        c = i;
        if (b == a) {
          b = c;
        } else {
          long v = (long)(xx[a] - xx[b]) * (yy[a] - yy[c]) - (long)(xx[a] - xx[c]) * (yy[a] - yy[b]);
          long ab = (long)(xx[a] - xx[b]) * (xx[a] - xx[b]) + (long)(yy[a] - yy[b]) * (yy[a] - yy[b]);
          long ac = (long)(xx[a] - xx[c]) * (xx[a] - xx[c]) + (long)(yy[a] - yy[c]) * (yy[a] - yy[c]);
          if (v > 0L || (v == 0L && ac > ab)) {
            b = c;
          }
        }
      }
      a = b;
    } while (a != hulls.get(0));

    int m = hulls.size();
    Collections.reverse(hulls);

    double[] props = new double[n];
    for (int k = 0 ; k < m ; k ++) {
      int i = hulls.get(k);
      int nextI = (k < m - 1) ? hulls.get(k + 1) : hulls.get(0);
      int previousI = (k >= 1) ? hulls.get(k - 1) : hulls.get(m - 1);
      double nextTan = Math.atan2(yy[i] - yy[nextI], xx[i] - xx[nextI]) + Math.PI / 2;
      double previousTan = Math.atan2(yy[previousI] - yy[i], xx[previousI] - xx[i]) + Math.PI / 2;
      if (nextTan > Math.PI) {
        nextTan -= 2 * Math.PI;
      }
      if (previousTan > Math.PI) {
        previousTan -= 2 * Math.PI;
      }
      double range = nextTan - previousTan;
      if (range < 0) {
        range += 2 * Math.PI;
      }
      props[i] = range / (2 * Math.PI);
    }

    for (int i = 0 ; i < n ; i ++) {
      System.out.println(props[i]);
    }
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