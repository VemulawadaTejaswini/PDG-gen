/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
/**
 *
 * @author arvin
 */
public class Main {
    
    static int a[][]=new int[23][23];
    static int n;
    static long ch[]=new long[42000000];
    static int women[]=new int[23];
    static HashMap<Long,Long> hp=new HashMap<>();
    
    static long rec(int i,long k)
    {
        if(i==n)
            return 1l;
        //long val=hp.getOrDefault(k,-1l);
        long val=ch[(int)k];
        if(val!=0l)
            return val;
        
        
        long x=0l;
        for(int z=1;z<=n;z++)
        {
            if(a[i+1][z]==1 && women[z]!=1)
            {
                //System.out.println((i+1)+" "+z);
                women[z]=1;
                
                long tm=((long)k|(long)(1<<z));
                //val=hp.getOrDefault(tm,-1l);
                val=ch[(int)tm];
                if(val!=0l)
                    x+=val;
                else
                {
                    long v=rec(i+1,tm);
                    v=v%1000000007l;
                    x+=v;
                    ch[(int)tm]=v;
                    //hp.put(tm,v);
                }
                x=x%1000000007l;
                women[z]=0;
            }
        }
        x=x%1000000007l;
        return x;
    }
    
    public static void main(String args[]) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
            String ab[]=br.readLine().split(" ");
            for(int j=1;j<=n;j++)
                a[i][j]=Integer.parseInt(ab[j-1]);
        }
        
        long t=0l;
        for(int i=1;i<=n;i++)
        {
            if(a[1][i]==1)
            {
                women[i]=1;
                long tm=(long)1<<i;
                //long val=hp.getOrDefault(tm,-1l);
                long val=ch[(int)tm];
                if(val!=0l)
                    t+=val;
                else
                {
                    long v=rec(1,tm);
                    v=v%1000000007l;
                    ch[(int)tm]=v;
                    //hp.put(tm,v);
                    t+=v;
                }
                t=t%1000000007l;
                women[i]=0;
            }
        }
        t=t%1000000007l;
        System.out.println(t);
    }
}
