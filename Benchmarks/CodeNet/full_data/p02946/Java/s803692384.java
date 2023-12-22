import java.util.*;
import java.util.stream.*;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int K = in.nextInt(), X = in.nextInt();
    int min = Math.max(-1000000, X - K + 1);
    for (int i = min; i < Math.min(1000001, X + K); i++) {
      if(i != min) {
        System.out.print(" ");
      }
      System.out.print(i);
    }
    System.out.println();
  }
}
