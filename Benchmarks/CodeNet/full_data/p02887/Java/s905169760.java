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
        int n=sc.nextInt();
        String s =sc.next();
        String ss[]=new String[n];
        for (int i=0;i<n;++i) ss[i]=s.substring(i,i+1);

        String ans = "";
        int p=0;
        for (int i=0;i<n-1;++i)
        {
            if (!ss[i].equals(ss[i+1]))
            {
                ans+=ss[i];
                ++p;
            }
        }

        if (!ss[n-1].equals(ss[n-2]))
        {
            ans+=ss[n-1];
        }

        if (p==0)
        {
            System.out.println(1);
        }else
        {
            System.out.println(ans.length());
        }
        sc.close();
    }
}