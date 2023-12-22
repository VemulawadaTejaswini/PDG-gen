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
          int M = getInt();
          if(N >= M){
            myout(0);
            return;
          }
          long output = 0;
          ArrayList<Integer> list = new ArrayList<Integer>(M);
          for(int i = 0; i < M; i++){
            list.add(getInt());
          }
          Collections.sort(list);
          //myout(list);
          PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
          for(int i = 1; i < M; i++){
            pq.add(Math.abs(list.get(i)-list.get(i-1)));
          }
          for(int i = 0; i < N-1; i++){
            pq.poll();
          }
          while(pq.size() != 0){
            output += pq.poll();
          }
          myout(output);
        }
        //便利メソッド追加枠ここから

        //便利メソッド追加枠ここまで
}
