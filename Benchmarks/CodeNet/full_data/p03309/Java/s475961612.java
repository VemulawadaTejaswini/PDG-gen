import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] A = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    sc.close();

    int[] d = new int[N];

    for (int i = 0; i < N; i++) {
      d[i] = i + 1 - A[i]; 
    }

    Arrays.sort(d);

    int d_1 = (int)Math.ceil((double)N/2) - 1 ;
    int d_2 = (int)Math.ceil((double)N/2);

    int min1 = 0;

    for (int i = 0; i < N; i++) {
      min1 += Math.abs(i + 1 - A[i] - d[d_1]);
    }

    int min2 = 0;

    for (int i = 0; i < N; i++) {
      min2 += Math.abs(i + 1 - A[i] - d[d_2]);
    }

    System.out.println(Math.min(min1,min2));

  }

}