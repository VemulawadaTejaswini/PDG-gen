import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int p = n / ( a + b );
    int q = n % ( a + b );
    
    //出力
    if ( q >= a ) {
      System.out.println( p * a + a);
    } else {
      System.out.println( p * a + q);
    }
    
  }
}