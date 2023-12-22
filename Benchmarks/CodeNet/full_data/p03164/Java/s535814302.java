import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int maxWeight = scan.nextInt();
    
    int[] weights = new int[n];
    int[] values = new int[n];
    
    for (int i = 0; i < n; i++) {
      weights[i] = scan.nextInt();
      values[i] = scan.nextInt();
    }
    scan.close();

    long result = solve(n, weights, values, maxWeight);
    System.out.println(result);
  }
  
  private final static int MAX_VALUE = 100*1000;
  
  private static long solve(int N, int[] weights, int[] values, int maxWeight){
    long[] minWeight = new long[MAX_VALUE + 1];
    Arrays.fill(minWeight, Long.MAX_VALUE);
    minWeight[0] = 0;

    for (int k = 0; k < N; k++) {
      for (int val = MAX_VALUE - values[k]; value >= 0; value--) {
        if (minWeight[val] == Long.MAX_VALUE) {
          continue;
        }

        int newValue = val + values[k];
        long newWeight = minWeight[val] + weights[k];
        long currentMinWeight = minWeight[newValue];

        if (newWeight < currentMinWeight) {
          minWeight[newValue] = newWeight;
        }
      }
    }

    for (int value = MAX_VALUE; value > 0; value--) {
      if (minWeight[value] <= maxWeight) return value;
    }

    return 0;
  }
}