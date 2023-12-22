import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int tmpB = B;
    B = A;
    A = tmpB;
    int tmpC = C;
    C = A;
    A = tmpC;
    System.out.println(Integer.toString(A) + ' ' + Integer.toString(B) + ' '+Integer.toString(C));

  }
}

