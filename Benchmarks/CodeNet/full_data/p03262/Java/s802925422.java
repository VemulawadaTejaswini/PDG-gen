import java.util.*;
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
          int X = getInt();
          ArrayList<Integer> list = new ArrayList<Integer>(N+1);
          list.add(X);
          for(int i = 0; i < N; i++){
            list.add(getInt());
          }
          Collections.sort(list,Comparator.naturalOrder());
          long output = 0;
          boolean odd = false;
          boolean even = false;
          for(int i = 1; i < N+1; i++){
            if(i == 1){
              output = list.get(i)-list.get(i-1);
            }else{
              output = gcd(output, list.get(i)-list.get(i-1));
            }
          }
          myout(output);
        }
        //便利メソッド追加枠ここから
  public static long gcd(long m, long n) {return n != 0 ? gcd(n, m % n) : m;}
        //便利メソッド追加枠ここまで
}
