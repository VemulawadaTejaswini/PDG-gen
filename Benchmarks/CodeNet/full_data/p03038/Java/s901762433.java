import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    List<Integer> A = new ArrayList<>();
    int[][] BC = new int[M][2];

    for (int i = 0; i < N; i++) {
      A.add(sc.nextInt());
    }

    for (int i = 0; i < M; i++) {
      int B_ = sc.nextInt();
      int C_ = sc.nextInt();
      BC[i][0] = B_;
      BC[i][1] = C_;
    }

    sc.close();

    for (int i = 0; i < M; i++) {
      for (int j = 0; j < BC[i][0]; j++) {
        A.add(BC[i][1]);
      }
    }

    Collections.sort(A, Comparator.reverseOrder());
    
    long sum = 0;

    for (int i = 0; i < N; i++) {
      sum += A.get(i);
    }

    System.out.println(sum);

  }

}