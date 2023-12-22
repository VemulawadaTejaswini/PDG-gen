
import java.util.Scanner;

public class Main {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    if ((A == B && B == C) || (A > B && B >= C)) {
      System.out.println(A * 10 + B + C);
    }else if (B > C && C >=A) {
    System.out.println(B * 10 + C + A);
  }else  if (C > A && A >= B){
    System.out.println(C * 10 + B + A);
  }


  }

}
