import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] P ={0 ,0 ,0 ,0 ,0 ,0 ,1 ,1 ,1 ,2};
    int[] Q ={1 ,1 ,1 ,2 ,2 ,3 ,2 ,2 ,3 ,3};
    int[] R ={2 ,3 ,4 ,3 ,4 ,4 ,3 ,4 ,4 ,4};
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] D = new long[5];
    for (int i = 0; i < N; i++) {
      String name = sc.next();
      if (name.charAt(0) == 'M') D[0]++;
      if (name.charAt(0) == 'A') D[1]++;
      if (name.charAt(0) == 'R') D[2]++;
      if (name.charAt(0) == 'C') D[3]++;
      if (name.charAt(0) == 'H') D[4]++;
    }
    long res = 0;
    for (int d = 0; d < 10; d++) {
      res += D[P[d]] * D[Q[d]] * D[R[d]];
    }

    System.out.println(res);
  }
}
