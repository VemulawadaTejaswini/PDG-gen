import java.util.*;
public class Main {
    public static int mini(int a[],int n,int j,int sum)
    {
        if(j==n-1)
        {
            return sum;
        }
        // if(j>n)
        // {
        //     return Integer.MAX_VALUE;
        // }
        int r=Integer.MAX_VALUE;
        int s=Integer.MAX_VALUE;
        if(j+2<=n-1)
        {
            r=mini(a,n,j+2,sum+(Math.abs(a[j+2]-a[j])));
        }
        if(j+1<=n-1)
        {
             s=mini(a,n,j+1,sum+(Math.abs(a[j+1]-a[j])));
        }
        return Math.min(r,s);
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println(mini(a,n,0,0));
    }
}