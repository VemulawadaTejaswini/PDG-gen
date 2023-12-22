import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final String []s = new String[n+1];
        s[0] = "NULL";
        String ss = sc.next();

        List<Integer> rList = new ArrayList<>();
        List<Integer> gList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        for (int i = 1;i<s.length;++i)
        {
            s[i] = ss.substring(i-1,i);
            if (s[i].equals("R")) rList.add(i);
            if (s[i].equals("G")) gList.add(i);
            if (s[i].equals("B")) bList.add(i);
        }

        int count = 0;
        for (int k = n;k>0;--k)
        {
            for (int j = k-1;j>0;--j)
            {
                if (s[k].equals(s[j])) continue;
                List<Integer> list = new ArrayList<>();
                if (!s[k].equals("R") && !s[j].equals("R")) list = new ArrayList<>(rList);
                if (!s[k].equals("G") && !s[j].equals("G")) list = new ArrayList<>(gList);
                if (!s[k].equals("B") && !s[j].equals("B")) list = new ArrayList<>(bList);
                for (int i:list)
                {
                    if (j<= i) continue;
                    if (j-i == k-j) continue;
                    //System.out.println("i = "+i+" j = "+j+" k = "+k);
                    ++count;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}