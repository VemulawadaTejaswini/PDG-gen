import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < N; i++) {
      int index = i;
      int count = 0;
      for (int j = 0; j <= index - 1; j++) {
        if (S.charAt(j) == 'W') {
          count++;
        }
      }
      for (int j = index + 1; j < N; j++) {
        if (S.charAt(j) == 'E') {
          count++;
        }
      }
      if (count < min) {
        min = count;
      }
    }
    System.out.println(min);
  }
}