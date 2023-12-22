import java.io.*;
import java.util.*;

class UpdateSingleGetRangeIntSegmentTree {
  interface Operator {
    int update(int originalValue, int argumentValue);
    int merge(int smallValue, int largeValue);
    int getUnitValue();
  }
  
  private final Operator operator;
  private final int n;
  private final int[] values;
  
  UpdateSingleGetRangeIntSegmentTree(Operator operator, int[] initialValues) {
    this.operator = operator;
    
    int tempN = 1;
    while (tempN < initialValues.length) {
      tempN *= 2;
    }
    n = tempN;
    values = new int[tempN * 2 - 1];
    for (int i = 0; i < initialValues.length; i++) {
      values[i + n - 1] = initialValues[i];
    }
    for (int i = initialValues.length; i < n; i++) {
      values[i + n - 1] = this.operator.getUnitValue();
    }
    
    for (int i = n - 2; i >= 0; i--) {
      values[i] = this.operator.merge(values[2 * i + 1], values[2 * i + 2]);
    }
  }
  
  public void update(int index, int argumentValue) {
    index += n - 1;
    values[index] = operator.update(values[index], argumentValue);
    while (index > 0) {
      index = (index - 1) / 2;
      values[index] = this.operator.merge(values[2 * index + 1], values[2 * index + 2]);
    }
  }
  
  private int getRange(int a, int b, int k, int l, int r) {
    if (r <= a || b <= l) {
      return operator.getUnitValue();
    }
    if (a <= l && r <= b) {
      return values[k];
    }
    int vl = getRange(a, b, 2 * k + 1, l, (l + r) / 2);
    int vr = getRange(a, b, 2 * k + 2, (l + r) / 2, r);
    return operator.merge(vl, vr);
  }
  
  public int getRange(int a, int b) {
    return getRange(a, b, 0, 0, n);
  }
}

class Solver {
  final int n, q;
  final char[] cs;
  final String[][] queries;
  
  Solver(int n, char[] cs, int q, String[][] queries) {
    this.n = n;
    this.cs = cs;
    this.q = q;
    this.queries = queries;
  }
  
  public List<Integer> solve() {
    UpdateSingleGetRangeIntSegmentTree.Operator operator = new UpdateSingleGetRangeIntSegmentTree.Operator() {
      public int update(int originalValue, int argumentValue) {
        return originalValue + argumentValue;
      }
      public int merge(int smallValue, int largeValue) {
        return smallValue + largeValue;
      }
      public int getUnitValue() {
        return 0;
      }
    };
    List<UpdateSingleGetRangeIntSegmentTree> segmentTrees = new ArrayList<>();
    for (int i = 0; i < 26; i++) {
      int[] values = new int[n];
      for (int j = 0; j < n; j++) {
        values[j] = (cs[j] == 'a' + i) ? 1 : 0;
      }
      segmentTrees.add(new UpdateSingleGetRangeIntSegmentTree(operator, values));
    }
    
    List<Integer> answers = new ArrayList<>();
    for (String[] query : queries) {
      if ("1".equals(query[0])) {
        int i = Integer.parseInt(query[1]);
        char c = query[2].charAt(0);
        for (int k = 0; k < 26; k++) {
          if (segmentTrees.get(k).getRange(i - 1, i) > 0) {
            segmentTrees.get(k).update(i - 1, -1);
            break;
          }
        }
        segmentTrees.get(c - 'a').update(i - 1, 1);
      } else if ("2".equals(query[0])) {
        int l = Integer.parseInt(query[1]);
        int r = Integer.parseInt(query[2]);
        int answer = 0;
        for (int i = 0; i < 26; i++) {
          if (segmentTrees.get(i).getRange(l - 1, r) > 0) {
//            System.err.printf("%d %d %d\n", l, r + 1, i);
            answer++;
          }
        }
        answers.add(answer);
      } else {
        throw new RuntimeException();
      }
    }
    return answers;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    char[] cs = reader.nextCharArray();
    int q = reader.nextInt();
    String[][] queries = reader.next(q, 3);
    for (int answer : new Solver(n, cs, q, queries).solve()) {
      out.println(answer);
    }
  }
  
  public static void main(String[] args) {
    ContestReader reader = new ContestReader(System.in);
    PrintWriter out = new PrintWriter(System.out);
    execute(reader, out);
    out.flush();
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
