import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max = 0;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      int index = sc.nextInt();
      int value = sc.nextInt();
      max = Math.max(max, index);
      min = Math.min(min, value);
    }

    System.out.println(max + min);

  }
}