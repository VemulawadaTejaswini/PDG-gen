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
          int a = getInt();
          int b = getInt();
          int c = getInt();
          int k = getInt();
          ArrayList<Long> alist = new ArrayList<Long>(1000);
          ArrayList<Long> blist = new ArrayList<Long>(1000);
          ArrayList<Long> clist = new ArrayList<Long>(1000);
          for(int i = 0; i < a; i++){
            alist.add(getLong());
          }
          for(int i = 0; i < b; i++){
            blist.add(getLong());
          }
          for(int i = 0; i < c; i++){
            clist.add(getLong());
          }
          ArrayList<Long> maeList = new ArrayList<Long>(1000);
          for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
              maeList.add(alist.get(i) + blist.get(j));
            }
          }
          Collections.sort(maeList,Collections.reverseOrder());
          ArrayList<Long> atoList = new ArrayList<Long>(1000);
          for(int i = 0; i < Math.min(k,maeList.size()); i++){
            for(int j = 0; j < c; j++){
              atoList.add(maeList.get(i) + clist.get(j));
            }
          }
          Collections.sort(atoList,Collections.reverseOrder());
          for(int i = 0; i < k; i++){
            myout(atoList.get(i));
          }
        }
        //Method addition frame start

        //Method addition frame end
}
