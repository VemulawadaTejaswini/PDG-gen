import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int N = sc.nextInt();

    int[] L = new int[N];

    for (int i=0; i<N; i++) {
      L[i] = sc.nextInt();
    }

    Arrays.sort(L);

    int sum = 0;
    for (int i=0; i<N-1; i++) {
      sum += L[i];
    }

    System.out.println(L[N-1] < sum ? "Yes" : "No");

  }
}
