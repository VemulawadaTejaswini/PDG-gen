//created by Whiplash99
import java.io.*;
import java.util.*;

public class Main
{
    private static int countFactors(long N)
    {
        int ans=1;
        for (long i = 2; i * i <= N; i++)
        {
            int count=0;
            while (N%i==0)
            {
                N /=i;
                count++;
            }
            ans*=(count+1);
        }
        return N>1?ans*2:ans;
    }
    private static int check(long N, long fact)
    {
        while (N%fact==0) N/=fact;
        return N%fact==1?1:0;
    }
    private static int solve(long N)
    {
        int ans=0;

        for(long i=2;i*i<=N;i++)
        {
            if(N%i==0)
            {
                ans += check(N, i);
                if(i*i!=N) ans+=check(N,N/i);
            }
        }
        return ans+1;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        long N=Long.parseLong(br.readLine().trim());
        int ans=solve(N)+countFactors(N-1)-1;

        System.out.println(ans);
    }
}