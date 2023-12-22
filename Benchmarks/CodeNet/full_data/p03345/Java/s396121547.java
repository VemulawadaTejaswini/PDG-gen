import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}
        static void myerr(Object t){System.err.println(t);}
        static String getStr(){return sc.next();}
        static int getInt(){return sc.nextInt();}
        static Long getLong(){return sc.nextLong();}
        static boolean isNext(){return sc.hasNext();}
        public static void main(String[] args){
          long A = getLong();
          long B = getLong();
          long C = getLong();
          long K = getLong();
          if(K % 2 == 0){
            myout(A - B);
          }else{
            myout(B - A);
          }
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
