import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()){
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;

      for (int i = 0; i < 3; ++i) {
        int a = in.nextInt();
        max = Math.max(max, a);
        min = Math.min(min, a);
      }

      System.out.println(max - min);
    }
  }
}
