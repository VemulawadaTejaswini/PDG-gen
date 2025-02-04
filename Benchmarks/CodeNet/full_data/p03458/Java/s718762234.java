import java.io.*;
import java.util.*;
 
 
public class Main implements Runnable {
 
  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int[] xx = new int[n];
    int[] yy = new int[n];
    for (int i = 0 ; i < n ; i ++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      String c = scanner.next();
      if (c.equals("B")) {
        x += k;
      }
      x %= 2 * k;
      y %= 2 * k;
      if (x >= k && y >= k) {
        x -= k;
        y -= k;
      } else if (y >= k) {
        x += k;
        y -= k;
      }
      xx[i] = x;
      yy[i] = y;
    }

    int max = 0;
    for (int xDiff = 0 ; xDiff < k ; xDiff ++) {
      for (int yDiff = 0 ; yDiff < k ; yDiff ++) {
        int satisfied = 0;
        for (int i = 0 ; i < n ; i ++) {
          int x = xx[i] + xDiff;
          int y = yy[i] + yDiff;
          if (x >= 2 * k) {
            if (y >= k) {
              x -= k;
              y -= k;
            } else {
              x -= 2 * k;
            }
          } else if (y >= k) {
            if (x >= k) {
              x -= k;
              y -= k;
            } else {
              x += k;
              y -= k;
            }
          }
          if (x < k) {
            satisfied ++;
          }
        }
        if (satisfied > max) {
          max = satisfied;
        }
        if (n - satisfied > max) {
          max = n - satisfied;
        }
      }
    }
    System.out.println(max);
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