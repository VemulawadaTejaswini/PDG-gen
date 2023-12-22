import java.io.*;
import java.util.*;
 
 
public class Main implements Runnable {
 
  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
 
    int[] l = new int[m];
    int[] r = new int[m];
    int[] d = new int[m];
 
    for (int j = 0 ; j < m ; j ++) {
      l[j] = scanner.nextInt();
      r[j] = scanner.nextInt();
      d[j] = scanner.nextInt();
    }
 
    boolean[] visited = new boolean[n + 1];
    boolean[] determined = new boolean[n + 1];
    int[] x = new int[n + 1];
 
    while (true) {
      int first = 0;
      for (int i = 1 ; i <= n ; i ++) {
        if (!visited[i]) {
          first = i;
          break;
        }
      }
      if (first == 0) {
        System.out.println("Yes");
        return;
      }
      IntQueue queue = new IntQueue(n);
      visited[first] = true;
      determined[first] = true;
      x[first] = 0;
      queue.offer(first);
      while (!queue.isEmpty()) {
        int u = queue.poll();
        for (int j = 0 ; j < m ; j ++) {
          int v, e;
          if (l[j] == u) {
            v = r[j];
            e = d[j];
          } else if (r[j] == u) {
            v = l[j];
            e = -d[j];
          } else {
            continue;
          }
          if (!determined[v]) {
            determined[v] = true;
            x[v] = x[u] + e;
          } else if (x[v] != x[u] + e) {
            System.out.println("No");
            return;
          }
          if (!visited[v]) {
            queue.offer(v);
            visited[v] = true;
          }
        }
      }
    }
 
  }
 
  public static void main(String[] args) {
    Main main = new Main();
    main.run();
  }

  // lightweight queue for int
  public static class IntQueue {

    private int[] array;
    private int head, tail;

    public IntQueue(int max) {
      array = new int[max];
    }

    public void offer(int x) {
      array[tail ++] = x;
    }

    public int poll() {
      return array[head ++];
    }
    
    public boolean isEmpty() {
      return head == tail;
    }

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