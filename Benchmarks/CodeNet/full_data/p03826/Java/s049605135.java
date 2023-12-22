import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int A = s.nextInt();
    int B = s.nextInt();
    int C = s.nextInt();
    int D = s.nextInt();
    System.out.println(Math.max(A*B, C*D));
  }
}
