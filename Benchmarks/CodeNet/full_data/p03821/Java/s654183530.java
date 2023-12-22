import java.util.*;
public class Main {
    static int MOD = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      Long add = new Long(0);
      int N = sc.nextInt();
      ArrayList<Long> aList = new ArrayList<Long>(N);
      ArrayList<Long> bList = new ArrayList<Long>(N);
      while(sc.hasNext()){
        aList.add(sc.nextLong());
        bList.add(sc.nextLong());
      }
      for(int i = N - 1; i >= 0; i--){
        Long tmpA = aList.get(i) + add;
        Long tmpB = bList.get(i);
        //System.out.println(tmpA + " " + tmpB);
        add += tmpB - (tmpA % tmpB);
      }
      System.out.println(add);
	}
}
