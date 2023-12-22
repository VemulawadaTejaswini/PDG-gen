import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    long sum[] = new long[N + 1];
    sum[0] = 0;
    for (int i = 0; i < N; i++) {
      sum[i + 1] = sum[i] + Long.parseLong(sc.next());
    }
    int count = 0;
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N + 1; j++) {
        if (sum[i] - sum[j] == 0) {
          count++;
        }
      }
    }
    System.out.println(count);

  }
}