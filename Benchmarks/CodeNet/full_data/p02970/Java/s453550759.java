import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int d = sc.nextInt();
    int dd = d * 2 + 1;

    double need = (double)n / dd;

    if(n % dd == 0) {
      System.out.println((int)need);
    } else {
      System.out.println((int)Math.ceil(need));
    }
  }
}
