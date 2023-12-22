import java.io.*;
import java.util.*;

class Solver {
  final int k;
  int[] upperBoundDigits;
  int[][][][] cache;

  Solver(int k) {
    this.k = k;
  }

  private int bToInt(boolean b) {
    return b ? 1 : 0;
  }

  private int calculate(int prevDigit, 
      int digitIndex, 
      boolean mightExceed, 
      boolean isLeadingZero) {
    if (digitIndex >= 10) {
      return 1;
    }
    int mightExceedIndex = bToInt(mightExceed);
    int isLeadingZeroIndex = bToInt(isLeadingZero);
    if (cache[prevDigit][digitIndex][mightExceedIndex][isLeadingZeroIndex] >= 0) {
      return cache[prevDigit][digitIndex][mightExceedIndex][isLeadingZeroIndex];
    }
    cache[prevDigit][digitIndex][mightExceedIndex][isLeadingZeroIndex] = 0;
    int start;
    int end;
    if (isLeadingZero) {
      start = 0;
      end = 9;
    } else {
      start = Math.max(prevDigit - 1, 0);
      end = Math.min(prevDigit + 1, 9);
    }

    for (int nextDigit = start; nextDigit <= end; nextDigit++) {
      if (mightExceed && nextDigit > upperBoundDigits[digitIndex]) {
        break;
      }
      cache[prevDigit][digitIndex][mightExceedIndex][isLeadingZeroIndex] +=
          calculate(
              nextDigit, 
              digitIndex + 1,
              mightExceed && nextDigit == upperBoundDigits[digitIndex],
              isLeadingZero && nextDigit == 0);
    }
//    System.err.printf("%d %d %d %d %d\n", prevDigit, digitIndex, mightExceedIndex, isLeadingZeroIndex, cache[prevDigit][digitIndex][mightExceedIndex][isLeadingZeroIndex]);
    return cache[prevDigit][digitIndex][mightExceedIndex][isLeadingZeroIndex];
  }

  private int count(long upperBound) {
    upperBoundDigits = new int[10];
    long temp = upperBound;
    for (int i = 0; i < 10; i++) {
      upperBoundDigits[9 - i] = (int)(temp % 10);
      temp /= 10; 
    }

    int sum = 0;
    cache = new int[10][10][2][2];
    for (int[][][] v1 : cache) {
      for (int[][] v2 : v1) {
        for (int[] v3 : v2) {
          Arrays.fill(v3, -1);
        }
      }
    }
    return calculate(0, 0, true, true) - 1;
  }

  public long solve() {
    long max = 4_999_999_999L;
    long min = 0;
    while (max - min > 1) {
      long mid = (max + min) / 2;
      int c = count(mid);
//      System.err.printf("%d %d\n", mid, c);
      if (c >= k) {
        max = mid;
      } else {
        min = mid;
      }
    }
    return max;
  }
}

public class Main {
  private static void execute(ContestReader reader, ContestWriter out) {
    int k = reader.nextInt();
    out.println(new Solver(k).solve());
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
