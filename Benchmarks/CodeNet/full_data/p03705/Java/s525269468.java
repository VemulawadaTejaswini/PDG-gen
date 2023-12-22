import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static Long getLong(){return Long.parseLong(getStr());}
        static boolean isNext(){return sc.hasNext();}
        static char[] splitSingle(String str){return str.toCharArray();}
        public static void main(String[] args){
          int N = getInt();
          int A = getInt();
          int B = getInt();
          if(A == B){
            myout(1);
            return;
          }else if(A > B){
            myout(0);
            return;
          }
          if(N == 1){
            myout(0);
            return;
          }
            if(N == 2){
              myout(1);
              return;
            }
            myout((long)(B-A) * (N-2) + 1);
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
