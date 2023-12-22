import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] arr = new long[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      int cnt = 0;
      for(long a : arr) {
        while(a % 2 == 0) {
          cnt++;
          a /= 2;
        }
      }

      System.out.println(cnt);
  }
}
