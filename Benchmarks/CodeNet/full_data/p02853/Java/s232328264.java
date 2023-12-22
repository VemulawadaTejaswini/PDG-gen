import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int out = 0;
    if (X <= 3) out += 400000 - X*100000;
    if (Y <= 3) out += 400000 - Y*100000;
    if (X == 1 && Y == 1) out += 400000;
    System.out.println(out);
  }
}
