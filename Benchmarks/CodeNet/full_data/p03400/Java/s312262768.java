import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int x = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int j = 0;
      while (((j * a) + 1) <= d) {
        x++;
        j++;
      }
    }

    System.out.println(x);

  }
}