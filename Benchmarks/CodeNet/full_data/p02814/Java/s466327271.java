import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static Long getLong(){return Long.parseLong(getStr());}
        static boolean isNext(){return sc.hasNext();}
        static char[] splitSingle(String str){return str.toCharArray();}//equalsが使えんので要改修
        public static void main(String[] args){
  int N = getInt();
  int M = getInt();
  int[] list = new int[N];
          for(int i = 0; i < N; i++){
            list[i] = getInt();
          }
  boolean odd = false;
  boolean even = false;
  long lcmed = (long)list[0];
  long han = 0;
  for(int i = 1; i < N; i++){
    if(list[i] % 2 == 0){even = true;}else{odd = true;}
    if(even && odd){
      myout(0);
      return;
    }
    lcmed = lcm(lcmed,list[i]);
    han = lcmed /2;
  }
  M -= han;
          if(M < lcmed){
            myout(0);
            return;
          }else{
  			myout((int)(M / lcmed) + 1);
          }
        }
        //便利メソッド追加枠ここから
public static long lcm(long m, long n) {return Math.max(m,n) / gcd(m, n) * Math.min(m,n);}
  public static long gcd(long m, long n) {return n != 0 ? gcd(n, m % n) : m;}
        //便利メソッド追加枠ここまで
}
