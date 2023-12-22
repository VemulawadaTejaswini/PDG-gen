//created by Whiplash99
import java.io.*;
import java.util.*;
import java.util.function.BiPredicate;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i,N;

        String s[]=br.readLine().trim().split(" ");
        N=Integer.parseInt(s[0]);
        int K=Integer.parseInt(s[1]);
        int C=Integer.parseInt(s[2]);

        char str[]=br.readLine().trim().toCharArray();

        int left[]=new int[N];
        int right[]=new int[N];
        int l[]=new int[N];
        int r[]=new int[N];

        int prev=-C-10;
        int cur=0;

        for(i=0;i<N;i++)
        {
            if(str[i]=='x') continue;

            left[i]=cur;
            l[i]=prev;
            if(i-prev>C)
            {
                prev=i;
                cur++;
            }
        }

        prev=N+C+10;
        cur=0;
        for(i=N-1;i>=0;i--)
        {
            if(str[i]=='x') continue;

            right[i]=cur;
            r[i]=prev;
            if(prev-i>C)
            {
                prev=i;
                cur++;
            }
        }

        StringBuilder sb=new StringBuilder();
        for(i=0;i<N;i++)
        {
            if(str[i]=='x') continue;
            int count=left[i]+right[i];
            if(r[i]-l[i]<=C) count--;

            if(count<K) sb.append(i+1).append("\n");
        }

        System.out.println(sb);
    }
}