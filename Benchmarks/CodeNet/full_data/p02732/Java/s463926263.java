import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      Map<Integer, Integer> freqMap = new HashMap<>();
      int[] balls = new int[n];
      for(int i = 0; i < n; i++) {
        balls[i] = sc.nextInt();
        freqMap.put(balls[i], freqMap.getOrDefault(balls[i], 0) + 1);
      }

      long cnt = 0;
      for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
        if(entry.getValue() < 2) continue;
        cnt += comb(entry.getValue());
      }

      for(int k = 0; k < n; k++) {
        int num = balls[k];
        int freq = freqMap.get(num);
        if(freq < 2) System.out.println(cnt);
        else {
          int removeCnt = comb(freq);
          int newCnt = comb(freq-1);
          System.out.println(cnt - removeCnt + newCnt);
        }
      }
  }

  private static int comb(int a) {
    if(a < 2) return 0;
    return a * (a - 1) / 2;
  }
}