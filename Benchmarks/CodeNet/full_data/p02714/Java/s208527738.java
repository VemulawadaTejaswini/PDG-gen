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
        for (int i = 1;i<s.length;++i) s[i] = ss.substring(i-1,i);

        int count = 0;
        for (int k = n;k>0;--k)
        {
            for (int j = k-1;j>0;--j)
            {
                for (int i = j-1;i>0;--i)
                {
                    if (j-i == k-j) continue;
                    if (s[i].equals(s[j])
                            || s[i].equals(s[k])
                            || s[j].equals(s[k])) continue;
                    //System.out.println("i = "+i+" j = "+j+" k = "+k);
                    ++count;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}