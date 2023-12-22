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
          PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
          int X = getInt();
          int Y = getInt();
          int A = getInt();
          int B = getInt();
          int C = getInt();
          ArrayList<Integer> alist = new ArrayList<Integer>();
          ArrayList<Integer> blist = new ArrayList<Integer>();
          ArrayList<Integer> clist = new ArrayList<Integer>();
          for(int i = 0; i < A; i++){
            alist.add(getInt());
          }
          for(int i = 0; i < B; i++){
            blist.add(getInt());
          }
          for(int i = 0; i < C; i++){
            clist.add(getInt());
          }
          
          Collections.sort(alist,Collections.reverseOrder());
          Collections.sort(blist,Collections.reverseOrder());
          Collections.sort(clist,Collections.reverseOrder());
          for(int i = 0; i < X; i++){
            pq.add(alist.get(i));
          }
          for(int i = 0; i < Y; i++){
            pq.add(blist.get(i));
          }
          for(int i = 0; i < C; i++){
            int pqMin = pq.poll();
            int cMax = clist.get(i);
            if(pqMin < cMax){
              pq.add(cMax);
            }else{
              pq.add(pqMin);
            }
          }
          long output = 0;
          while(!pq.isEmpty()){
            output += pq.poll();
          }
          myout(output);
        }
        //Method addition frame start

        //Method addition frame end
}
