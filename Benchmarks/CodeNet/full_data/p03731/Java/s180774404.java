import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int T = sc.nextInt();
    int[] t = new int[N];

    for (int i = 0; i < N; i++) {
      t[i] = sc.nextInt();
    }

    sc.close();

    long time = 0;

    for (int i = 0; i < N; i++) {
      if (i == N - 1) {
        time += T;
      } else {
        time += Math.min(T,t[i+1] - t[i]);
      }
    }
  
    System.out.println(time);

  }

}