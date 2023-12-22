import java.util.*;

public class Main {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();
    int[] ar = new int[n];
    for (int i = 1; i < n; i++) {
      ar[scan.nextInt() - 1]++;
    }

    for (int i = 0; i < n; i++) {
      System.out.println(ar[i]);
    }
  }
}