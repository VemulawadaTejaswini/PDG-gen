import java.io.*;
import java.math.BigInteger;
import java.util.*;

import java.util.StringTokenizer;
public class Main{

    public static void main (String[]args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        long[]powers2= new long[n];
        int mod=(int)(1e9)+7;
        powers2[0]=1;
        for (int i =1;i<n;i++){
            powers2[i]=(powers2[i-1]%mod)*2;
            powers2[i]%=mod;
        }
        String s = sc.nextLine();
        HashSet<Character>oc = new HashSet<>();
        int[] count = new int[26];
        long ans =0;
        for (int i =0;i<n;i++){
            char c = s.charAt(i);
            int power=oc.size();
            if (oc.contains(c))
                power--;
            ans=ans%mod+powers2[power]%mod;
            for (char x:oc){
                if (x!=c&&count[x-'a']>1){
                    ans=ans%mod+((1l*count[x-'a']-1)*(powers2[power]%mod-powers2[power-1]%mod))%mod;
                    ans%=mod;
                }
            }
            ans%=mod;
            count[c-'a']++;
            oc.add(c);
        }
        pw.println(ans);
        pw.flush();
    }
    static class Scanner
    {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

        public String next() throws IOException
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {return Integer.parseInt(next());}

        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}

        public double nextDouble() throws IOException
        {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if(x.charAt(0) == '-')
            {
                neg = true;
                start++;
            }
            for(int i = start; i < x.length(); i++)
                if(x.charAt(i) == '.')
                {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                }
                else
                {
                    sb.append(x.charAt(i));
                    if(dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg?-1:1);
        }

        public boolean ready() throws IOException {return br.ready();}


    }
}