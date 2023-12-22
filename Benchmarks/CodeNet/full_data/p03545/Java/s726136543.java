import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = N / 1000;
    int B = (N % 1000) / 100;
    int C = (N % 100) / 10;
    int D = N % 10;
    String op[] = {"+", "+", "+"};
    if (A + B + C + D != 7) {
      if (A + B + C - D == 7) {
        op[2] = "-";
      } else if (A + B - C + D == 7) {
        op[1] = "-";
      } else if (A + B - C - D == 7) {
        op[1] = "-";
        op[2] = "-";
      } else {
        op[0] = "-";
        if (A - B + C + D != 7) {
          if (A - B + C - D == 7) {
            op[2] = "-";
          } else if (A - B - C + D == 7) {
            op[1] = "-";
          } else {
            op[1] = "-";
            op[2] = "-";
          }
        }
      }
    }
    System.out.println(A + op[0] + B + op[1] + C + op[2] + D + "=7");
  }
}
