import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    int[] L = new int[M];
    int[] R = new int[M];

    int[] status = new int[N];

    for (int i = 0; i < M; i++) {
      L[i] = sc.nextInt();
      R[i] = sc.nextInt();
    }

    sc.close();

    Arrays.fill(status,0);

    int min = 0;
    int max = N;
    boolean flg = true;
    int k = 0;
    int l = 0;

    for (int i = 0; i < M; i++) {
      
      flg = true;
      k = 0;
      l = 0;

      for (int j = min; j < max; j++) {

        if (L[i] - 1 <= j && j <= R[i]) {
          status[j] = 1;
          if (flg) {
            k = j;
            flg = false;
          } else {
            l = j;
          }
        } else {
          status[j] = 0;
        }

      }

      min = k;
      max = l + 1;

    }

    int count = 0;

    for (int i = 0; i < N; i++) {
      if (status[i] == 1) {
        count++;
      }
    }

    System.out.println(count);
 
  }

}