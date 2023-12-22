import java.util.*;
public class Main {
        static Scanner sc = new Scanner(System.in);
        public static void myout(Object text){System.out.println(text);}
        public static String getStr(){return sc.next();}
        public static int getInt(){return sc.nextInt();}
        public static Long getLong(){return sc.nextLong();}
        public static boolean isNext(){return sc.hasNext();}
        public static void main(String[] args){
                //String tmp = getStr();
                //int tmp = getInt();
                //Long tmp = getLong();
          Long N = getLong();
          LinkedList<Long> list = getDivisorList(N);
          //myout(list);
          int tmpSize = list.size();
          Long A,B;
          if(tmpSize % 2 == 1){
            tmpSize++;
            A = list.get((tmpSize / 2) - 1) - 1;
            B = list.get((tmpSize / 2) - 1) - 1;
          }else{
            A = list.get(tmpSize / 2) - 1;
            B = list.get((tmpSize / 2) - 1) - 1;
          }
          //myout("A:" + A);
          //myout("B:" + B);
          myout(A + B);
          
          
          
        }
        //便利メソッド追加枠ここから
		public static LinkedList<Long> getDivisorList(Long val){
        LinkedList<Long> list = new LinkedList<Long>();
        for(Long i = new Long(1); i * i <= val; i++){
                if(val % i == 0){
                        list.add(i);
                        if(i * i != val){
                                list.add(val / i);
                        }
                }
        }
        Collections.sort(list, Comparator.naturalOrder());
        return list;
}
        //便利メソッド追加枠ここまで
}
