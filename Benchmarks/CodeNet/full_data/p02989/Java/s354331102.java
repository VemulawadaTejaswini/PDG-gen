import java.util.*;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    int N = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    int K = 0;
    for (int i=0; i<N; i++) {
      int n = sc.nextInt();
      list.add(n);
      K = Math.max(K,n);
    }
    Collections.sort(list);
    int ans = 0;
    
    for (int k=0; k<=K; k++) {
      if (list.get(N/2) >= k && list.get(N/2-1) < k)
        ans++;    
    }
    
    System.out.println(ans);
    
  }
}