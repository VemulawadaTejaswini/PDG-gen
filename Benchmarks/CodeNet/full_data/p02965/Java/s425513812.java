import java.io.*;
import java.util.*;

public class Main {
  private static long solve(int n, int m) {
    ModCalculator mc = new ModCalculator(998244353);
    long answer = 0;
    for (int numOnePair = 0; numOnePair <= m / 2; numOnePair++) {
      int numTwo = m + numOnePair;
      int numOne = m - 2 * numOnePair;
      if (n - 1 >= numOne && n - 2 >= 0) {
        long numPatternWithTwoM = mc.mul(n, mc.getC(numTwo - m + n - 2, n - 2));
        long v = mc.mul(numPatternWithTwoM, mc.getC(n - 1, numOne));
        answer = mc.add(answer, v);
      }
      if (n >= numOne) {
        long v1 = mc.getC(numTwo + n - 1, n - 1);
        long v2 = mc.mul(n, mc.getC(numTwo - m + n - 1, n - 1));
        long numPatternWithoutTwoM = mc.sub(v1, v2);
        long v = mc.mul(numPatternWithoutTwoM, mc.getC(n, numOne));
        answer = mc.add(answer, v);
      }
    }
    return answer;
  }

  private static void execute(ContestReader reader, ContestWriter out) {
    /*
    ModCalculator mc = new ModCalculator(998244353);
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j <= i; j++) {
        System.err.printf("%d %d %d\n", i, j, mc.getC(i, j));
      }
    }
    */
    int n = reader.nextInt();
    int m = reader.nextInt();
    out.println(solve(n, m));
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    ContestWriter out = new ContestWriter(System.out);
    execute(reader, out);
    out.flush();
  }
}

class ModCalculator {
  private final long mod;
  private final ModCombinationCache modCombinationCache;
  
  ModCalculator(long mod) {
    this.mod = mod;
    this.modCombinationCache = new ModCombinationCache();
  }
  
  public long norm(long v) {
    return v % mod;
  }
  
  public long add(long a, long b) {
    return norm(a + b);
  }
  
  public long sub(long a, long b) {
    return norm(a - b + mod);
  }
  
  public long mul(long a, long b) {
    return norm(a * b);
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

  // Verify ARC 042 D
  // https://atcoder.jp/contests/arc042/tasks/arc042_d
  // a^x mod p === b
  // return -1 there is no such positive x
  public long log(long a, long b) {
    Map<Long, Long> map = new HashMap<>();
    long powA = 1;
    long rootP = 0;
    while (true) {
      if (powA == b && rootP != 0) {
        return rootP;
      }
      if (map.containsKey(powA)) {
        return -1;
      }
      map.put(powA, rootP);
      powA = mul(powA, a);
      rootP++;
      if (rootP * rootP > mod) {
        break;
      }
    }
    long inversePowA = inverse(powA);
    for (int i = 1; i <= rootP; i++) {
      b = mul(b, inversePowA);
      Long value = map.get(b);
      if (value != null && value + rootP * i > 0) {
        return value + rootP * i;
      }
    }
    return -1;
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
    /*
    private final List<Long> factorialCache;
    private final List<Long> factorialInverseCache;
    */
    long[] factorialCache;
    long[] factorialInverseCache;
    
    public ModCombinationCache() {
      factorialCache = new long[]{1};
      factorialInverseCache = new long[]{1};
    }
    
    private void resize(int newSize) {
      long[] nextFactorialCache = new long[newSize];
      long[] nextFactorialInverseCache = new long[newSize];
      System.arraycopy(factorialCache, 0, nextFactorialCache, 0, factorialCache.length);
      System.arraycopy(factorialInverseCache, 0, nextFactorialInverseCache, 0, factorialInverseCache.length);
      for (int i = factorialCache.length; i < newSize; i++) {
        long v = mul(nextFactorialCache[i - 1], i);
//        System.err.printf("%d %d\n", i, v);
        nextFactorialCache[i] = v;
        nextFactorialInverseCache[i] = inverse(v);
      }
      factorialCache = nextFactorialCache;
      factorialInverseCache = nextFactorialInverseCache;
    }

    private void resizeIfNeeded(int requestIndex) {
      if (requestIndex < factorialCache.length) {
        return;
      }
      int newSize = factorialCache.length;
      while (requestIndex >= newSize) {
        newSize *= 2;
      }
      resize(newSize);
    }
    
    long getF(int n) {
      resizeIfNeeded(n);
      return factorialCache[n];
    }
    
    long getP(int n, int r) {
      resizeIfNeeded(n);
      return mul(factorialCache[n], factorialInverseCache[n - r]);
    }
    
    long getC(int n, int k) {
      resizeIfNeeded(n);
//      System.err.printf("%d %d %d %d %d\n", n, k, factorialCache[n], factorialInverseCache[k], factorialInverseCache[n-k]);
      return mul(factorialCache[n], mul(factorialInverseCache[k], factorialInverseCache[n-k]));
    }
  }
}

class ContestWriter extends PrintWriter {
  ContestWriter(PrintStream printeStream) {
    super(printeStream);
  }

