import java.io.*;
import java.util.*;

public class Main {
  private static TreeMap<Integer, Integer> createMap(int[] vs) {
    TreeMap<Integer, Integer> map = new TreeMap<>();
    for (int v : vs) {
      map.put(v, map.getOrDefault(v, 0) + 1);
    }
    return map;
  }
  
  private static long solve(int n, int[] as, int[] bs, int[] cs) {
    TreeMap<Integer, Integer> aCountMap = createMap(as);
    TreeMap<Integer, Integer> cCountMap = createMap(cs);
    
    long aTotal = 0;
    TreeMap<Integer, Long> aTotalCountMap = new TreeMap<>();
    aTotalCountMap.put(0, 0L);
    for (Map.Entry<Integer, Integer> entry : aCountMap.entrySet()) {
      aTotal += entry.getValue();
      aTotalCountMap.put(entry.getKey(), aTotal);
    }
    
    long cTotal = 0;
    TreeMap<Integer, Long> cTotalCountMap = new TreeMap<>();
    cTotalCountMap.put(Integer.MAX_VALUE, 0L);
    for (Map.Entry<Integer, Integer> entry : cCountMap.descendingMap().entrySet()) {
      cTotal += entry.getValue();
      cTotalCountMap.put(entry.getKey(), cTotal);
    }
    
    long answer = 0;
    for (int b : bs) {
      answer += aTotalCountMap.lowerEntry(b).getValue() * cTotalCountMap.higherEntry(b).getValue();
    }
    return answer;
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[] as = reader.nextInt(n);
    int[] bs = reader.nextInt(n);
    int[] cs = reader.nextInt(n);
    out.println(solve(n, as, bs, cs));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

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
  
  public String[] next(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = next();
    }
    return array;
  }
  
  public int[] nextInt(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLong(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
  
  public double[] nextDouble(int n) {
    double[] array = new double[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextDouble();
    }
    return array;
  }
  
  public char[] nextCharArray() {
    return next().toCharArray();
  }
  
  public int[][] nextInt(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public long[][] nextLong(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextLong();
      }
    }
    return matrix;
  }
  
  public double[][] nextDouble(int n, int m) {
    double[][] matrix = new double[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextDouble();
      }
    }
    return matrix;
  }
  
  public char[][] nextCharArray(int n) {
    char[][] matrix = new char[n][];
    for (int i = 0; i < n; i++) {
      matrix[i] = next().toCharArray();
    }
    return matrix;
  }
}
