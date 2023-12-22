import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    long N = scn.nextInt();

    ArrayList<Info> infoList = new ArrayList<>();
    Info G = new Info(0, 0, 0);
    for (long i = 0; i < N; i++) {
      long x = scn.nextInt();
      long y = scn.nextInt();
      long h = scn.nextInt();

      infoList.add(new Info(x, y, h));
      if (h >= 1) {
        G = new Info(x, y, h);

      }
    }

    for (long cx = 0; cx <= 100; cx++) {
      for (long cy = 0; cy <= 100; cy++) {
        boolean flg = true;
        long H = Math.abs(G.x - cx) + Math.abs(G.y - cy) + G.h;
        H = Math.max(H, 0);
        for (Info info : infoList) {
          long V = Math.max(H - Math.abs(info.x - cx) - Math.abs(info.y - cy), 0L);
          if (V != info.h) {
            flg = false;
            break;
          }

        }

        if (flg) {
          System.out.printf("%d %d %d\n", cx, cy, H);
        }

      }
    }

  }

  public static class Info {
    long x;
    long y;
    long h;

    Info(long x, long y, long h) {
      this.x = x;
      this.y = y;
      this.h = h;
    }

  }

}
