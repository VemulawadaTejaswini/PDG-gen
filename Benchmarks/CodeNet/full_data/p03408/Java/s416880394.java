import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        static void myout(Object t){System.out.println(t);}
        static void myerr(Object t){System.err.println(t);}
        static String getStr(){return sc.next();}
        static int getInt(){return sc.nextInt();}
        static Long getLong(){return sc.nextLong();}
        static boolean isNext(){return sc.hasNext();}
        static char[] splitSingle(String str){return str.toCharArray();}
        public static void main(String[] args){
          HashMap<String, Integer> list = new HashMap<String, Integer>();
          int blue = getInt();
          for(int i = 0; i < blue; i++){
            String str = getStr();
            if(list.get(str) == null){
              list.put(str,1);
            }else{
              list.put(str,list.get(str)+1);
            }
          }
          int red = getInt();
          for(int i = 0; i < red; i++){
            String str = getStr();
            if(list.get(str) == null){
              list.put(str,-1);
            }else{
              list.put(str,list.get(str)-1);
            }
          }
          int output = 0;
          Collection vals = list.values();
          Iterator it = vals.iterator();
          while(it.hasNext()){
            output = Math.max(output,(int)it.next());
          }
          myout(output);
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
