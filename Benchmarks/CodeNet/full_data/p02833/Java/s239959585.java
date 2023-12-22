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
          long N = getLong();
          if(N % 2 == 1){
            myout(0);
            return;
          }
          long output = 0;
          int keta = String.valueOf(N).length()-1;
          long mae = 0;
          while(keta > 0){
            //左端から
            long amari = N / ((long)(Math.pow(10,keta)));
            output += (amari - mae) * keta;
            myerr(output);
            mae = amari;
            keta--;
          }
          myout(output);
        }
        //便利メソッド追加枠ここから
  
        //便利メソッド追加枠ここまで
}
