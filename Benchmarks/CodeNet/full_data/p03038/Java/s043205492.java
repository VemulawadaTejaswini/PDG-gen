import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    
    TreeMap<Integer, Long> map = new TreeMap<>(Comparator.reverseOrder());
    for (int i = 0; i < M; i++) {
      int B = sc.nextInt();
      int C = sc.nextInt();
      map.put(C, map.getOrDefault(C,0L)+B);
    }
    
    long ans = 0;
    Iterator<Map.Entry<Integer, Long>> itr = map.entrySet().iterator();
    int i = N-1;
    int left = 0;
    while (i >= left && itr.hasNext()) {
      Map.Entry<Integer, Long> entry = itr.next();
      int val = entry.getKey();
      long count = entry.getValue();
      while (i >= left && val <= A[i]) {
        ans += A[i];
        i--;
      }
      if (i >= 0 && val > A[i]) {
        long len = Math.min((long) i-left+1, count);
        ans += val*len;
        left += len;
      }
    }
    
    System.out.println(ans);
  }
}

