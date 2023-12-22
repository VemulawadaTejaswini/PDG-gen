import java.util.*;

public class Main {
    public static void main(String args[]) {
       //値の取得
       Scanner sc = new Scanner(System.in);
       long N = sc.nextLong();
       double root = Math.sqrt(N); //Nの平方根
       long a = 1;    //N(a,b)
       long b;
       long count = 0;    //到達に必要な移動回数

       //到達するまで移動を繰り返す
       while(a <= root) {
           if(N % a == 0) {
               b = N / a;    //N = a * b
               if(a + b - 2 < count || count == 0) {
                  count = a + b - 2; 
               }
           }
           ++a;
       }
 
       //出力
       System.out.println(count);
    }
}