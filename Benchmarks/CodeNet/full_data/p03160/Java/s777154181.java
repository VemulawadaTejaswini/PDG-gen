//package com.karancp;

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStream;


public class karan {
    public static void main(String args[])
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader z = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        task solver =new task();
        solver.solve(z,out);
        out.close();
    }

    static class task
    {

        static long gcd(long a,long b)
        {
            if(b==0)return a;
            else return gcd(b,a%b);
        }
        static long lcm(long a,long b)
        {
            long pp=a*b;
            long bb=gcd(a,b);
            long res =pp/bb;
            return res;
        }
        static int max(int a,int b)
        {
            return Math.max(a,b);
        }
        static int min(int a,int b)
        {
            return Math.min(a,b);
        }





        public static void solve(InputReader z, PrintWriter out) {
            int n=z.nextInt();
            int ar[]=new int[n];
            int dp[]=new int[n+1];
            int i;
            for(i=0;i<n;i++)ar[i]=z.nextInt();

            dp[1]=0;
            dp[2]=Math.abs(ar[0]-ar[1]);
            for(i=3;i<=n;i++)
            {
                int a=Math.abs(ar[i-2]-ar[i-1]);
                int b=Math.abs(ar[i-3]-ar[i-1]);
                dp[i]=Math.min(dp[i-1]+a,dp[i-2]+b);
            }
            out.print(dp[n]);


        }
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }

    }



}