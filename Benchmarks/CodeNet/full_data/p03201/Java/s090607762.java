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
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
      while(isNext()){
        pq.add(getInt());
      }
      while(pq.size() != 0){
        int pqMax = pq.poll();
        int t = 0;
        for(int i = 1; i <= 31; i++){
          if(pqMax >= Math.pow(2,i) && pqMax < Math.pow(2,i+1)){
            t = i + 1;
            break;
          }
        }
        if(t != 0){
          int reqInt = (int)Math.pow(2,t) - pqMax;
          if(pq.contains(reqInt)){
            output++;
            pq.remove(reqInt);
          }
        }
      }
      myout(output);
	}
}
