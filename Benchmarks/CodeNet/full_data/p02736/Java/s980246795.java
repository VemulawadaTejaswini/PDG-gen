import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int   N=in.nextInt();
        int a[]=new int[N];
        int i;int f;
        for(i=0;i<N;i++)
        {
            a[i]=in.nextInt();
        }
        while(N!=1)
        {
            f=0;
            for(i=0;i<N-1;i++)
            {
                a[i]=Math.abs(a[i]-a[i+1]);
                if(a[i]==0)
                f++;
            }
            if(f==N-1)
            break;
            N--;
        }
        System.out.println(a[0]);
    }
}


