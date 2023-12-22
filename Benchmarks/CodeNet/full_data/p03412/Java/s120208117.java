import java.math.BigInteger;
import java.util.*;
 
public class Main {
 
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n + 1];
        int b[] = new int[n + 1];
        for (int i = 1; i <= n; i++)
            a[i] = in.nextInt();
 
        for (int i = 1; i <= n; i++) {
            b[i] = in.nextInt();
        }
        int sum=0;int ans=0;int cnt=0;
          for(int i=1;i<=n;i++)
              for(int j=1;j<=n;j++)
              {
                  sum=a[i]+b[j];
                  cnt++;
                  if(cnt==1)ans=sum+0;
                  else
                  ans^=sum;
              }
              System.out.println(ans);
 
    }