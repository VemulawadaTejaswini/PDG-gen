import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int max = 0;
    int min = 0;
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if (i == 0) {
        max = a;
        min = a;
      }
      if (a > max) max = a;
      if (a < min) min = a;
    }

    System.out.println(max - min);
  }
}