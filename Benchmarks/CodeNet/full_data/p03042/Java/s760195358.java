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


 class Main {
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
          String s=z.next();
          String a="";a+=s.charAt(0);a+=s.charAt(1);
          String b="";
          b+=s.charAt(2);b+=s.charAt(3);
          //out.println(a+" "+b);
          int aa=Integer.valueOf(a);
          int bb=Integer.valueOf(b);
          if(aa==0&&bb==0)
          {
              out.println("NA");
          }
          else if(aa==0)
          {
              if(bb<=12)
              {
                  out.println("YYMM");
              }
              else
              {
                  out.println("NA");
              }
          }
          else if(bb==0)
          {
              if(aa<=12)
              {
                  out.print("MMYY");
              }
              else out.println("NA");
          }
          else if(aa>12&&bb<=12)
          {
              out.println("YYMM");
          }
          else if(aa<=12&&bb<=12)
          {
              out.println("AMBIGUOUS");
          }
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