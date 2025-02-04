import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    List<Long> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      for (int j = i+1; j < N; j++) {
        list.add((long)A[i] * (long)A[j]);
      }
    }

    Collections.sort(list);
    System.out.println(list.get(K-1));

    sc.close();
  }
}