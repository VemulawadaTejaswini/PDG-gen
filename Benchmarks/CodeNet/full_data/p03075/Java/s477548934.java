import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int[] points = new int[5];
    int distance = 0;

    for (int i = 0; i < points.length; i++) {
      points[i] = sc.nextInt();
    }
    int upper = sc.nextInt();

    loop: for (int i = 0; i < 5; i++) {
      for (int n = 0; n < 5; n++) {
        distance = points[n] - points[i];
        if (distance > upper) {
          System.out.println(":(");
          break loop;
        }
      }
      if (i == 4) {
        System.out.println("Yay!");
      }
    }
  }
}