import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int D = scan.nextInt();

    int kanshi = 2 * D + 1;

    if (N <= kanshi) {
      System.out.println(1);
      return;
    }

    int count = 0;

    while (true) {
      count++;
      N -= kanshi;
      if (N <= 0) {
        System.out.println(count);
        return;
      }
    }
  }

}
