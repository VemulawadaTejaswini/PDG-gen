import java.util.*;
public class Main {
    static int MOD = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		//Long tmp = sc.nextLong();
      int add = 0;
      int N = sc.nextInt();
      ArrayList<Integer> aList = new ArrayList<Integer>(N);
      ArrayList<Integer> bList = new ArrayList<Integer>(N);
      while(sc.hasNext()){
        aList.add(sc.nextInt());
        bList.add(sc.nextInt());
      }
      for(int i = N - 1; i >= 0; i--){
        int tmpA = aList.get(i) + add;
        int tmpB = bList.get(i);
        //System.out.println(tmpA + " " + tmpB);
        if(tmpA % tmpB != 0){
          add += tmpB - (tmpA % tmpB);
          //System.out.println(add);
        }else if(tmpA == 0){
          add += tmpB;
        }
      }
      System.out.println(add);
	}
}
