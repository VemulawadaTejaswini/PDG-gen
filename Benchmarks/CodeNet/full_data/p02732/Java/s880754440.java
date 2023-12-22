import java.util.*;
import java.io.BufferedInputStream;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner (new BufferedInputStream(System.in));
    int n = sc.nextInt();
    int[] num = new int[n];
    int[] count = new int[n];
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < n; ++i) {
      num[i] = sc.nextInt();
      count[num[i]]++;
    }
    long res = 0;
    for(int i = 0; i < n; ++i) {
        res += count[i] * (count[i] - 1) / 2;
    }
    for(int i = 0; i < n; ++i) {
        if(count[num[i]] < 2) System.out.println(res);
        else System.out.println(res - count[num[i]] * (count[num[i]] - 1) / 2 + (count[num[i]] - 1)* (count[num[i]] - 2) / 2);
    }
  }
}