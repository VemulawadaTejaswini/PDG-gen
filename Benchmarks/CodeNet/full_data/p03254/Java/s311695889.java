import java.util.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      int count = 0;
      int x = scn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.nextInt();
		}
      //欲しがっている数の合計
      int sum = 0;
      for (int i=0; i<a.length; ++i){
        sum = sum + a[i];
      }
      //お菓子の数がsumを超えた場合は全員に配れるが、最後の1人に多く配ってしまうので人数-1
      if(sum < x){
        if(n!=0){
        System.out.println(n-1);
        }
      }else{
        //欲しがってる数が少ない順に並べ替え
      Arrays.sort(a);
      for(int i=0; i<a.length; ++i){
        if(x>=a[i]){
          x = x - a[i];
          count = count + 1;
        }
      }
      System.out.println(count);
      }
	}
}
