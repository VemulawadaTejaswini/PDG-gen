import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), D = sc.nextInt();
    int X = D * 2 + 1;
    System.out.println((N + X - 1) / X);
  }
}