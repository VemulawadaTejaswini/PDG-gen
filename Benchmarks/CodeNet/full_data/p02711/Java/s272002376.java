//package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
//****Use Integer Wrapper Class for Arrays.sort()****
 class Main {
    public static void main(String[] Args){
        FastReader scan=new FastReader();
        int n=scan.nextInt();
        boolean flag=false;
        while(n!=0){
            int dig=n%10;
            if(dig==7){
                flag=true;
            }
            n/=10;
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
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
