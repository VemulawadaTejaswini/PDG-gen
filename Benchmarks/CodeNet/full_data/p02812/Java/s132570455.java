import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    char[] c = in.next().toCharArray();

    int count = 0;
    for (int i = 2; i < N; i++) {
      if (c[i - 2] == 'A' && c[i - 1] == 'B' && c[i] == 'C') {
        count++;
      }
    }
    System.out.println(count);
  }
}