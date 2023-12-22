import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int max = a < b ? a : b;
    int min = n < Math.abs(a - b) ? Math.abs(a - b) : 0;
    System.out.println(max + " " + min);
  }

}
