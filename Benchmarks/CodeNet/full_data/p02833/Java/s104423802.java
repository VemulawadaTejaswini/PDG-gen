import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static long getLong(){return Long.parseLong(getStr());}
        static boolean hasNext(){return sc.hasNext();}
        static char[] mySplit(String str){return str.toCharArray();}
        public static void main(String[] args){
          long N = getLong();
          if(N == 0 || N % 2 == 1){
            myout(0);
            return;
          }
          long output = 0;
          int count = 1;
          long tei = 10;
          while(N >= tei){
            myerr(tei);
            output += N / tei;
            tei *= 5;
          }
          myout(output);
        }
        //Method addition frame start

        //Method addition frame end
}
