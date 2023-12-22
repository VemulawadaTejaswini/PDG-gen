import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double ans=0;
        for(double i=n;i>0;i-=2)
        {
            double mod=0;
            if(i%10==mod)
            {
                ans++;
            }
        }
        System.out.println(ans);
        

    }
}