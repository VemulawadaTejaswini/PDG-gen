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
      Long output = new Long(0);
      int N = getInt();
      LinkedList<Integer> list = new LinkedList<Integer>();
      LinkedList<Integer> nextList = new LinkedList<Integer>();
      for(int i = 0; i < N; i++){
        list.add(getInt());
      }
      Collections.sort(list);
      nextList.add(list.pollFirst());
      int count = 0;
      while(list.size() != 0){
        if(count % 2 == 0){
          nextList.addLast(list.pollLast());
          if(list.size() == 0){break;}
          nextList.addFirst(list.pollLast());
        }else{
          nextList.addLast(list.pollFirst());
          if(list.size() == 0){break;}
          nextList.addFirst(list.pollFirst());
        }
        count++;
      }
      
      int[] last = new int[N];
      count = 0;
      while(nextList.size() != 0){
        last[count] = nextList.pollFirst();
        count++;
      }
      for(int i = 0; i < last.length - 1; i++){
        int mae = last[i];
        int ato = last[i+1];
        output += Math.abs(mae - ato);
      }
      myout(output);
      
	}
}
