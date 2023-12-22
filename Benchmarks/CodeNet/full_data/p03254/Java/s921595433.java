import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int x = sc.nextInt();
    int[] flag = new int[1000000000];

    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      flag[a-1] = 1;
    }

    int count = 0;

    for (int i = 0; i < flag.length; i++) {
      if (flag[i] == 1) {
        x = x - i - 1;
        if (x < 0) {
          break;
        }

        count++;
      }
    }

    if (x > 0) {
      count--;
    }

    System.out.println(count);
  }
}
