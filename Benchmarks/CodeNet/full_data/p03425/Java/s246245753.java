import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] P ={0 ,0 ,0 ,0 ,0 ,0 ,1 ,1 ,1 ,2};
    int[] Q ={1 ,1 ,1 ,2 ,2 ,3 ,2 ,2 ,3 ,3};
    int[] R ={2 ,3 ,4 ,3 ,4 ,4 ,3 ,4 ,4 ,4};
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] S = new int[5];
    for (int i = 0; i < N; i++) {
      String name = sc.next();
      if (name.charAt(0) == 'M') S[0]++;
      if (name.charAt(0) == 'A') S[1]++;
      if (name.charAt(0) == 'R') S[2]++;
      if (name.charAt(0) == 'C') S[3]++;
      if (name.charAt(0) == 'H') S[4]++;
    }
    long res = 0;
    for (int d = 0; d < 10; d++) {
      res += S[P[d]] * S[Q[d]] * S[R[d]];
    }

    System.out.println(res);
  }
}
