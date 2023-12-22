import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    long sum = 0;
    int add = 1;
    int ans = 0;
    do {
      sum += add;
      add++;
      ans++;
    } while (sum < X);
    System.out.println(ans);
  }
}