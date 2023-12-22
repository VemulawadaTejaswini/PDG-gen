import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        //Compute c1 = new Compute();//calc

        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //StringBuilder answer=new StringBuilder();

        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long b[]=new long[n-1];
        for (int i=0;i<n-1;++i) b[i]=sc.nextLong();

        long ans[]=new long[n];
        for (int i=n-1;i>0;--i)
        {
            if (i==n-1)
            {
                ans[i]=b[i-1];
            }else
            {
                if (b[i-1]>b[i])
                {
                    long tmp= Math.min(b[i-1],b[i]);
                    ans[i]=tmp;
                }else
                {
                    long tmp=Math.min(b[i-1],b[i]);
                    ans[i]=tmp;
                }
            }
        }

        ans[0]=Math.max(ans[1],b[0]);

        //System.out.println(Arrays.toString(ans));
        long aa=0;
        for (int i=0;i<ans.length;++i)
        {
            aa+=ans[i];
        }
        System.out.println(aa);
    }
}