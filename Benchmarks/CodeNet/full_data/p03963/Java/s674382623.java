import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long sum = k;

    for (int i = 0; i < n-1; i++) {
      sum *= (k-1);
    }

    System.out.println(sum);
  }

}
