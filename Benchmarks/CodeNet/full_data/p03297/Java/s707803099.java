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
        static String toKaigyo(String[] list){return String.join("\n",list);}
        static String toKaigyo(ArrayList<String> list){return String.join("\n",list);}
        static String toHanSp(String[] list){return String.join(" ",list);}
        static String toHanSp(ArrayList<String> list){return String.join(" ",list);}
        public static void main(String[] args){
          int N = getInt();
          for(int i = 0; i < N; i++){
            long a = getLong();
            long initA = a;
            long b = getLong();
            long c = getLong();
            long d = getLong();
            boolean noFlag = false;
            int count = 0;
            while(true){
      count++;
      if(a < b){
        noFlag = true;
        	break;
   		 }
      a = a % b;
      if(a <= c){
           a += d;
      }
      if(a == initA || count >= 1000000){
           break;
      }
    }
    if(noFlag){
       myout("No");
    }else{
      myout("Yes");
    }
          }
        }
        //Method addition frame start

        //Method addition frame end
}
