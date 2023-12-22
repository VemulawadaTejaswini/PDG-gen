import java.util.*;

public class Main {
  private static final long MOD_CONST = 1000000007;
  
  private static long mul(long a, long b) {
    return (a * b) % MOD_CONST;
  }
  
  private static long add(long a, long b) {
    return (a + b) % MOD_CONST;
  }
  
  
  private static ArrayList<Integer> runLengthCompression(ArrayList<Integer> rawInput) {
    ArrayList<Integer> compressedInput = new ArrayList<Integer>();
    
    int prevInput = 0;
    for (int input : rawInput) {
      if (input != prevInput) {
        compressedInput.add(input);
        prevInput = input;
      }
    }
    return compressedInput;
  }
  
  private static long solve(ArrayList<Integer> rawInput) {
    ArrayList<Integer> compressedInput = runLengthCompression(rawInput);
    /*
    for (int c : compressedInput) {
      System.out.print(c);
      System.out.print(", ");
    }
    System.out.println();
    */
    
    long[] dptable = new long[compressedInput.size() + 1];
    Map<Integer, Integer> lastShownIndexMap = new HashMap<Integer, Integer>();
    
    dptable[0] = 1;
    for (int i = 0; i < compressedInput.size(); i++) {
      int color = compressedInput.get(i);
      if (lastShownIndexMap.get(color) != null) {
        dptable[i+1] = add(dptable[i], dptable[lastShownIndexMap.get(color) + 1]);
      } else {
        dptable[i+1] = dptable[i];
      }
      lastShownIndexMap.put(color, i);
    }
    
    return dptable[compressedInput.size()];
  }
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int n = s.nextInt();
    ArrayList<Integer> rawInput = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      rawInput.add(s.nextInt());
    }
    
    System.out.println(solve(rawInput));
  }
}
