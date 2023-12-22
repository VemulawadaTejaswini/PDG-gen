import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    long M = scanner.nextLong();
    long[] A = new long[N + 1];
    for (int i = 0; i < N; i++){
      A[i] = scanner.nextInt();
    }
    long[] sum = new long[N];
    sum[0] = A[0] % M;

    for (int i = 1; i < N + 1; i++){
      sum[i] = sum[i - 1] + A[i];
    }

    Map<Long, Long> map = new HashMap<>();
    for (int i = 0; i < A.length; i++){
      map.put(sum[i] % M , map.getOrDefault(sum[i], 0l) + 1);
    }
    long result = 0;
    for (long key : map.keySet()){
      long num = map.get(key);
      result += num * (num - 1) / 2;
    }
    System.out.println(result);
  }
}
