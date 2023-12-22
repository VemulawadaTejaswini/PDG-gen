import java.io.*;
import java.util.*;

class Solver {
  int n;
  double[] xs;
  double[] ys;
  String[] ds;
  
  double[] xds;
  double[] yds;
  
  public Solver(int n, double[] xs, double[] ys, String[] ds) {
    this.n = n;
    this.xs = xs;
    this.ys = ys;
    this.ds = ds;
  }
  
  public double solve() {
    xds = new double[n];
    yds = new double[n];
    
    for (int i = 0; i < n; i++) {
      switch(ds[i].charAt(0)) {
        case 'R':
          xds[i] = 1;
          yds[i] = 0;
          break;
        case 'L':
          xds[i] = -1;
          yds[i] = 0;
          break;
        case 'U':
          xds[i] = 0;
          yds[i] = 1;
          break;
        case 'D':
          xds[i] = 0;
          yds[i] = -1;
          break;
      }
    }
    
    List<Double> allHitTimes = new ArrayList<>();
    allHitTimes.add(0.0);
    
    allHitTimes.addAll(findMaxPointDirectionChangeTime(xs, xds));
    
    allHitTimes.addAll(findMaxPointDirectionChangeTime(ys, yds));
    
    inverse(xs, xds);
    allHitTimes.addAll(findMaxPointDirectionChangeTime(xs, xds));
    inverse(xs, xds);
    
    inverse(ys, yds);
    allHitTimes.addAll(findMaxPointDirectionChangeTime(ys, yds));
    inverse(ys, yds);
    
    Collections.sort(allHitTimes);
    double areaMin = solveTimeAt(allHitTimes.get(allHitTimes.size() - 1));
    for (int i = 1; i < allHitTimes.size(); i++) {
      areaMin = Math.min(areaMin, solveTimeRange(allHitTimes.get(i-1), allHitTimes.get(i)));
    }
    return areaMin;
  }
  
  private int findMaxPointIndex(double t, double[] zs, double[] zds) {
    double zMax = zs[0] + zds[0] * t;
    int zMaxIndex = 0;
    for (int i = 1; i < n; i++) {
      double z = zs[i] + zds[i] * t;
      if (zMax < z) {
        zMax = z;
        zMaxIndex = i;
      }
    }
    return zMaxIndex;
  }
  
  private double findMaxPoint(double t, double[] zs, double[] zds) {
    int index = findMaxPointIndex(t, zs, zds);
    return zs[index] + t * zds[index];
  }
  
  void inverse(double[] zs, double[] zds) {
    for (int i = 0; i < n; i++) {
      zs[i] *= -1.0;
      zds[i] *= -1.0;
    }
  }

  private int findMinPointIndex(double t, double[] zs, double[] zds) {
    inverse(zs, zds);
    int minIndex = findMaxPointIndex(t, zs, zds);
    inverse(zs, zds);
    return minIndex;
  }
  
  private double findMinPoint(double t, double[] zs, double[] zds) {
    inverse(zs, zds);
    double maxPoint = -1.0 * findMaxPoint(t, zs, zds);
    inverse(zs, zds);
    return maxPoint;
  }

  
  private double solveTimeRange(double timeMin, double timeMax) {
    double timeMid = 0.5 * (timeMin + timeMax);
    
    int xMinIndex = findMinPointIndex(timeMid, xs, xds);
    int xMaxIndex = findMaxPointIndex(timeMid, xs, xds);
    int yMinIndex = findMinPointIndex(timeMid, ys, yds);
    int yMaxIndex = findMaxPointIndex(timeMid, ys, yds);
    
    double w = xs[xMaxIndex] - xs[xMinIndex];
    double wd = xds[xMaxIndex] - xds[xMinIndex];
    double h = ys[yMaxIndex] - ys[yMinIndex];
    double hd = yds[yMaxIndex] - yds[yMinIndex];
    
    // Min (w + wd * t) * (h + hd * t)
    double a = wd * hd;
    double b = wd * h + hd * w;
    double c = w * h;
    return calculateMin(a, b, c, timeMin, timeMax);
  }
  
  private double calculate(double a, double b, double c, double x) {
    return a * x * x + b * x + c;
  }
  
  private double calculateMin(double a, double b, double c, double xMin, double xMax) {
    if (a == 0 && b == 0) {
      return c;
    }
    if (a == 0 && b > 0) {
      return calculate(a, b, c, xMin);
    }
    if (a == 0 && b < 0) {
      return calculate(a, b, c, xMax);
    }
    double answer = calculate(a, b, c, xMin);
    answer = Math.min(answer, calculate(a, b, c, xMax));
    
    double xAxis = -0.5 * b / a;
    if (xMin <= xAxis && xAxis <= xMax) {
      answer = Math.min(answer, calculate(a, b, c, xAxis));
    }
    return answer;
  }
  
