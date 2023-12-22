import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int NN = N;
    int S = 0;
    while (NN > 0) {
      S += (NN % 10);
      NN /= 10;
    }
    if (N % S == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}