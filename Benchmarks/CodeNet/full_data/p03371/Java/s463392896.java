import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int X = sc.nextInt();
    int Y = sc.nextInt();

    int result ;

      if(A + B <= 2 * C){
        result = A * X + B * Y ;
      }else {
        if(X <= Y ){
          if(B <= 2 *C){
            result = C * 2 * X + B * (Y - X);
          } else {
            result = C * 2 * Y ;
          }
        } else{
          if(A <= 2 * C){
            result = C * 2 * Y + A * (X - Y);
          } else {
            result = C * 2 * X;
          }
        }
      }
      System.out.println(result);
    }
  }
