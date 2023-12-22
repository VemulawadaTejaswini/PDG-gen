import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int w = sc.nextInt();
    int rok1 = (r + 1) / 2;
    int rok2 = r / 2;
    int ok = ((w + 1) / 2) * rok1 + (w / 2) * rok2;
    System.out.printf("%d", ok);
  }
}