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
        int h=sc.nextInt();
        int w=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        String no="No";

        int s[][]=new int[h][w];
        int hc[]=new int[h];
        int wc[]=new int[w];
        for (int i=0;i<h;++i) hc[i]=0;
        for (int i=0;i<w;++i) wc[i]=0;

        if (a==0 && b==0)
        {
            for (int i=0;i<h;++i)
            {
                for (int j=0;j<w;++j)
                {
                    s[i][j]=0;
                }
            }
            out(s);
            System.exit(0);
        }

        if (a==0)
        {
            for (int i=0;i<h;++i)
            {
                for (int j=0;j<w;++j)
                {
                    if (wc[j]<b)
                    {
                        s[i][j]=1;
                        ++wc[j];
                    }else
                    {
                        s[i][j]=0;
                    }
                }
            }
        }else if (b==0)
        {
            for (int i=0;i<h;++i)
            {
                for (int j=0;j<w;++j)
                {
                    if (hc[i]<a)
                    {
                        s[i][j]=1;
                        ++hc[i];
                    }else
                    {
                        s[i][j]=0;
                    }
                }
            }
        }else
        {
            for (int i=0;i<h;++i)
            {
                for (int j=0;j<w;++j)
                {
                    if (hc[i]<a && wc[j]<b)
                    {
                        s[i][j]=1;
                        ++hc[i];
                        ++wc[j];
                    }else
                    {
                        s[i][j]=0;
                    }
                }
            }
        }
        //out(s);
        //yoko
        for (int i=0;i<h;++i)
        {
            int c=0;
            for (int j=0;j<w;++j)
            {
                if (s[i][j]==1) ++c;
            }

            if (c!=a)
            {
                if (a!=0)
                {
                    System.out.println(no);
                    System.exit(0);
                }
            }
        }

        //System.out.println("============");
        //tate
        for (int i=0;i<w;++i)
        {
            int c=0;
            for (int j=0;j<h;++j)
            {
                if (s[j][i]==1) ++c;
            }

            if (c!=b)
            {
                if (b!=0)
                {
                    System.out.println(no);
                    System.exit(0);
                }
            }
        }

        out(s);
    }

    public static void out(int p[][])
    {
        for (int i=0;i<p.length;++i)
        {
            for (int j=0;j<p[i].length;++j)
            {
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }
    }
}