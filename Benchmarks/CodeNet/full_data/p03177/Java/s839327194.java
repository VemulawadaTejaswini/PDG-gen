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
    public static int mod=1000000007;
    public static int n;
    public static class Matrix{
        long [][]a;
        public Matrix(){
            a=new long[n][n];
        }
    }
    public static Matrix mult(Matrix a,Matrix b){
        Matrix c=new Matrix();
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                for(int k=0;k<n;++k){
                    c.a[i][k]=(c.a[i][k]+a.a[i][j]*b.a[j][k])%mod;
                }
            }
        }
        return c;
    }

    public static Matrix poww(Matrix a,long b){
        Matrix r=new Matrix();
        for(int i=0;i<n;++i) r.a[i][i]=1;
        while(b>0){
            if(b%2==1){
                r=mult(r,a);
            }
            a=mult(a,a);
            b/=2;
        }
        return r;
    }

    public static FastReader r=new FastReader();
    public static void main(String[] args){
        n=r.nextInt();
        long k=r.nextLong();
        Matrix mat=new Matrix();
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                mat.a[i][j]=r.nextInt();
            }
        }
        mat=poww(mat,k);
        long ans=0;
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                ans=(ans+mat.a[i][j])%mod;
            }
        }
        System.out.println(ans);
    }
}
