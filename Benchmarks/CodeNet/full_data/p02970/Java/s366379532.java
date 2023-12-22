import java.util.Scanner; 

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int D = in.nextInt();
      int range = 2 * D + 1;
      int ans = N / range + (N % range != 0 ? 1 : 0);

      System.out.println(ans);
    }
  }
}