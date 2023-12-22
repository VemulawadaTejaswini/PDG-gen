import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = sc.nextInt();
    sc.close();

    Set<Integer> set = new HashSet<>(N);
    for (int i = 0; i < N; i++) set.add(A[i]);

    String ans = set.size() == N ? "YES" : "NO";
    System.out.println(ans);
  }
}
