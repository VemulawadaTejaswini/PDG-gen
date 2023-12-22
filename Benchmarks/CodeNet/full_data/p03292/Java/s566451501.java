import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int min = 101;
    int max = 0;

    for (int i = 0; i < 2; i++) {
      int a = sc.nextInt();
      min = Math.min(a, min);
      max = Math.max(a, max);
    }

    System.out.println(max - min);

  }
}