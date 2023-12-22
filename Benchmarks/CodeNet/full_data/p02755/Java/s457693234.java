import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 整数の入力

    int a = sc.nextInt();
    int b = sc.nextInt();

    int p = a*100 / 8;
    //int q = b*10;
    
    //出力
    if ( b == p/10 ) {
      System.out.println( p );
    } else {
      System.out.println(-1);
    }
    
    
  }
}

