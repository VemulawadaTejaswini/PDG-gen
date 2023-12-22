import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] L = new int[n];
    int[] R = new int[n];
    boolean[] used = new boolean[n];

    PriorityQueue pqL = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue pqR = new PriorityQueue<>();

    for (int i=0; i < n; i++) {
      pqL.add(sc.nextInt());
      pqR.add(sc.nextInt());
    }

    int firstRightAns = 0;
    int prev = 0;
    for (int i=0; i < n; i++) {
      if (i%2 == 1) {
        firstRightAns += Math.abs((int)pqL.peek() - prev);
        prev = (int)pqL.poll();
      } else {
        firstRightAns += Math.abs((int)pqR.peek() - prev);
        prev = (int)pqR.poll();
      }
    }
    firstRightAns += Math.abs(prev);

    int firstLeftAns = 0;
    prev = 0;
    for (int i=0; i < n; i++) {
      if (i%2 == 0) {
        firstLeftAns += Math.abs((int)pqL.peek() - prev);
        prev = (int)pqL.poll();
      } else {
        firstLeftAns += Math.abs((int)pqR.peek() - prev);
        prev = (int)pqR.poll();
      }
    }
    firstLeftAns += Math.abs(prev);

    System.out.println(Math.min(firstLeftAns, firstRightAns));
  }
}
