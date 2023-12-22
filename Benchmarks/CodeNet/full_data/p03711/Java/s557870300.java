import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int[] a = { 3, 1, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3 };

    if (a[x - 1] == a[y - 1]) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}