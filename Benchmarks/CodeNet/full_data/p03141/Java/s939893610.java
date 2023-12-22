import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    int A[] = new int[N];
    int B[] = new int[N];
    ArrayList<sumList> List = new ArrayList<sumList>();

    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(sc.next());
      B[i] = Integer.parseInt(sc.next());
      List.add(new sumList(i, A[i] + B[i]));
    }

    List.sort((a, b) -> b.sum - a.sum);

    long ans = 0;
    for (int i = 0; i < N; i++) {
      if (i % 2 == 0) {
        ans += A[List.get(i).index];
      } else {
        ans -= B[List.get(i).index];
      }
    }

    System.out.println(ans);
  }

}

class sumList {
  int index;
  int sum;

  public sumList(int i, int s) {
    index = i;
    sum = s;
  }

}