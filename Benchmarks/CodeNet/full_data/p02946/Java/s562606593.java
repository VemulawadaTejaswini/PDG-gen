import java.util.*;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    for (int i = k-n+1; i < k+n; i++) {
      if (i != k-n+1) System.out.print(" ");
      System.out.print(i);
    }
    System.out.println();

  }
}
