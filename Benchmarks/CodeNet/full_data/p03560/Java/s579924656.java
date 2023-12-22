import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long k = sc.nextLong();
    int ans = Integer.MAX_VALUE;
    for(int i = 1; i <= 1000000; i++) {
      long t = k * (long)i;
      int temp = 0;
      for(int j = 0; j < 20; j++) {
        if(t > 0) {
          temp += (int)(t % 10);
          t /= 10;
        } else {
          break;
        }
      }
      ans = Math.min(ans, temp);
    }
    System.out.println(ans);
  }
}