import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    long K = sc.nextLong();
    int[] num = new int[100010];

    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      num[a] += b;
    }

    sc.close();

    for (int i = 0; i < num.length; i++) {
      K = K - num[i];
      if (K <= 0) {
        System.out.println(i);
        break;
      }
    }

  }

}