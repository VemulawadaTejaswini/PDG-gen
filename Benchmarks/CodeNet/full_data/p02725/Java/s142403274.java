import java.util.*;
import java.io.BufferedInputStream;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner (new BufferedInputStream(System.in));
    int k = sc.nextInt();
    int n = sc.nextInt();
    int res = 0;
    int[] num = new int[n];
    for(int i = 0; i < n; ++i) {
      num[i] = sc.nextInt();
    }
    Arrays.sort(num);
    for(int i = 1; i < n; ++i) {
      if(res < num[i] - num[i - 1]) res = num[i] - num[i - 1];
    }
    if(res < k + num[0] - num[n - 1]) res = k + num[0] - num[n - 1];
    System.out.println(k - res);
  }
}
