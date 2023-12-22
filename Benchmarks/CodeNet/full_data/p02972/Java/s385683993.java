import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n+1];
      int[] b = new int[n+1];
      int m = 0;
      for(int i = 1;i <= n;i++)a[i]=sc.nextInt();
      for(int i = n;i >= 1;i--){
      	int x = 0;
        for(int j = i;j <= n;j+=i)x+=b[j];
        if(x%2==a[i])b[i]=0;
        else{
          b[i]=1;
          m++;
        }
      }
      System.out.println(m);
      for(int i = 1;i <= n;i++)if(b[i]==1)System.out.println(i);
    }
}