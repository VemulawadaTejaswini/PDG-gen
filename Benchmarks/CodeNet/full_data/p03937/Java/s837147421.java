import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int count = 0;
    for (int i = 0; i < H; i++) {
      String s = sc.next();
      for (int j = 0; j < W; j++) {
        if (s.charAt(j) == '#') {
          count++;
        }
      }
    }
    System.out.println(count == W+H-1 ? "Possible" : "Impossible");
  }
}