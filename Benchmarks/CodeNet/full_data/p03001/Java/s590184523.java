import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int W = in.nextInt();
    int H = in.nextInt();
    int x = in.nextInt();
    int y = in.nextInt();
    System.out.println((W * H / 2.0) + " " + (W == x * 2 && H == y * 2 ? 1 : 0));
  }
}