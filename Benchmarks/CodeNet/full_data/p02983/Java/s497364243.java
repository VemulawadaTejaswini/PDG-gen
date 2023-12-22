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
          long L = getLong();
          long R = getLong();
          
          long output = 2020;
          for(long i = L; i < R; i++){
            for(long j = i + 1; j <= R; j++){
              long tmp = (i * j) % 2019;
              output = Math.min(output,tmp);
              if(output == 0){
                myout(output);
                return;
              }
            }
          }
          myout(output);
        }
        //Method addition frame start

        //Method addition frame end
}
