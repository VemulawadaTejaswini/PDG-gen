import java.io.*;
import java.util.*;

class Solver {
  private String original;
  
  private boolean validate(String str) {
    if (original.compareTo(str) >= 0) {
      return false;
    }
    
    char[] list = str.toCharArray();
    Arrays.sort(list);
    for (int i = 1; i < list.length; i++) {
      if (list[i] == list[i-1]) {
        return false;
      }
    }
    return true;
  }
  
  public String solve(String original) {
    this.original = original;
    ArrayList<String> candidates = new ArrayList<>();
    
    for (int i = 0; i <= original.length(); i++) {
      String sub = original.substring(0, i);
      for (int j = 0; j < 26; j++) {
        String candidate = sub + (char)('a' + j);
        if (validate(candidate)) {
          candidates.add(candidate);
          break;
        }
      }
    }
    
    Character[] characters = new Character[original.length()];
    for (int i = 0; i < original.length(); i++) {
      characters[i] = original.charAt(i);
    }
    if (Algorithm.nextPermutation(characters)) {
      char[] chars = new char[characters.length];
      for (int i = 0; i < characters.length; i++) {
        chars[i] = characters[i];
      }
      candidates.add(new String(chars));
    }
    
    Collections.sort(candidates);
    if (candidates.size() == 0) {
      return "-1";
    }
    return candidates.get(0);
  }
}

public class Main {
  private static void execute(ContestReader reader, PrintWriter out) {
    out.println(new Solver().solve(reader.next()));
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
}

