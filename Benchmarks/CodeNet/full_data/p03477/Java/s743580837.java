import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt() + sc.nextInt();
    int B = sc.nextInt() + sc.nextInt();
    if (A == B) {
      System.out.println("Balanced");
    } else if (A > B) {
      System.out.println("Left");
    } else {
      System.out.println("Right");
    }
  }
}
