import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int max = sc.nextInt();

    int[] move = new int[n];
    for (int i = 0; i < n; i++) {
      move[i] = sc.nextInt();
    }

    int jump = 0;
    int position = 0;
    for (int i = 0; i < n; i++) {
      while (position <= max) {
        position += move[i];
        jump++;
      }
    }

    System.out.println(jump);
  }
}
