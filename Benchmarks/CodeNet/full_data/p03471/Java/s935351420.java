import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int y = sc.nextInt();
    int man = -1, gosen = -1, sen = -1;
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= n - i; j++) {
        int k = n - i - j;
        int tmp = 10000 * i + 5000 * j + 1000 * k;
        if (y == tmp) {
          man = i;
          gosen = j;
          sen = k;
        }
      }
    }
    System.out.println(man + " " + gosen + " " + sen);
  }
}
