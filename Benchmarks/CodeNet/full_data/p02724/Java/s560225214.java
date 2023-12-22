import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();

    int c500, c5;

    c500 = X / 500;
    X -= c500 * 500;
    c5 = X / 5;

    System.out.println(c500 * 1000 + c5 * 5);

  }

}