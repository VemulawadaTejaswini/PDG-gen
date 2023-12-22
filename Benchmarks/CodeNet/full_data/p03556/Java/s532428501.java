import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
	Scanner scn = new Scanner(System.in);
	int x = scn.nextInt();
      int num = 0;
      int ans = 0;
      int[] a = new int[1000000];
      for(int i=0; i<a.length; ++i){
        a[i]= num * num;
        num = num +1;
      }
      for(int i=0; i<a.length; ++i){
        if(x>=a[i]){
          ans = a[i];
        }
      }
      System.out.println(ans);
	}
}
