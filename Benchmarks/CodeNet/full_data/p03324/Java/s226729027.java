import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int D = in.nextInt();
    int N = in.nextInt();
    in.close();
    System.out.println((int)(N * (Math.pow(100, D) + N / 100)));
  }
}