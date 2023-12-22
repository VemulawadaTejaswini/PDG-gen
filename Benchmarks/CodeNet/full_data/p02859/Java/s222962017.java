import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int r = scan.nextInt();
    r = r * r;
    System.out.println(r);
    scan.close();
  }
}