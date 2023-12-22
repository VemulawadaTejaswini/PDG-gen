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
          long output = 0;
          HashMap<String,Integer> hm = new HashMap<String,Integer>();
          hm.put("M",0);
          hm.put("A",0);
          hm.put("R",0);
          hm.put("C",0);
          hm.put("H",0);
          for(int i = 0; i < N; i++){
            String tmp = getStr().substring(0,1);
            if(hm.containsKey(tmp)){
              hm.put(tmp,hm.get(tmp) + 1);
            }
          }
          myerr(hm);
          ArrayList<String> keys = new ArrayList<String>();
          keys.add("M");
          keys.add("A");
          keys.add("R");
          keys.add("C");
          keys.add("H");
          for(int i = 0; i < keys.size() - 2; i++){
            for(int j = i + 1; j < keys.size() - 1; j++){
              for(int k = j + 1; k < keys.size(); k++){
                myerr(hm.get(keys.get(i)));
                myerr(hm.get(keys.get(j)));
                myerr(hm.get(keys.get(k)));
                output += hm.get(keys.get(i)) * hm.get(keys.get(j)) * hm.get(keys.get(k));
              }
            }
          }
          myout(output);
        }
        //Method addition frame start

        //Method addition frame end
}
