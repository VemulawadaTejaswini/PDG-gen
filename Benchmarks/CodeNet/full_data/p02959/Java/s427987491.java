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
      
      for(int i = 0;i < n;i++){
      	int x = Math.min(a[i],b[i]);
        cnt += x;
        a[i] -= x;
        b[i] -= x;
        int y = Math.min(a[i+1],b[i]);
        cnt += y;
        a[i+1] -= y;
        b[i] -= y;
      }
      System.out.println(cnt);
    }
}