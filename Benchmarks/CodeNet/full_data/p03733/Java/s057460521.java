import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
      int t = scn.nextInt();
      int[] a = new int[n];
      for(int i=0; i<a.length; ++i){
        a[i] = scn.nextInt();
      }
      int[] b = new int[n];
      for(int i=0; i<b.length; ++i){
        b[i] = a[i] - a[(i-1)] ;
      }
      int count = 0;
      for(int i=0; i<b.length; ++i){
        if(b[i] <= t){
          count = count + b[i];
        }else{
          count = count + t;
        }
      }
      int ans = count + t;
      System.out.println(ans);
	}
}
