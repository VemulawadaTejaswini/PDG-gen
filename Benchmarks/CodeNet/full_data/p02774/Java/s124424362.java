import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long[] A = new long[N];
    for (int i = 0; i < N; i++) A[i] = sc.nextLong();
    sc.close();
    
    List<Long> list = new ArrayList<>();
    for (int i = 0; i < N - 1; i++)
      for (int j = i + 1; j < N; j++)
        list.add(Long.valueOf(A[i] * A[j]));
	Collections.sort(list);
    
    long ans = list.get(K - 1);
    System.out.println(ans);
  }
}