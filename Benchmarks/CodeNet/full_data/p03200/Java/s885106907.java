import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      char[] c = sc.next().toCharArray();
      int n = c.length;
      int[] sum = new int[n];
      int ans = 0;
      if(c[0]=='B')sum[0]=1;
      else sum[0]=0;
      for(int i = 1;i < n;i++){
        if(c[i]=='B')sum[i]=sum[i-1]+1;
        else sum[i]=sum[i-1];
      }
      for(int i = 0;i < n;i++){
      	if(c[i]=='W')ans+=sum[i];
      }
      System.out.println(ans);
    }
}