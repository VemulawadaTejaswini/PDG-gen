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
          long mod = 1000000007;
          long aRes = originComb(N,A,mod);
          long bRes = originComb(N,B,mod);
          long output = (originPow(2,N,mod) - 1) - aRes - bRes;
          myout((output + (3 * mod)) % mod);
        }
        //Method addition frame start
public static long originComb(long n, long k, long m){
  long ret = 1;
  for(int i = 0; i < k; i++){
    ret = (ret * (n - i)) % m;
    ret = (ret * originPow(i + 1, m - 2, m)) % m;
  }
  return ret;
}
static long originPow(long x, long n,long m) {
        long ans = 1;
        while (n > 0) {
                if ((n & 1) == 1){
                  ans = ans * x;
                  if(m != -1){ans %= m;}
                }
                x = x * x;
                if(m != -1){x %= m;}
                n >>= 1;
        }
        return ans;
}
        //Method addition frame end
}
