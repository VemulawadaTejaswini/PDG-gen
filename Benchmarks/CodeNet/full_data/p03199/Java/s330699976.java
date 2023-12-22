import java.io.*;
import java.util.*;

class Solver {
  private final ModCalculator mc = new ModCalculator(998244353L);
  final int n, m;
  final int[][] abcs;
  List<Map<Integer, Integer>> matrix;
  
  Solver(int n, int m, int[][] abcs) {
    this.n = n;
    this.m = m;
    this.abcs = abcs;
  }
  
  Integer get(int a, int b) {
    return matrix.get(a).get(b);
  }
  
  public long solve2() {
    int[] counts = new int[2];
    for (int[] abc : abcs) {
      int c = abc[2];
      counts[c]++;
    }
    int rest = 4 - counts[0] - counts[1];
    
    long answer = 0;
    for (int i = 0; i <= rest; i++) {
      if ((counts[1] + i) % 2 == 1) {
        continue;
      }
      answer += mc.getC(rest, i);
    }
    return answer;
  }
  
  private int countEven(Integer v1, Integer v2) {
    if (v1 == null && v2 == null) {
      return 2;
    }
    if (v1 == null || v2 == null || v1.equals(v2)) {
      return 1;
    }
    return 0;
  }
  
  private int countOdd(Integer v1, Integer v2) {
    if (v1 == null && v2 == null) {
      return 2;
    }
    if (v1 == null || v2 == null || !v1.equals(v2)) {
      return 1;
    }
    return 0;
  }
  
  public long solve() {
    if (n == 2) {
      return solve2();
    }
    
    matrix = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      matrix.add(new HashMap<>());
    }
    
    for (int[] abc : abcs) {
      int a = abc[0];
      int b = abc[1];
      int c = abc[2];
      matrix.get(a).put(b, c);
    }
    
    
    
    long[][] dptable = new long[n + 1][2];
    
