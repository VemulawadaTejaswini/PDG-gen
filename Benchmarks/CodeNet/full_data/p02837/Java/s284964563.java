
import java.util.*;
import java.math.*;
import java.io.*;
public class Main
{
   
      
    public static void main(String args[]) 
    { 
         
        Scanner s=new Scanner(System.in);
        int count=0;
        int counttt=0;
        int countt=0;
        int n=s.nextInt();
        int a[][]=new int[n+1][2];
        for(int i=1;i<=n;i++)
        a[i][0]=1;
        for(int i=1;i<=n;i++)
        {int q=s.nextInt();
        boolean flag=false;
        for(int j=0;j<q;j++)
        {int x=s.nextInt();
        int y=s.nextInt();
        if(a[i][0]==1 && a[x][1]==0)
        {a[x][0]=y;a[x][1]=1;}
        else if(a[i][0]==1 && a[x][1]==1)
        {if(a[x][0]!=y)
        {flag=true;}
        }}
            if(flag)
            a[i][0]=0;
        }
        for(int i=1;i<=n;i++)
        {if(a[i][0]==1)
        count++;}
        System.out.println(count);}
        
    } 