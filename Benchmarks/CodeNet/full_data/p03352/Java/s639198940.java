import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    boolean[] b = new boolean[1001];
    b[1] = true;
    for (int i = 2; i <= 32; i++) {
      int tmp = i * i;
      while (tmp <= 1000) {
        b[tmp] = true;
        tmp *= i;
      }
    }

    int x = sc.nextInt();
    int i = x;
    while (true) {
      if (b[i]) {
        System.out.println(i);
        return;
      }
      i--;
    }

  }
}