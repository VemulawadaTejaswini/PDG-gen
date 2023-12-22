import java.util.*;
public class Main
{
    static int gcd(int b,int a)
    {
        if(b%a==0)
        return a;
        return gcd(a,b%a);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        int mat=1,cntr=0,j=0;
        boolean b=true;
        for(int i=0;i<n;i++)
        {
            if(ar[i]==mat)
            {
                mat++;
                cntr+=(i-j);
                j=i+1;
                b=false;
            }
        }
        if(j!=n)
        cntr+=(n-j);
        if(!b)
        System.out.println(cntr);
        else
        System.out.println("-1");
    }
}