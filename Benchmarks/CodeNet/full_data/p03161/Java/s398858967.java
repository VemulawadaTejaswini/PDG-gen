import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long solve[] = new long[100001];
    public static int a[] = new int[100001];
    public static long n,k;
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nk[]=br.readLine().split(" ");
        n=Long.parseLong(nk[0]);
        k=Long.parseLong(nk[1]);
        for(int i=0;i<n-1;i++)
            solve[i]=-1;
        solve[(int)n-1]=0;
        String S[]=br.readLine().split(" ");
        for(int i=0;i<n;i++)
            a[i]=Integer.parseInt(S[i]);
        System.out.println(DP(0));
    }
    public static long DP(int x)
    {
        if(solve[x]==-1)
        {
            long minVal= Long.MAX_VALUE;
            long tempVal;
            for(int i=x+1;i<=x+k&&i<n;i++)
            {
                tempVal=DP(i)+(Math.abs(a[x]-a[i]));
                if(tempVal<minVal)
                    minVal=tempVal;
            }
            solve[x]=minVal;
        }
        return solve[x];
    }
}