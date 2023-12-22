import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner( System.in );
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    if ( B > A ) {
      System.out.println("Input Error ( B > A )");
    } else {
      if ( C > (A-B) ) {
        System.out.println(C-(A-B));
      } else {
        System.out.println("0");
      }
    }
    
  }
}