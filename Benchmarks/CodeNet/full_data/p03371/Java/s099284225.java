import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int x = scan.nextInt();
    int y = scan.nextInt();

    long min = (long) (5 * Math.pow(10, 8));

    for (int i = 0; i <= Math.pow(10, 5); i++) {
      min = Math.min(min, 2 * c * i + Math.max(0, x - i) * a + Math.max(0, y - i) * b);
    }
    
    System.out.println(min);

  }

}