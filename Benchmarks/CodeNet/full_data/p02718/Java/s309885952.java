import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] votes = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      int vote = sc.nextInt();
      votes[i] = vote;
      sum += vote;
    }
    int count = 0;
    for (int vote : votes) {
      if (vote >= sum / (4 * m)) {
        count++;
      }
    }
    if (count >= m) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
