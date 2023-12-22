import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] X = new int[N];
    int[] Y = new int[N];
    
    for (int i = 0; i < N; i++) {
      X[i] = sc.nextInt();
      Y[i] = X[i];
    }

    sc.close(); 

    Arrays.sort(X);

    int b = X[N/2];
    int s = X[N/2-1];

    for (int i = 0; i < N; i++) {
      if (Y[i] <= s) {
        System.out.println(b);
      } else {
        System.out.println(s);
      }
    }
  
  }

}