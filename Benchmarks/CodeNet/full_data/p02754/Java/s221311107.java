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
          long A = getLong();
          long B = getLong();
          long sum = 0;
          sum += (Math.floor(N / (A + B))) * A;
          long amari = N % (A + B);
          sum += Math.min(amari,A);
          myout(sum);
        }
        //Method addition frame start

        //Method addition frame end
}
