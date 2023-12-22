import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long N = scan.nextInt();
    scan.close();

    System.out.println(N/2 + N%2);
  }
}