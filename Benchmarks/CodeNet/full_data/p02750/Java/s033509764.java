import java.io.*;
import java.util.*;

class Store implements Comparable<Store> {
  final long a, b;

  Store(long a, long b) {
    this.a = a;
    this.b = b;
  }

  // ai * t + bi + aj * (t + ai * t + bi + 1) + bj
  // - (aj * t + bj + ai * (t + aj * t + bj + 1) + bi) < 0
  // ai * t + bi + aj * t + aj * ai * t + aj * bi + aj + bj
  // - (aj * t + bj + ai * t + ai *aj * t + ai *bj + ai + bi) < 0
  // ai * t + bi + aj * t + aj * ai * t + aj * bi + aj + bj
  // - aj * t - bj - ai * t - ai *aj * t - ai * bj - ai - bi < 0
  //      0 +  0 +      0 +           0 + aj * bi + aj +  0
  // -      0 -  0 -      0 -          0 - ai * bj - ai -  0 < 0
  // aj * bi + aj - ai * bj - ai < 0
  // aj * (bi + 1) - ai * (bj + 1) < 0
  public int compareTo(Store store) {
    long v = store.a * (this.b + 1) - this.a * (store.b + 1);
    if (v > 0) {
      return 1;
    } else if (v < 0) {
      return -1;
    } else {
      return 0;
    }
  }

  public long calculateBuyTime(long time) {
    return time + 1 + a * (time + 1) + b;
  }
}

class Solver {
  final int n;
  final long t;
  final long[][] abs;

  Solver(int n, long t, long[][] abs) {
    this.n = n;
    this.t = t;
    this.abs = abs;
  }

  public int solve() {
    List<Long> storeWithZeroAList = new ArrayList<>();
    List<Store> storeWithPositiveAList = new ArrayList<>();
    for (long[] ab : abs) {
      long a = ab[0];
      long b = ab[1];
      if (a > 0) {
        storeWithPositiveAList.add(new Store(a, b));
      } else {
        storeWithZeroAList.add(b);
      }
    }

    Collections.sort(storeWithPositiveAList);
    List<Long> dp = new ArrayList<>();
    dp.add(0L);
    for (Store store : storeWithPositiveAList) {
      long lastTime = dp.get(dp.size() - 1);
      long nextLastTime = store.calculateBuyTime(lastTime);
      if (nextLastTime <= t) {
        dp.add(nextLastTime);
      }
      for (int i = dp.size() - 1; i > 0; i--) {
        long otherTime = store.calculateBuyTime(dp.get(i - 1));
        if (dp.get(i) > otherTime) {
          dp.set(i, otherTime);
        }
      }
    }

    int answer = dp.size() - 1;
    Collections.sort(storeWithZeroAList);
    long sum = 0;
    for (int i = 0; i < storeWithZeroAList.size(); i++) {
      sum += storeWithZeroAList.get(i) + 1;
      for (int j = 0; j < dp.size() && sum + dp.get(j) <= t; j++) {
        answer = Math.max(answer, i + 1 + j);
      }
    }

    return answer;
  }

}

public class Main {
  private static void execute(ContestReader reader, ContestWriter out) {
    int n = reader.nextInt();
    long t = reader.nextLong();
    long[][] abs = reader.nextLong(n, 2);
    out.println(new Solver(n, t, abs).solve());
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    ContestWriter out = new ContestWriter(System.out);
    execute(reader, out);
    out.flush();
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
