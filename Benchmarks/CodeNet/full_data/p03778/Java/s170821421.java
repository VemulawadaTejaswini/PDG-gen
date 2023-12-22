import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int result ;

    if(a <= b){
      if( a <= b && b <= a + W ){
        result = 0 ;
      }else{
        result = Math.min( Math.abs( b - a ) , Math.abs( b - (a + W) )  );
      }
      System.out.println(result);
    }else{
      if( b <= a && a <= b + W ){
        result = 0 ;
      }else{
        result = Math.min( Math.abs( a - b ) , Math.abs( a - (b + W) )  );
      }
      System.out.println(result);
    }
  }
}
