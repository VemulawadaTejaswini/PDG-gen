import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int currMax = 0;
      int view = 0;

      for (int i = 0; i < N; ++i) {
        int Hi = in.nextInt();

        if (Hi >= currMax) {
           ++view;
        }

        currMax = Math.max(currMax, Hi);
      }
 
      System.out.println(view);
    }
  }
}