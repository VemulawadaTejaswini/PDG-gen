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
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
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
        char s[]=cin.next().toCharArray();
        int a[]=new int[4001];
        int b[]=new int[4001];
        int c[]=new int[4001];
        long sum=0;
        if(s[0]=='R'){
            a[0]=1;
        }
        if(s[0]=='G'){
            b[0]=1;
        }
        if(s[0]=='B'){
            c[0]=1;
        }
        for(int i=1;i<n;i++){
            if(s[i]=='R'){
                a[i]=a[i-1]+1;
                b[i]=b[i-1];
                c[i]=c[i-1];
            }
            else if(s[i]=='G'){
                b[i]=b[i-1]+1;
                a[i]=a[i-1];
                c[i]=c[i-1];
            }
            else{
                c[i]=c[i-1]+1;
                a[i]=a[i-1];
                b[i]=b[i-1];
            }
        }


        for(int i=0;i<n;i++){
                int ans=i;
                for(int j=i+1;j<n;j++) {
                    if (s[j] != s[i]) {
                        ans = j;
                        if(ans==i||ans>n){
                            continue;
                        }
                        if((s[i]=='G'&&s[j]=='R')||(s[j]=='G'&&s[i]=='R')){
                            sum+=c[n-1]-c[ans-1];
                        }
                        else if((s[i]=='B'&&s[j]=='R')||(s[j]=='B'&&s[i]=='R')){
                            sum+=b[n-1]-b[ans-1];
                        }
                        else if((s[i]=='G'&&s[j]=='B')||(s[j]=='G'&&s[i]=='B')){
                            sum+=a[n-1]-a[ans-1];
                        }
                        if((2*ans-i)<n&&(s[2*j-i]!=s[j]&&s[2*j-i]!=s[i])){
                            sum--;
                        }
                    }
                }


        }
        System.out.println(sum);

    }
}
