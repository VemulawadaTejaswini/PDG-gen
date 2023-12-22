import java.util.Scanner;

public class Qa {
  public static void main(String[] args) {
    int result;
    Scanner sc = new Scanner(System.in);
    int numX = sc.nextInt();
    int numA = sc.nextInt();
    result = numX < numA ? 0 : 10;
    System.out.println(result);
    sc.close();
  }
}