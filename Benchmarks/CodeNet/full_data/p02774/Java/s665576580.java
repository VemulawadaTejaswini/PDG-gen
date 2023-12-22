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
        //
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i=0;i<n;++i) list.add(sc.nextLong());

        List<Long> m = new ArrayList<>();
        List<Long> p = new ArrayList<>();
        int c = 0;

        for (Long i:list)
        {
            ++c;
            for (int j=c;j<n;++j)
            {
                Long a = i*list.get(j);
                if (a<0) m.add(a);
                else p.add(a);
            }
        }

        int mSize = m.size();
        if (mSize > k)
        {
            Collections.sort(m);
            System.out.println(m.get(k-1));
        }else
        {
            Collections.sort(p);
            System.out.println(p.get(k-mSize-1));
        }

        sc.close();
    }
}