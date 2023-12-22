//package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
//****Use Integer Wrapper Class for Arrays.sort()****
public class BA4 {
    public static void main(String[] Args){
        FastReader scan=new FastReader();
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        StringBuilder ans=new StringBuilder();
//        if(a-b>1||d-c>1){
//            System.out.println("NO");
//        }
//        else if(a>b){
//            if(c!=0&&d!=0) {
//                System.out.println("NO");
//            }
//            else{
//                System.out.println("YES");
//                int co=0;
//                while(a>0||b>0){
//                    if(co%2==0){
//                        ans.append("0 ");
//                        a--;
//                    }
//                    else{
//                        ans.append("1 ");
//                        b--;
//                    }
//                    co++;
//                }
//            }
//            System.out.println(ans);
//        }
//        else if(d>c){
//            if(a!=0&&b!=0) {
//                System.out.println("NO");
//            }
//            else{
//                System.out.println("YES");
//                int co=0;
//                while(c>0||d>0){
//                    if(co%2==0){
//                        ans.append("3 ");
//                        d--;
//                    }
//                    else{
//                        ans.append("2 ");
//                        c--;
//                    }
//                    co++;
//                }
//                System.out.println(ans);
//            }
//        }
//        else{
//            int flag=1;
            int ta=a;
            int tb=b;
            int tc=c;
            int td=d;
            int co=0;
            while(a>0){
                if(co%2==0) {
                    ans.append("0 ");
                    a--;
                }
                else{
                    ans.append("1 ");
                    b--;
                }
                co++;
            }
            co=0;
            if(c>0||d>0){
                ans.append("1 ");
                b--;
                co=1;
            }
            while(b>0){
                if(co%2==0) {
                    ans.append("1 ");
                    b--;
                }
                else{
                    ans.append("2 ");
                    c--;
                }
                co++;
            }
            co=0;
            if(d>0){
                ans.append("2 ");
                c--;
                co=1;
            }
            while(c>0){
                if(co%2==0) {
                    ans.append("2 ");
                    c--;
                }
                else{
                    ans.append("3 ");
                    d--;
                }
                co++;
            }
            if(d>0){
                ans.append("3 ");
                d--;
            }
            if(a==0&&b==0&&c==0&&d==0){
                System.out.println("YES");
                System.out.println(ans);
            }
            else{
                ans=new StringBuilder();
                a=ta;
                b=tb;
                c=tc;
                d=td;
                co=0;
                while(a>0){
                    if(co%2==0) {
                        ans.append("1 ");
                        b--;
                    }
                    else{
                        ans.append("0 ");
                        a--;
                    }
                    co++;
                }
                co=0;
                if(c>0||d>0){
                    ans.append("1 ");
                    b--;
                    co=1;
                }
                while(b>0){
                    if(co%2==0) {
                        ans.append("1 ");
                        b--;
                    }
                    else{
                        ans.append("2 ");
                        c--;
                    }
                    co++;
                }
                co=0;
                if(d>0){
                    ans.append("2 ");
                    c--;
                    co=1;
                }
                while(c>0){
                    if(co%2==0) {
                        ans.append("2 ");
                        c--;
                    }
                    else{
                        ans.append("3 ");
                        d--;
                    }
                    co++;
                }
                if(d>0){
                    ans.append("3 ");
                    d--;
                }
                if(a==0&&b==0&&c==0&&d==0){
                    System.out.println("YES");
                    System.out.println(ans);
                }
                else{
                    ans=new StringBuilder();
                    a=ta;
                    b=tb;
                    c=tc;
                    d=td;
                    co=0;
                    while(d>0){
                        if(co%2==0) {
                            ans.append("2 ");
                            c--;
                        }
                        else{
                            ans.append("3 ");
                            d--;
                        }
                        co++;
                    }
                    co=0;
                    if(b>0||a>0){
                        ans.append("2 ");
                        c--;
                        co=1;
                    }
                    while(c>0){
                        if(co%2==0) {
                            ans.append("2 ");
                            c--;
                        }
                        else{
                            ans.append("1 ");
                            b--;
                        }
                        co++;
                    }
                    co=0;
                    if(a>0){
                        ans.append("1 ");
                        b--;
                        co=1;
                    }
                    while(b>0){
                        if(co%2==0) {
                            ans.append("1 ");
                            b--;
                        }
                        else{
                            ans.append("0 ");
                            a--;
                        }
                        co++;
                    }
                    if(a>0){
                        ans.append("0 ");
                        a--;
                    }
                    if(a==0&&b==0&&c==0&&d==0){
                        System.out.println("YES");
                        System.out.println(ans);
                    }
                    else{
                        ans=new StringBuilder();
                        a=ta;
                        b=tb;
                        c=tc;
                        d=td;
                        co=0;
                        while(d>0){
                            if(co%2==0) {
                                ans.append("3 ");
                                d--;
                            }
                            else{
                                ans.append("2 ");
                                c--;
                            }
                            co++;
                        }
                        co=0;
                        if(b>0||a>0){
                            ans.append("2 ");
                            c--;
                            co=1;
                        }
                        while(c>0){
                            if(co%2==0) {
                                ans.append("2 ");
                                c--;
                            }
                            else{
                                ans.append("1 ");
                                b--;
                            }
                            co++;
                        }
                        co=0;
                        if(a>0){
                            ans.append("1 ");
                            b--;
                            co=1;
                        }
                        while(b>0){
                            if(co%2==0) {
                                ans.append("1 ");
                                b--;
                            }
                            else{
                                ans.append("0 ");
                                a--;
                            }
                            co++;
                        }
                        if(a>0){
                            ans.append("0 ");
                            a--;
                        }
                        if(a==0&&b==0&&c==0&&d==0){
                            System.out.println("YES");
                            System.out.println(ans);
                        }
                        else{
                            System.out.println("NO");
                        }
                    }
                }
            }
//        }
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
