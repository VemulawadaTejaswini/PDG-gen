import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double L = (double)scan.nextInt();
    scan.close();

    System.out.println(String.format("%.12f", L*L*L/27));
  }
}