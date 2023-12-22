//package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
//****Use Integer Wrapper Class for Arrays.sort()****
class Main {
    public static void main(String[] Args){
        FastReader scan=new FastReader();
        int n=scan.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++){
            arr[scan.nextInt()]++;
        }
        StringBuilder print=new StringBuilder();
        for(int i=1;i<=n;i++){
            print.append(arr[i]+" ");
        }
        System.out.println(print);
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
