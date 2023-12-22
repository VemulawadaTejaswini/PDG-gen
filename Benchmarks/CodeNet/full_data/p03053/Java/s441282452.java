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
  
  private int pack(int numOp, int i, int j) {
    return (numOp << 20) | (i << 10) | j;
  }
  
  private int getI(int position) {
    return (position >> 10) & 0x3FF;
  }
  
  private int getJ(int position) {
    return position & 0x3FF;
  }
  
  private int getNumOp(int position) {
    return position >> 20;
  }
   
  public int solve(int h, int w, char[][] map) {
    /*
    HashSet<Integer> currentBlack = new HashSet<Integer>();
    HashSet<Integer> totalBlack = new HashSet<Integer>();
    */
    boolean[] visited = new boolean[1 << 20];
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        if (map[i][j] == '#') {
          int position = pack(0, i, j);
          queue.add(position);
          visited[position & 0xFFFFF] = true;
        }
      }
    }
    
    int operation = 0;
    int numOp = 0;
    
    while (!queue.isEmpty()) {
      int position = queue.poll();
      numOp = getNumOp(position);
      int i = getI(position);
      int j = getJ(position);
      int nextNumOp = numOp + 1;
      for (int k = 0; k < DI.length; k++) {
        int nextI = i + DI[k];
        int nextJ = j + DJ[k];
        if (nextI < 0 || nextJ < 0 || nextI >= h || nextJ >= w) {
          continue;
        }
        int nextPosition = pack(nextNumOp, nextI, nextJ);
        if (visited[nextPosition & 0xFFFFF]) {
          continue;
        }
        visited[nextPosition & 0xFFFFF] = true;
        queue.addLast(nextPosition);
      }
    }
    return numOp;
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

