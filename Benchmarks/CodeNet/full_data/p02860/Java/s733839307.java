import java.util.Scanner;

class Main{
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    if (N % 2 == 0) {
      String S = scanner.next();
      if (S.regionMatches(0, S, N / 2, N)){
        System.out.println("Yes");
      }else {
        System.out.println("No");
      }
    }else {
      System.out.println("No");
    }
  }
}