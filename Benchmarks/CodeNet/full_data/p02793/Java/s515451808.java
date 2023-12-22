import java.io.*;
import java.util.*;

class Solver {
  final int n;
  final int[] as;
  List<Integer> primes;
  ModCalculator mc;
  
  Solver(int n, int[] as) {
    this.n = n;
    this.as = as;
  }
  
  private boolean isPrime(int v) {
    for (int prime : primes) {
      if (v % prime == 0) {
        return false;
      }
      if (prime * prime > v) {
        return true;
      }
    }
    return true;
  }
  
  private Map<Integer, Integer> calculateFactors(int v) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int prime : primes) {
      int count = 0;
      while (v % prime == 0) {
        count++;
        v /= prime;
      }
      if (count > 0) {
        map.put(prime, count);
      }
      if (v == 1) {
        return map;
      }
    }
    if (v > 1) {
      map.put(v, 1);
    }
    return map;
  }
  
  public long solve() {
    primes = new ArrayList<>();
    for (int p = 2; p <= 1_000; p++) {
      if (isPrime(p)) {
        primes.add(p);
      }
    }
    
    Map<Integer, Integer> allFactorMap = new HashMap<>();
    
    mc = new ModCalculator(1_000_000_007L);
    List<Long> inverseList = new ArrayList<>();
    for (int a : as) {
      Map<Integer, Integer> factorMap = calculateFactors(a);
      long b = 1;
      for (Map.Entry<Integer, Integer> entry : factorMap.entrySet()) {
        int prime = entry.getKey();
        int count = entry.getValue();
        b = mc.div(b, mc.pow(prime, count));
        allFactorMap.put(prime, Math.max(count, allFactorMap.getOrDefault(prime, 0)));
      }
      inverseList.add(b);
    }
    
    long lcm = 1;
    for (Map.Entry<Integer, Integer> entry : allFactorMap.entrySet()) {
      lcm = mc.mul(lcm, mc.pow(entry.getKey(), entry.getValue()));
    }
    
    long answer = 0;
    for (long inverse : inverseList) {
      answer = mc.add(answer, mc.mul(lcm, inverse));
    }
    return answer;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    int[] as = reader.nextInt(n);
    out.println(new Solver(n, as).solve());
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
