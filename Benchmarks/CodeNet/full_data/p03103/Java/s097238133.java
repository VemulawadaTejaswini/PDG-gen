import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int A[] = new int[N];
    int B[] = new int[N];
    Map<Integer, Integer> mMap = new HashMap<Integer, Integer>();
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
      mMap.put(A[i], B[i]);
    }
    int sum = 0;
    int ans = 0;
    Object[] mapkey = mMap.keySet().toArray();
    Arrays.sort(mapkey);
    for (Integer nKey : mMap.keySet()) {
      if (mMap.get(nKey) <= M) {
        ans += nKey * mMap.get(nKey);
        M -= mMap.get(nKey);
      } else {
        ans += nKey * M;
        M -= M;
      }
      if (M == 0) {
        System.out.println(ans);
        return;
      }

    }
  }
}