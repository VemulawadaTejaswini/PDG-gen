import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int n = sc.nextInt();
    int lx = 0;
    int rx = w;
    int by = 0;
    int uy = h;
    for(int i = 0; i < n; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int a = sc.nextInt();
      if(a == 1) lx = Math.max(lx, x);
      if(a == 2) rx = Math.min(rx, x);
      if(a == 3) by = Math.max(by, y);
      if(a == 4) uy = Math.min(uy, y);  
    }
    System.out.println(Math.max(0, rx - lx) * Math.max(0, uy - by));
  }
}