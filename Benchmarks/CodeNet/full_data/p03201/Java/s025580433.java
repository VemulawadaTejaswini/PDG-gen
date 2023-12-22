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
      int N = getInt();
      int output = 0;
      PriorityQueue<Long> pq = new PriorityQueue<Long>(Comparator.reverseOrder());
      while(isNext()){
        pq.add(getLong());
      }
      while(pq.size() != 0){
        Long pqMax = pq.poll();
        double t = Math.ceil(Math.log(pqMax) / Math.log(2));
        if(String.valueOf(t).toString().equals(".")){
          t++;
        }
        if(t != 0){
          Long reqInt = (int)Math.pow(2,t) - pqMax;
          if(pq.contains(reqInt)){
            output++;
            pq.remove(reqInt);
          }
        }
      }
      myout(output);
	}
}
