import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    if (A > B) {
      int tmp = A;
      A = B;
      B = tmp;
    }
    for (int i = A; i < B; i++) {
      if (i == C) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }

}
