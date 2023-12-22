import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}
        static String getStr(){return sc.next();}
        static int getInt(){return sc.nextInt();}
        static Long getLong(){return sc.nextLong();}
        static boolean isNext(){return sc.hasNext();}
        public static void main(String[] args){
          int x = getInt();
          int y = getInt();
          int output = 0;
          if(x == 3){
            output += 100000;
          }else if(x == 2){
            output += 200000;
          }else if(x == 1){
            output += 300000;
          }
          
          if(y == 3){
            output += 100000;
          }else if(y == 2){
            output += 200000;
          }else if(y == 1){
            output += 300000;
          }
          
          if(x == 1 && y == 1){
            output += 400000;
          }
          
          myout(output);
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
