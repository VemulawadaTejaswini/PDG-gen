import java.util.*;
import java.io.*;

class Key
{
    int cost;
    int mask;
    public Key(int cost,int mask)
    {
        this.cost=cost;
        this.mask=mask;
    }
}

public class Main 
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        int boxes,keys;
        boxes=s1.nextInt();
        keys=s1.nextInt();
        
        Key arr1=new Key[keys];
        int cost,mask1,size,store;
        for(int i=0;i<keys;i++)
        {
            cost=s1.nextInt();
            size=s1.nextInt();
            mask1=0;
            while(size>0)
            {
                size--;
                store=s1.nextInt();
                store--;
                mask1=mask1|(1<<store);
            }
            arr1[i]=new Key(cost,mask1);
        }
        int dp[1<<boxes];
        for(int i=0;i<(1<<boxes);i++)
        {
            dp[i]=1000000000;
        }
        dp[0]=0;
        for(int i=0;i<(1<<boxes);i++)
        {
            for(int j=0;j<keys;j++)
            {
                dp[i|arr1[j].mask]=Math.min(dp[i|arr1[j].mask],dp[i]+arr1[j].cost);
            }
        }
        int ans=dp[(1<<boxes)-1];
        if(ans==1000000000)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print(ans);
        }
    }
    return 0;
}