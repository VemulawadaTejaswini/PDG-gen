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
        //List<Integer> d = new ArrayList<>();
        Map<Integer,Long> countMap = new HashMap<>();

        for (int i=0;i<n;++i)
        {
            int dd=sc.nextInt();

            if (dd > max)
            {
                max = dd;
            }

            if (countMap.get(dd) == null)
            {
                long a = 1;
                countMap.put(dd,a);
            }else
            {
                long a = countMap.get(dd);
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
            if (!countMap.containsKey(i))
            {
                System.out.println(0);
                sc.close();
                System.exit(0);
            }
        }

        List<Long> list = new ArrayList<>();
        long b = -1;//上の頂点数
        long ans = 1;
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
                long a = countMap.get(i);//その深さの頂点数
                if (b == -1) { b = 1; }
                double c = Math.pow((double)b,(double)a);
                //System.out.println("a = "+a+" b = "+b+" c = "+c);
                //list.add((long)c);
                ans *= c;
                b = a;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}