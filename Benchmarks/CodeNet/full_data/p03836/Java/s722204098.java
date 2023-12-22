import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sx = sc.nextInt();
    int sy = sc.nextInt();
    int tx = sc.nextInt();
    int ty = sc.nextInt();
    String ans = "";
    for (int i = 0; i < ty - sy; i++) {
      ans += "U";
    }
    for (int i = 0; i < tx - sx; i++) {
      ans += "R";
    }
    for (int i = 0; i < ty - sy; i++) {
      ans += "D";
    }
    for (int i = 0; i < tx - sx; i++) {
      ans += "L";
    }
    ans += "L";
    for (int i = 0; i < ty - sy + 1; i++) {
      ans += "U";
    }
    for (int i = 0; i < tx - sx + 1; i++) {
      ans += "R";
    }
    ans += "D";
    ans += "R";
    for (int i = 0; i < ty - sy + 1; i++) {
      ans += "D";
    }
    for (int i = 0; i < tx - sx + 1; i++) {
      ans += "L";
    }
    ans += "U";
    System.out.println(ans);
  }
}