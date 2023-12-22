import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long a = sc.nextLong();
      long b = sc.nextLong();

      long mid = (b - a -1) % 2 == 1 ? (b - a) / 2 : Long.MAX_VALUE;
      long left = b - 1;
      long right = n - a;
      System.out.println(Math.min(mid, Math.min(left, right)));
  }
}