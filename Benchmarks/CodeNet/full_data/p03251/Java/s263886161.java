import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();

    int[] x = new int[N];
    int[] y = new int[M];

    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
    }

    for (int i = 0; i < M; i++) {
      y[i] = sc.nextInt();
    }

    sc.close();

    Arrays.sort(x);

    Arrays.sort(y);

    String result = "War";

    for (int i = -100; i <= 100; i++) {

      if (x[N - 1] < i && i <= y[0] && X < i && i <= Y) {
        result = "No War";
        break;
      }

    }

    System.out.println(result);
 
  }

}