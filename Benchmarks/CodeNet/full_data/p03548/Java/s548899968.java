import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = sc.nextInt();
    int cnt = 0;
    Y += Z;
    X -= Z;
    while (X >= Y) {
      X -= Y;
      cnt++;
    }
    System.out.println(cnt);
  }
}
