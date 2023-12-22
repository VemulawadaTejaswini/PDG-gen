import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}
        static void myerr(Object t){System.err.println(t);}
        static String getStr(){return sc.next();}
        static int getInt(){return sc.nextInt();}
        static Long getLong(){return sc.nextLong();}
        static boolean isNext(){return sc.hasNext();}
  		static String[] splitSingle(String str){return str.split("");}
        public static void main(String[] args){
          String[] s = splitSingle(getStr());
          long k = getLong();
          if(k > s.length){
            k = s.length;
          }
          String output = "1";
          for(int i = 0; i < k; i++){
            String tmp = s[i];
            if(!tmp.equals("1")){
              output = s[i];
              break;
            }
          }
          myout(output);
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
