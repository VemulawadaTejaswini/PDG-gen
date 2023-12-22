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
          long H = getLong();
          long W = getLong();
          long output = 0;
          if(H % 2 == 0 && W % 2 == 0){
            output = H * W  / 2;
          }else if(H % 2 != 0 && W % 2 == 0){
            H--;
            output = H * W  / 2;
            output += (W / 2);
          }else if(H % 2 == 0 && W % 2 != 0){
            W--;
            output = H * W  / 2;
            output += (H / 2);
          }else{
            H--;
            W--;
            output = H * W  / 2;
            output += (W / 2) + (H / 2) + 1;
          }
          myout(output);
        }
        //Method addition frame start

        //Method addition frame end
}
