import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void solve(int id,ArrayList<Integer> tmp,long point,int mask,int add){
        if(id==tmp.size()){
            dp[mask]=Math.max(dp[mask],point+pre[add]);
            return;
        }
        solve(id+1,tmp,point,mask,add);
        solve(id+1,tmp,point,mask^(1<<tmp.get(id)),add^(1<<tmp.get(id)));
    }
    public static final long inf=1000000000000000009l;
    public static int n;
    public static long [][]a=new long[20][20];
    public static long []pre=new long[1<<20];
    public static long []dp=new long[1<<20];
    public static FastReader r=new FastReader();
    public static void main(String[] args){
        n=r.nextInt();
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                a[i][j]=r.nextInt();
            }
        }
        for(int mask=0;mask<(1<<n);++mask){
            for(int i=0;i<n;++i){
                if((mask&(1<<i))>0){
                    for(int j=i+1;j<n;++j){
                        if((mask&(1<<j))>0){
                            pre[mask]+=a[i][j];
                        }
                    }
                }
            }
        }
//        for(int mask=0;mask<(1<<n);++mask){
//            System.out.println("pre : "+pre[mask]);
//        }
        for(int mask=0;mask<(1<<n);++mask){
            dp[mask]=-inf;
        }
        dp[0]=0;
        for(int mask=0;mask<(1<<n);++mask){
            ArrayList<Integer> tmp=new ArrayList<>();
            for(int i=0;i<n;++i){
                if((mask&(1<<i))==0){
                    tmp.add(i);
                }
            }
            solve(0,tmp,dp[mask],mask,0);
        }
        System.out.println(dp[(1<<n)-1]);
    }
}
