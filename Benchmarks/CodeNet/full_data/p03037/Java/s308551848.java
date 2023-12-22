import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] l = new int[m];
    int[] r = new int[m];

    for (int i = 0; i < m; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }

    int max = 0;
    int min = 100000;

    for (int i = 0; i < m; i++) {
      max = Math.max(max,l[i]);
      min = Math.min(min,r[i]);
    }

    System.out.println(Math.abs(max-min)+1);
  }

}
