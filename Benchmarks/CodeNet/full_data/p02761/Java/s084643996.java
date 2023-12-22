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
        int m = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<m;++i)
        {
            int ss = sc.nextInt();
            int cc = sc.nextInt();

            if (ss == 1 && cc == 0 && n!=1) continue;

            if (map.get(ss) == null) map.put(ss,cc);
            else if (map.get(ss) > cc)
            {
                if (n == 1) map.put(ss,cc);
                else
                {
                    if (ss != 1) map.put(ss,cc);
                    else map.put(ss,cc);
                }
            }
        }


        String k[] = new String[n];

        for (int i = 0;i<n;++i) k[i] = "0";

        for (int i:map.keySet()) k[i-1] = map.get(i).toString();

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;++i) sb.append(Integer.parseInt(k[i]));
        String sl = sb.toString();
        int value = Integer.parseInt(sl);

        if (n == String.valueOf(value).length()) System.out.println(value);
        else System.out.println(-1);
        sc.close();
    }
}