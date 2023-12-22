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
          Long min = new Long("10000000000000007");
          while(hasNext()){
            min = Math.min(getLong(),min);
          }
          if(min >= N){
            myout(5);
          }else{
            if(N % 2 == 1){
              N++;
            }
            myout((N / min) + 4);
          }
        }
        //Method addition frame start

        //Method addition frame end
}
