import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int P = scan.nextInt();

    System.out.println((A * 3 + P) / 2);
  }
}