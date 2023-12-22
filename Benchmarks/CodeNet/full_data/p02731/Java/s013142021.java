import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long L = scan.nextInt();
    scan.close();

    System.out.println(L*L*L/27);
  }
}