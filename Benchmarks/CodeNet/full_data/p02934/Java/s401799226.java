import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();

    double sum = 0;
    for (int i = 0; i < N; i++) {
      sum += 1 / scn.nextDouble();
    }

    System.out.println(1 / sum);
  }

}
