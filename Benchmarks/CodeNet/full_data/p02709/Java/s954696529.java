//package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
//****Use Integer Wrapper Class for Arrays.sort()****
public class Main {
    public static void main(String[] Args){
        FastReader scan=new FastReader();
        int n=scan.nextInt();
        long[] arr=new long[n];
        boolean[] done=new boolean[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int l=0;
        int r=n-1;
        long ans=0;
        for(int i=0;i<n;i++){
            int in=-1;
            long max=Long.MIN_VALUE;
            boolean ri=true;
            for(int j=0;j<n;j++){
                if(!done[j]){
                    long lmax=arr[j]*Math.abs(j-l);
                    long rmax=arr[j]*Math.abs(r-j);
                    if(lmax>max){
                        max=lmax;
                        in=j;
                        ri=false;
                    }if(rmax>max){
                        max=rmax;
                        in=j;
                        ri=true;
                    }
                }
            }
            ans+=max;
            done[in]=true;
            if(ri){
                r--;
            }else{
                l++;
            }
        }
        System.out.println(ans);
    }
    static class FastReader {
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
                catch (IOException  e)
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

}
