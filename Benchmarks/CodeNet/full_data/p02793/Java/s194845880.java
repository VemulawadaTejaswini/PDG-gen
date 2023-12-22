import java.util.*;
import java.math.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}//standard output
        static void myerr(Object t){System.err.println(t);}//standard error
        static String getStr(){return sc.next();}
        static int getInt(){return Integer.parseInt(getStr());}
        static long getLong(){return Long.parseLong(getStr());}
        static boolean isNext(){return sc.hasNext();}
        static String[] mySplit(String str){return str.split("");}
        public static void main(String[] args){
          int N = getInt();
          ArrayList<String> list = new ArrayList<String>(N);
          BigInteger outlcm = new BigInteger("1");
          for(int i = 0; i < N; i++){
            list.add(String.valueOf(getInt()));
            BigInteger gcd = outlcm.gcd(new BigInteger(list.get(i)));
            BigInteger multi = outlcm.multiply(new BigInteger(list.get(i)));
            outlcm = multi.divide(gcd);
          }
          //myout(outlcm);
          BigInteger output = new BigInteger("0");
          for(int i = 0; i < N; i++){
            output = output.add(outlcm.divide(new BigInteger(list.get(i)))).mod(new BigInteger("1000000007"));
          }
          myout(output);
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
