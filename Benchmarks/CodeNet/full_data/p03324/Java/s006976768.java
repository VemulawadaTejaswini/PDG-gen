import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int N = sc.nextInt();

    if( D == 0){
      if( N <= 99){
        System.out.println(  N );
      }else{
        System.out.println( 101 );
      }
    }else if( D == 1){
      if( N <= 99){
        System.out.println( N   * 100 );
      }else{
        System.out.println( 10100 );
      }
    } else{
      if( N <= 99){
        System.out.println( N   * 10000 );
      }else{
        System.out.println( 1010000 );
      }
    }
  }
}
