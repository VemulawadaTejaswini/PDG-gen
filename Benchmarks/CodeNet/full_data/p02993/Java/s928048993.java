import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int s = scan.nextInt();
    difficulty(s, 4);
  }

  public static void difficulty(int num, int left) {
    int last = num % 10;
    int rest = num / 10;

    if (rest == 0 && left == 1) {
      System.out.println("Good");
    } else if (last == rest % 10) {
      System.out.println("Bad");
    } else {
      difficulty(rest, left - 1);
    }
  }
}
