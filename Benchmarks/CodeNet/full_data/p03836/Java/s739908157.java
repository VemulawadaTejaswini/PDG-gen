import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sx = Integer.parseInt(sc.next());
    int sy = Integer.parseInt(sc.next());
    int tx = Integer.parseInt(sc.next());
    int ty = Integer.parseInt(sc.next());
    int dx = tx - sx;
    int dy = ty - sy;
    for (int i = 0; i < dy; i++) {
      System.out.print("U");
    }
    for (int i = 0; i < dx; i++) {
      System.out.print("R");
    }
    for (int i = 0; i < dy; i++) {
      System.out.print("D");
    }
    for (int i = 0; i < dx; i++) {
      System.out.print("L");
    }
    System.out.print("L");
    for (int i = 0; i < dy + 1; i++) {
      System.out.print("U");
    }
    for (int i = 0; i < dx + 1; i++) {
      System.out.print("R");
    }
    System.out.print("DR");
    for (int i = 0; i < dy + 1; i++) {
      System.out.print("D");
    }
    for (int i = 0; i < dx + 1; i++) {
      System.out.print("L");
    }
    System.out.println("U");
  }
}