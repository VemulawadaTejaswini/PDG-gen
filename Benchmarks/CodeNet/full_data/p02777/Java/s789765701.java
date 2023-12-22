import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    int A = sc.nextInt();
    int B = sc.nextInt();
    String U = sc.next();

    int A1 = 0;
    int B1 = 0;

    if(S.equals(U)){
      A1 = A - 1;
      System.out.println(A1 + " "+ B);
    }else if(T.equals(U)){
      B1 = B - 1;
      System.out.println(A +" "+B1);
    }
  }
}