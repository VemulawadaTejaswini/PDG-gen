import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int factor = (int) Math.pow(100, in.nextInt());
    int nth = in.nextInt();
    System.out.println(nth*factor);
  }
}