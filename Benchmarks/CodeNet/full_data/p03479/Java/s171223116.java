import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long x = sc.nextLong();
      long y = sc.nextLong();
      int cnt = 1;
      long cur = x;
      while(cur <= y / 2) {
        cur = cur * 2;
        cnt++;
      }
      System.out.println(cnt);
  }
}