import java.util.Scanner;
 
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int ans = x + y / 2;
    System.out.println(ans);
  }
}