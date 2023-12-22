import java.util.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    int N;
    List<Integer> vList = new ArrayList<>();
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      for(int i = 0; i < N; i++) {
        vList.add(sc.nextInt());
      }
    }
    Collections.sort(vList);
    int[] v = new int[N];
    for(int i = 0; i < N; i++) {
      v[i] = vList.get(i);
    }
    double answer = solve(v);
    System.out.println(answer);
  }
  
  private static double solve(int[] v) {
    int n = v.length;
    if ( n == 2 ) {
      return ((double)v[0]+(double)v[1])/2;
    }
    int[] v0 = new int[n-1];
    System.arraycopy(v, 0, v0, 0, n-1);
    return (solve(v0)+(double)v[n-1])/2;
  }

}