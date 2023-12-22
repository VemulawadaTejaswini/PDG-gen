import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int k = sc.nextInt();
    int n = sc.nextInt();

    int min = Integer.MAX_VALUE;
    int before = sc.nextInt();
    int first = before;
    int second = 0;
    int last = 0;
    for (int i = 1; i < n - 1; i++) {
      int current = sc.nextInt();
      int clock = k - (current - before);
      before = current;
      int next = sc.nextInt();
      int unClock = k - (next - current);
      if (first == 0 && i == 1) {
        second = current;
      }
      last = next;
      if (clock <= unClock) {
        if (clock < min) {
          min = clock;
        }
      } else {
        if (unClock < min) {
          min = unClock;
        }
      }
    }

    int unClock = first == 0 ? k - last + second : k - last + first;
    if (unClock < min) {
      min = unClock;
    }

    System.out.println(min);
  }
}
