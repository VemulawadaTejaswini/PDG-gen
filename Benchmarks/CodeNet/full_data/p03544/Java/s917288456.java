import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    sc.close();

    long result[] = new long[N+1];

    result[0] = 2;
    result[1] = 1;

    for (int i = 2; i < N+1; i++) {
      result[i] = result[i-1] + result[i-2];
    }

    System.out.println(result[N]);

  }

}