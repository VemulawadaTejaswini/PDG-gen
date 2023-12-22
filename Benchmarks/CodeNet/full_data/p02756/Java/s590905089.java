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
          ArrayDeque<Character> queue = new ArrayDeque<Character>();
          char[] ch = mySplit(getStr());
          for(int i = 0; i < ch.length; i++){
            queue.add(ch[i]);
          }
          int Q = getInt();
          boolean isReverse = false;
          for(int i = 0; i < Q; i++){
            int T = getInt();
            if(T == 1){
              isReverse = !isReverse;
            }else{
              int F = getInt();
              if(isReverse){
                if(F == 1){
                  F = 2;
                }else{
                  F = 1;
                }
              }
              char[] addChar = mySplit(getStr());
              if(F == 1){
                queue.addFirst(addChar[0]);
              }else{
                queue.addLast(addChar[0]);
              }
            }
          }
          StringBuilder sb = new StringBuilder("");
          while(!queue.isEmpty()){
              if(isReverse){
                 sb.append(queue.pollLast());
              }else{
                sb.append(queue.pollFirst());
              }
          }
          myout(sb.toString());
        }
        //Method addition frame start

        //Method addition frame end
}
