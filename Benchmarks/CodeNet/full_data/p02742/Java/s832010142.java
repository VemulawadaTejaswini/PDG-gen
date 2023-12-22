import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      long h = sc.nextLong();
      long w = sc.nextLong();
      if(h == 1 || w == 1) {
          System.out.println(0);
          return;
      }
      long cnt = h / 2 * w;
      if(h % 2 != 0) {
        cnt += (w + 2 - 1) / 2;
      }
      System.out.println(cnt);
  }
}
