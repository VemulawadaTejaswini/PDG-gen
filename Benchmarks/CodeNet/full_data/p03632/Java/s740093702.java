import java.util.*;
    
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();

    if(A < C){
      if(C < B){
        if(B > D){
          System.out.println(D - C);
        }
        else{
          System.out.println(B - C);
        }
      }
      if(C >= B){
        System.out.println('0');
      }
    }
    if(C < A){
      if(D > A){
        if(B < D){
          System.out.println(B - A);
        }
        else{
          System.out.println(D - A);
        }
      }
      if(A >= D){
        System.out.println('0');
      }
    }
    if(A==C){
      System.out.println('0');
    }
  }
}