  public void printList(List<? extends Object> list) {
    for (Object object : list) {
      println(object);
    }
  }

  public void printListOneLine(List<? extends Object> list) {
    List<String> stringList = new ArrayList<>();
    for (Object object : list) {
      stringList.add(object.toString());
    }
    println(String.join(" ", stringList));
  }
}

class ContestReader {
  private static final int BUFFER_SIZE = 1024;
  
  private final InputStream stream;
  private final byte[] buffer;
  private int pointer;
  private int bufferLength;
  
  ContestReader(InputStream stream) {
    this.stream = stream;
    this.buffer = new byte[BUFFER_SIZE];
    this.pointer = 0;
    this.bufferLength = 0;
  }
  
  private boolean hasNextByte() {
    if (pointer < bufferLength) {
      return true;
    }
    
    pointer = 0;
    try {
      bufferLength = stream.read(buffer);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return bufferLength > 0;
  }
  
  private int readByte() {
    if (hasNextByte()) {
      return buffer[pointer++];
    } else {
      return -1;
    }
  }
  
  private static boolean isPrintableChar(int c) {
    return 33 <= c && c <= 126;
  }
  
  public boolean hasNext() {
    while (hasNextByte() && !isPrintableChar(buffer[pointer])) {
      pointer++;
    }
    return hasNextByte();
  }
  
  public String next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    StringBuilder sb = new StringBuilder();
    while(true) {
      int b = readByte();
      if (!isPrintableChar(b)) {
        break;
      }
      sb.appendCodePoint(b);
    }
    return sb.toString();
  }
  
  public String nextLine() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    StringBuilder sb = new StringBuilder();
    while(true) {
      int b = readByte();
      if (!isPrintableChar(b) && b != 0x20) {
        break;
      }
      sb.appendCodePoint(b);
    }
    return sb.toString();
  }
  
  public char nextChar() {
    return next().charAt(0);
  }
  
  public int nextInt() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    
    int n = 0;
    boolean minus = false;
    
    {
      int b = readByte();
      if (b == '-') {
        minus = true;
      } else if ('0' <= b && b <= '9') {
        n = b - '0';
      } else {
        throw new NumberFormatException();
      }
    }
    
    while(true){
      int b = readByte();
      if ('0' <= b && b <= '9') {
        n *= 10;
        n += b - '0';
      } else if (b == -1 || !isPrintableChar(b)) {
        return minus ? -n : n;
      } else {
        throw new NumberFormatException();
      }
    }
  }
  
  public long nextLong() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    
    long n = 0;
    boolean minus = false;
    
    {
      int b = readByte();
      if (b == '-') {
        minus = true;
      } else if ('0' <= b && b <= '9') {
        n = b - '0';
      } else {
        throw new NumberFormatException();
      }
    }
    
    while(true){
      int b = readByte();
      if ('0' <= b && b <= '9') {
        n *= 10;
        n += b - '0';
      } else if (b == -1 || !isPrintableChar(b)) {
        return minus ? -n : n;
      } else {
        throw new NumberFormatException();
      }
    }
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
  
  public String[] nextLine(int n) {
    String[] array = new String[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLine();
    }
    return array;
  }
  
  public char[] nextChar(int n) {
    char[] array = new char[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextChar();
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
  
  public String[][] next(int n, int m) {
    String[][] matrix = new String[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = next();
      }
    }
    return matrix;
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
  
  public char[][] nextChar(int n, int m) {
    char[][] matrix = new char[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextChar();
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
