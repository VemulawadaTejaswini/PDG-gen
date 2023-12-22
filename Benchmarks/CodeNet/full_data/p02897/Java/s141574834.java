import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();

    sc.close();

    double ans = 1;

    if (N != 1) {
      int count = N / 2;
      ans = (double) (N - count) / N;
    }
    
    System.out.println(ans);
    
  }

}