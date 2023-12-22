import java.io.*;
import java.util.*;

public class Main {
  private static long M = 998244353L;
  
  private static long mul(long a, long b) {
    return (a * b) % M;
  }
  
  private static long solve(int n, String s) {
    char[] cs = s.toCharArray();
    
    long answer = 1;
    for (int i = 1; i <= n; i++) {
      answer = mul(answer, i);
    }
    
    long countR = 0;
    long countG = 0;
    long countB = 0;
    long countRG = 0;
    long countGB = 0;
    long countBR = 0;
    for (char c : cs) {
//      System.out.printf("%d %d %d %d %d %d\n", countR, countG, countB, countRG, countGB, countBR);
      switch (c) {
        case 'R':
          if (countGB > 0) {
            answer = mul(answer, countGB);
            countGB--;
          } else if (countG > 0) {
            answer = mul(answer, countG);
            countG--;
            countRG++;
          } else if (countB > 0) {
            answer = mul(answer, countB);
            countB--;
            countBR++;
          } else {
            countR++;
          }
          break;
        case 'G':
          if (countBR > 0) {
            answer = mul(answer, countBR);
            countBR--;
          } else if (countB > 0) {
            answer = mul(answer, countB);
            countB--;
            countGB++;
          } else if (countR > 0) {
            answer = mul(answer, countR);
            countR--;
            countRG++;
          } else {
            countG++;
          }
          break;
        case 'B':
          if (countRG > 0) {
            answer = mul(answer, countRG);
            countRG--;
          } else if (countR > 0) {
            answer = mul(answer, countR);
            countR--;
            countBR++;
          } else if (countG > 0) {
            answer = mul(answer, countG);
            countG--;
            countGB++;
          } else {
            countB++;
          }
          break;
      }
    }
    return answer;
  }
  
  private static void execute(ContestReader reader, PrintWriter out) {
    int n = reader.nextInt();
    String s = reader.next();
    out.println(solve(n, s));
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

