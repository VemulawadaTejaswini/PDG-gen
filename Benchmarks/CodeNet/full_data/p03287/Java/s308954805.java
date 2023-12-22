import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] prefixSum = new int[n];
      prefixSum[0] = sc.nextInt() % m;
      for(int i = 1; i < n; i++)
        prefixSum[i] = (sc.nextInt() + prefixSum[i-1]) % m;

      Map<Integer, Integer> remainderCnt = new HashMap<>();
      remainderCnt.put(0, 1);
      int cnt = 0;
      for(int r : prefixSum) {
        if(remainderCnt.containsKey(r)) {
          cnt += remainderCnt.get(r);
          remainderCnt.put(r, remainderCnt.get(r) + 1);
        } else 
          remainderCnt.put(r, 1);
      }
      System.out.println(cnt);
  }
}