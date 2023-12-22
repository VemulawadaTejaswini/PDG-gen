import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    long[] H = new long[N];
    for (int i = 0; i < N; i++) {
      H[i] = Long.parseLong(sc.next());
    }
    
    boolean bool = true;
    long max = 0;
    for (int i = 0; i < N; i++) {
      max = Math.max(max, H[i]);

      if (max == H[i] + 1) {
        max = H[i];
        continue;
      }

      if (max > H[i] + 1) {
        bool = false;
        break;
      }
    }

    System.out.println(bool ? "Yes" : "No");
  }
}

// 1 2 1 1 3
// 1 2 1