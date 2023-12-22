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

        Map<Long, Integer> map = new TreeMap<>();
        for (Long i:list)
        {
            ++c;
            for (int j=c;j<n;++j)
            {
                Long a = i*list.get(j);
                if(map.get(a)==null) map.put(a,1);
                else
                {
                    int d = map.get(a);
                    ++d;
                    map.put(a,d);
                }
            }
        }
        
        int d = 0;
        for (Long l:map.keySet())
        {
            d+=map.get(l);
            if (k<=d)
            {
                System.out.println(l);
                break;
            }
        }

        sc.close();
    }
}