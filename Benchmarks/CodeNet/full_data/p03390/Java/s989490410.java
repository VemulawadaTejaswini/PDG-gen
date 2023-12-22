import java.util.*;
class saptarshi_11740860_5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //int t=sc.nextInt();
        int t=1;
        while(t-->0)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long s=a*b-1;
            long m=a*b;
            long c=0,i,k=s,flag=0;
            for(i=1;i<=s&&k>0;i++)
            {
                if(i==a)
                    continue;
                else if(k==b)
                {
                    k--;
                    i--;
                    continue;
                }
                if(i*k<m)
                {
                    //System.out.println(i+" "+k);
                    c++;
                    k--;
                }
                else
                {
                    //System.out.println(i+" "+k);
                    i--;
                    k--;
                }
            }
            System.out.println(c);
        }
    }
}