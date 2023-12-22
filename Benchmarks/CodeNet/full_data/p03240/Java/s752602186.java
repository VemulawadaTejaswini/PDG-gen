import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int[] x = new int[N];
      int[] y = new int[N];
      int[] h = new int[N];

      for (int i = 0; i < x.length; ++i) {
        x[i] = in.nextInt();
        y[i] = in.nextInt();
        h[i] = in.nextInt();
      }

      int Cx = 0;
      int Cy = 0;
      int H = 0;
      boolean solFound = false;

      for (int cx = 0; cx <= 100 && solFound == false; ++cx) {
        for (int cy = 0; cy <= 100 && solFound == false; ++cy) {
          H = h[0] + Math.abs(x[0] - cx) + Math.abs(y[0] - cy);
          
          boolean isAllEqual = true;
          for (int i = 0; i < x.length; ++i) {
            int Hi = h[i] + Math.abs(x[i] - cx) + Math.abs(y[i] - cy);

            if (Hi != H) {
              isAllEqual = false;
              break;
            }
          }

          if (isAllEqual && H > 0) {
            Cx = cx;
            Cy = cy;
            solFound = true;
          }
        }
      }

      System.out.println(Cx + " " + Cy + " " + H);
      
    }
  }
}