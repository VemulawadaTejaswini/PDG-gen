import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner( System.in );
    int A = sc.nextInt();
    int B = sc.nextInt();

    if ((A + (A-1)*(B/A)) >= B) {
      System.out.println(B/A);
    } else {
      System.out.println(B/A+1);
    }

  }
}