    int[][] inputStartMatrix = new int[4][4];
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        Integer v = get(i, j);
        if (v != null) {
          inputStartMatrix[i][j] = v;
        } else {
          inputStartMatrix[i][j] = -1;
        }
      }
    }
    
    for (int k = 0; k < (1 << 9); k++) {
      int[][] startMatrix = new int[4][4];
      int sum = 0;
      boolean match = true;
      for (int i = 1; i <= 3; i++) {
        for (int j = 1; j <= 3; j++) {
          int shift = 3 * (i - 1) + (j - 1);
          startMatrix[i][j] = (k >> shift) & 1;
          if (startMatrix[i][j] != inputStartMatrix[i][j] && inputStartMatrix[i][j] != -1) {
            match = false;
          }
          sum += startMatrix[i][j];
        }
      }
      
      /*
      for (int i = 1; i <= 3; i++) {
        for (int j = 1; j <= 3; j++) {
          System.err.print(startMatrix[i][j]);
        }
        System.err.println();
      }
      */
//      System.err.printf("%s, %d\n", match, sum);
      if (!match || sum % 2 == 1) {
//        System.err.println("Skip: 1");
        continue;
      }
      if ((startMatrix[1][1] + startMatrix[1][2] + startMatrix[2][1] + startMatrix[2][2]) % 2 == 1) {
//        System.err.println("Skip: 2");
        continue;
      }
      if ((startMatrix[2][2] + startMatrix[2][3] + startMatrix[3][2] + startMatrix[3][3]) % 2 == 1) {
//        System.err.println("Skip: 3");
        continue;
      }
//      System.err.println("Count");
      dptable[3][startMatrix[3][3]]++;
    }
    
    for (int i = 4; i <= n; i++) {
      Integer centerValue = get(i, i);
      Integer vA1 = get(i, i - 2);
      Integer vA2 = get(i - 2, i);
      Integer vB1 = get(i, i - 1);
      Integer vB2 = get(i - 1, i);
      
      if (centerValue == null || centerValue.equals(1)) {
        //   x
        //  1x
        // xx1
        long v1 = mc.mul(dptable[i-1][1], countOdd(vA1, vA2) * countEven(vB1, vB2));
        
        //   x
        //  0x
        // xx1
        long v2 = mc.mul(dptable[i-1][0], countEven(vA1, vA2) * countOdd(vB1, vB2));
        dptable[i][1] = mc.add(v1, v2);
      }
      if (centerValue == null || centerValue.equals(0)) {
        //   x
        //  1x
        // xx0
        long v1 = mc.mul(dptable[i-1][1], countOdd(vA1, vA2) * countOdd(vB1, vB2));
        
        //   x
        //  0x
        // xx0
        long v2 = mc.mul(dptable[i-1][0], countEven(vA1, vA2) * countEven(vB1, vB2));
        dptable[i][0] = mc.add(v1, v2);
      }
      
//      System.err.printf("%d: %d, %d\n", i, dptable[i][0], dptable[i][1]);
    }
    long longN = n;
    long answer = mc.add(dptable[n][0], dptable[n][1]);
    if (n >= 4) {
      long countFilledHalf = 0;
      long countFilledBoth = 0;
      for (int i = 1; i <= n; i++) {
        for (Map.Entry<Integer, Integer> entry : matrix.get(i).entrySet()) {
          int j = entry.getKey();
          if (Math.abs(i - j) <= 2) {
            continue;
          }
          
          Integer v1 = entry.getValue();
          Integer v2 = get(j, i);
          if (v2 != null && !v1.equals(v2)) {
            return 0;
          }
          if (v2 == null) {
            countFilledHalf++;
          } else {
            countFilledBoth++;
          }
        }
      }
      
      long countFilled = countFilledHalf + countFilledBoth / 2;
      long factor = mc.pow(2, (longN - 2) * (longN - 3) / 2 - countFilled);
      answer = mc.mul(answer, factor);
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int m = reader.nextInt();
    int[][] abcs = reader.nextInt(m, 3);
    out.println(new Solver(n, m, abcs).solve());
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

class ModCalculator {
  private final long mod;
  private final ModCombinationCache modCombinationCache;
  
  ModCalculator(long mod) {
    this.mod = mod;
    this.modCombinationCache = new ModCombinationCache();
  }
  
  public long add(long a, long b) {
    return (a + b) % mod;
  }
  
  public long sub(long a, long b) {
    return (a - b + mod) % mod;
  }
  
  public long mul(long a, long b) {
    return (a * b) % mod;
  }
  
  public long pow(long a, long b) {
    if (b == 0) {
      return 1;
    }
    long v = pow(mul(a, a), b / 2);
    if (b % 2 == 1) {
      return mul(v, a);
    } else {
      return v;
    }
  }
  
  public long inverse(long a) {
    return pow(a, mod - 2);
  }
  
  public long div(long a, long b) {
    return mul(a, inverse(b));
  }
  
  public long getF(int n) {
    return modCombinationCache.getF(n);
  }
  
  public long getP(int n, int r) {
    return modCombinationCache.getP(n, r);
  }
  
  public long getC(int n, int k) {
    return modCombinationCache.getC(n, k);
  }
  
  class ModCombinationCache {
    private final List<Long> factorialCache;
    private final List<Long> factorialInverseCache;
    
    public ModCombinationCache() {
      factorialCache = new ArrayList<>();
      factorialCache.add(1L);
      factorialInverseCache = new ArrayList<>();
      factorialInverseCache.add(1L);
    }
    
    private void resize(int n) {
      for (int i = factorialCache.size() - 1; i < n; i++) {
        long v = mul(factorialCache.get(i), i + 1);
        factorialCache.add(v);
        factorialInverseCache.add(inverse(v));
      }
    }
    
    long getF(int n) {
      resize(n);
      return factorialCache.get(n);
    }
    
    long getP(int n, int r) {
      resize(n);
      return mul(factorialCache.get(n), factorialInverseCache.get(n - r));
    }
    
    long getC(int n, int k) {
      resize(n);
      return mul(factorialCache.get(n), mul(factorialInverseCache.get(k), factorialInverseCache.get(n-k)));
    }
  }
}
