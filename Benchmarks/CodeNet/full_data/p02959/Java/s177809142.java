import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n+1];
      int[] b = new int[n];
      int cnt = 0;
      for(int i = 0;i < n+1;i++)a[i] = sc.nextInt();
      for(int i = 0;i < n;i++)b[i] = sc.nextInt();
      
      cnt += Math.min(a[0],b[0]);
      if(b[0] > a[0]) a[1] = Math.max(a[1]-(b[0]-a[0]),0);
      
      for(int i = 1;i < n;i++){
      	cnt += Math.min(a[i],b[i]);
        if(b[i] > a[i]){
          cnt += Math.min(b[i]-a[i],a[i+1]);
          a[i+1]= Math.max(a[i+1]-(b[i]-a[i]),0);
        }
      }
      System.out.println(cnt);
    }
}