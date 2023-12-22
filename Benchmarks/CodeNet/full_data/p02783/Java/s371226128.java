import java.util.Scanner;

public class Abc123a {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int h = input.nextInt();
    int a = input.nextInt();
    System.out.print((int) Math.ceil(1.0 * h / a));
  }

}
