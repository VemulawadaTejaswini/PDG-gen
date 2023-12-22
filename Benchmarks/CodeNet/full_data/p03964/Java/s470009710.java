import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[][] ta = new int[n][2];
    int t = 1;
    int a = 1;

    for (int[] x : ta) {
      int power = max(x[0]/t, x[1]/a);
      t = x[0]*power;
      a = x[1]*power;
    }

    System.out.println(t+a);
  }
}
