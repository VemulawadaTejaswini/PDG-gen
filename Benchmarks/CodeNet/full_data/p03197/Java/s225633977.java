import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    boolean allEven = true;
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      if (a%2 != 0) {
        allEven = false;
      }
    }
    System.out.println(allEven ? "second" : "first");
  }
}