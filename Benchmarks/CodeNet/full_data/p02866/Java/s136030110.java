import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
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
        List<Integer> d = new ArrayList<>();
        Map<Integer,Integer> countMap = new HashMap<>();
        for (int i=0;i<n;++i)
        {
            int dd=sc.nextInt();
            d.add(dd);
            if (dd > max)
            {
                max = dd;
            }

            if (countMap.get(dd) == null)
            {
                countMap.put(dd,1);
            }else
            {
                int a = countMap.get(dd);
                ++a;
                countMap.put(dd,a);
            }

            if (i!=0 && dd == 0)
            {
                System.out.println(0);
                sc.close();
                System.exit(0);
            }
        }

        for (int i = 0;i < max;++i)
        {
            if (!d.contains(i))
            {
                System.out.println(0);
                sc.close();
                System.exit(0);
            }
        }

        List<Integer> list = new ArrayList<>();
        int b = -1;//上の頂点数
        for (int i=1;i<=max;++i)
        {
            //System.out.println("i = "+i);
            if (countMap.get(i) == null)
            {
                System.out.println(0);
                sc.close();
                System.exit(0);
            }else
            {
                int a = countMap.get(i);//その深さの頂点数
                if (b == -1)
                {
                    int c = i-1;
                    b = countMap.get(c);
                }
                double c = Math.pow((double)b,(double)a);
                //System.out.println("a = "+a+" b = "+b+" c = "+c);
                list.add((int)c);
                b = a;
            }
        }

        int ans = 1;
        for (int a:list)
        {
            ans *= a;
        }

        System.out.println(ans);
        sc.close();
    }
}