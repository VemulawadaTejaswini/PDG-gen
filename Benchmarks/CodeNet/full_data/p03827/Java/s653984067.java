import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    String S_ = sc.next();

    sc.close();

    String[] S = S_.split("");

    int x = 0;
    int max = 0;

    for (int i = 0; i < S.length; i++) {
      if (S[i].equals("I")) {
        x++;
        max = Math.max(max, x);
      } else {
        x--;
      }
    }

    System.out.println(max);

  }

}