  private double solveTimeAt(double time) {
    double xMax = findMaxPoint(time, xs, xds);
    double xMin = findMinPoint(time, xs, xds);
    double yMax = findMaxPoint(time, ys, yds);
    double yMin = findMinPoint(time, ys, yds);
    return (xMax - xMin) * (yMax - yMin);
  }
  
  private double hitTime(double[] zs, double[] zds, int i, int j) {
    if (zds[i] == zds[j]) {
      return -1.0;
    }
    return -1.0 * (zs[i] - zs[j]) / (zds[i] - zds[j]);
  }
  
  private List<Double> findMaxPointDirectionChangeTime(double[] zs, double[] zds) {
    List<Double> hitTimes = new ArrayList<>();
    int maxPointIndexTimeZero = findMaxPointIndex(0.0, zs, zds);
    if (zds[maxPointIndexTimeZero] > 0) {
      return hitTimes;
    }
    
    double firstHitTime = Double.MAX_VALUE;
    int firstHitIndex = 0;
    for (int i = 0; i < n; i++) {
      double t = hitTime(zs, zds, maxPointIndexTimeZero, i);
      if (0.0 <= t && t < firstHitTime) {
        firstHitTime = t;
        firstHitIndex = i;
      }
    }
    
    if (firstHitTime == Double.MAX_VALUE) {
      return hitTimes;
    }
    
    hitTimes.add(firstHitTime);
    if (zds[firstHitIndex] > 0) {
      return hitTimes;
    }
    
    double secondHitTime = Double.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      double t = hitTime(zs, zds, firstHitIndex, i);
      if (firstHitTime <= t && t < secondHitTime) {
        secondHitTime = t;
      }
    }
    
    if (secondHitTime == Double.MAX_VALUE) {
      return hitTimes;
    }
    
    hitTimes.add(secondHitTime);
    return hitTimes;
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    double[] xs = new double[n];
    double[] ys = new double[n];
    String[] ds = new String[n];
    for (int i = 0; i < n; i++) {
      xs[i] = reader.nextLong();
      ys[i] = reader.nextLong();
      ds[i] = reader.next();
    }
    out.printf("%.20f\n", new Solver(n, xs, ys, ds).solve());
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
  
  public int[] nextIntArray(int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextInt();
    }
    return array;
  }
  
  public long[] nextLongArray(int n) {
    long[] array = new long[n];
    for (int i = 0; i < n; i++) {
      array[i] = nextLong();
    }
    return array;
  }
  
  public int[][] nextIntMatrix(int n, int m) {
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
  
  public long[][] nextLongMatrix(int n, int m) {
    long[][] matrix = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = nextInt();
      }
    }
    return matrix;
  }
}

class Algorithm {
  private static void swap(Object[] list, int a, int b) {
    Object tmp = list[a];
    list[a] = list[b];
    list[b] = tmp;
  }
  
  public static <T extends Comparable<? super T>> boolean nextPermutation(T[] ts) {
    int rightMostAscendingOrderIndex = ts.length - 2;
    while (rightMostAscendingOrderIndex >= 0 &&
        ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostAscendingOrderIndex + 1]) >= 0) {
      rightMostAscendingOrderIndex--;
    }
    if (rightMostAscendingOrderIndex < 0) {
      return false;
    }
    
    int rightMostGreatorIndex = ts.length - 1;
    while (ts[rightMostAscendingOrderIndex].compareTo(ts[rightMostGreatorIndex]) >= 0) {
      rightMostGreatorIndex--;
    }
    
    swap(ts, rightMostAscendingOrderIndex, rightMostGreatorIndex);
    for (int i = 0; i < (ts.length - rightMostAscendingOrderIndex - 1) / 2; i++) {
      swap(ts, rightMostAscendingOrderIndex + 1 + i, ts.length - 1 - i);
    }
    return true;
  }
  
  public static void shuffle(int[] array) {
    Random random = new Random();
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int randomIndex = i + random.nextInt(n - i);
      
      int temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }
  }
  
  public static void shuffle(long[] array) {
    Random random = new Random();
    int n = array.length;
    for (int i = 0; i < n; i++) {
      int randomIndex = i + random.nextInt(n - i);
      
      long temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
    }
  }
  
  public static void sort(int[] array) {
    shuffle(array);
    Arrays.sort(array);
  }
  
  public static void sort(long[] array) {
    shuffle(array);
    Arrays.sort(array);
  }
}

