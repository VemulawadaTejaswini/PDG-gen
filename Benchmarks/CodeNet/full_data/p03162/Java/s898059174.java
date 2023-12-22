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


 class Main{
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
            int ar[][]=new int[n][3];
            int i;int j;
            for(i=0;i<n;i++)
            {
                for(j=0;j<3;j++)ar[i][j]=z.nextInt();
            }
            int dp[][]=new int[n+1][4];
            dp[1][1]=ar[0][0];
            dp[1][2]=ar[0][1];
            dp[1][3]=ar[0][2];
            for(i=2;i<=n;i++)
            {
                dp[i][1]=ar[i-1][0]+max(dp[i-1][2],dp[i-1][3]);
                dp[i][2]=ar[i-1][1]+max(dp[i-1][1],dp[i-1][3]);
                dp[i][3]=ar[i-1][2]+max(dp[i-1][1],dp[i-1][2]);
                //out.println(min(dp[i][1],min(dp[i][2],dp[i][3])));
                //out.println(dp[i][1]+" "+dp[i][2]+" "+dp[i][3]);
            }
            out.print(max(dp[n][1],max(dp[n][2],dp[n][3])));
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