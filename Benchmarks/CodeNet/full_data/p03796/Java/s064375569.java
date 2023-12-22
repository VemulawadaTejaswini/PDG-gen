import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    long k = 1;

    for (int i = 1; i <= n; i++) {
      k *= i;
      k %= (1000000000+7);
    }

    System.out.println(k);

  }

}
