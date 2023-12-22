import java.io.*;
import java.util.*;

class ContestReader {
  private BufferedReader reader;
  private StringTokenizer tokenizer;
  
  ContestReader(InputStream in) {
    reader = new BufferedReader(new InputStreamReader(in));
  }
  
  public String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }
  
  public int nextInt() {
    return Integer.parseInt(next());
  }
  
  public long nextLong() {
    return Long.parseLong(next());
  }
  
  public double nextDouble() {
    return Double.parseDouble(next());
  }
}

class Solver {
  private static int[] DI = new int[]{1, 0, -1, 0};
  private static int[] DJ = new int[]{0, 1, 0, -1};
  
  private int pack(int i, int j) {
    return (i << 12) | j;
  }
  
  private int getI(int position) {
    return position >> 12;
  }
  
  private int getJ(int position) {
    return position & 0xFFF;
  }
  
  public int solve(int h, int w, char[][] map) {
    HashSet<Integer> currentBlack = new HashSet<Integer>();
    HashSet<Integer> totalBlack = new HashSet<Integer>();
    
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        if (map[i][j] == '#') {
          int position = pack(i, j);
          currentBlack.add(position);
          totalBlack.add(position);
        }
      }
    }
    
    int operation = 0;
    while (true) {
//      System.err.println(currentBlack.size());
      HashSet<Integer> newBlack = new HashSet<Integer>();
      for (int position : currentBlack) {
        int i = getI(position);
        int j = getJ(position);
//        System.err.printf("%d %d\n", i, j);
        for (int k = 0; k < DI.length; k++) {
          int nextI = i + DI[k];
          int nextJ = j + DJ[k];
//        System.err.printf("%d %d\n", nextI, nextJ);
          if (nextI < 0 || nextJ < 0 || nextI >= h || nextJ >= w) {
//            System.err.println("out");
            continue;
          }
          int nextPosition = pack(nextI, nextJ);
          if (totalBlack.contains(nextPosition)) {
//            System.err.println("exist");
            continue;
          }
          totalBlack.add(nextPosition);
          newBlack.add(nextPosition);
        }
      }
      if (newBlack.size() == 0) {
        return operation;
      }
      currentBlack = newBlack;
      operation++;
    }
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int h = reader.nextInt();
    int w = reader.nextInt();
    char[][] map = new char[h][];
    for (int i = 0; i < h; i++) {
      map[i] = reader.next().toCharArray();
    }
    
    out.println(new Solver().solve(h, w, map));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

