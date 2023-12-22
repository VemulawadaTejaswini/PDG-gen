import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    String T = scan.next();
    int A = scan.nextInt();
    int B = scan.nextInt();
    String U = scan.next();

    if(S.equals(U)) {
    	A--;
    }else if(T.equals(U)) {
    	B--;
    }

    System.out.print(A + " ");
    System.out.print(B);
  }
}