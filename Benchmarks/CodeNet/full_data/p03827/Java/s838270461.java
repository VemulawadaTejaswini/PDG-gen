import java.util.*;
public class Main {
  public static void main(String [] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int num[] = new int[N];
      String S = sc.next();
      String values[] = S.split("");
      int max = 0;
      for (int i = 0; i < N  ; i++) {
        String x = values[i];
        if (x.equals("I")) {
          max = max + 1;
          num[i] = max;
        } else {
          max = max - 1;
          num[i] = max;
        }
      }
      int ret = findmax(num);
      System.out.println(ret);
  }
  private static int  findmax(int num[]) {
      int max = 0;
      for (int j = 0; j < num.length; j ++) {
          max = Math.max(max, num[j]);
      }
      return max;
  }
}