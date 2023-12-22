import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int A = N / 1000;
    N = N % 1000;
    int B = N / 100;
    N = N % 100;
    int C = N /10;
    N = N % 10;
    int D = N / 1;

    if (A + B + C + D == 7){
      System.out.println(A + "+" + B + "+" + C + "+" + D + "=7");
    } else if (A - B + C + D == 7) {
      System.out.println(A + "-" + B + "+" + C + "+" + D + "=7");
    } else if (A + B - C + D == 7) {
      System.out.println(A + "+" + B + "-" + C + "+" + D + "=7");
    } else if (A + B + C - D == 7) {
      System.out.println(A + "+" + B + "+" + C + "-" + D + "=7");
    } else if (A - B - C + D == 7) {
      System.out.println(A + "-" + B + "-" + C + "+" + D + "=7");
    } else if (A - B + C - D == 7) {
      System.out.println(A + "-" + B + "+" + C + "-" + D + "=7");
    } else if (A + B - C - D == 7) {
      System.out.println(A + "+" + B + "-" + C + "-" + D + "=7");
    } else if (A - B - C - D == 7) {
      System.out.println(A + "-" + B + "-" + C + "-" + D + "=7");
    }
  }
}
