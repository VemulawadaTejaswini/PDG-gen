import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import  java.io.*;
import  java.math.*;
import java.nio.Buffer;
import java.sql.SQLSyntaxErrorException;
import  java.util.*;
import  java.text.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Main {
    public static boolean gcd(int a,int b){
        if(a==1||b==1){
            return false;
        }
        while(1>0){
            int t = a%b;
            if(t == 0){
                break;
            }
            else{
                a=b;
                b=t;
            }

        }
        if(b>1)	return true;
        else{
            return  false;
        }
    }
    static class kNight implements Comparable<kNight>{
        int p;
        int c;
        kNight(int p,int c){
            this.p=p;
            this.c=c;
        }
        @Override
        public int compareTo(kNight k) {
            if(p==k.p){
                return c-k.c;
            }
            else{
                return p-k.p;
            }
        }


    }
    static class FastReader
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
    public static void main(String[] args) {
        FastReader cin=new FastReader();
        int n=cin.nextInt();
        boolean flag=true;
        while(n>0){
            int x=n%10;
            if(x==7){
                System.out.println("Yes");
                return;
            }
            n=n/10;
        }
        System.out.println("No");

    }
}
