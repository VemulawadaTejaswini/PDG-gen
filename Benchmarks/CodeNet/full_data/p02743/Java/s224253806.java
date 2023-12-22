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
        //int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        Compute compute = new Compute();
        Map<Long,Long> aMap = compute.primeFactors(a);
        Map<Long,Long> bMap = compute.primeFactors(b);
        Map<Long,Long> cMap = compute.primeFactors(c);

        long aOut = 1;
        long aIn = 1;
        for (long key : aMap.keySet())
        {
            long value  = aMap.get(key);
            long tmp = value/2;
            long tmp2 = value%2;
            if (tmp != 0)aOut *= (key*tmp);
            if (tmp2 != 0) aIn *= key;
        }

        long bOut = 1;
        long bIn = 1;
        for (long key : bMap.keySet())
        {
            long value  = bMap.get(key);
            long tmp = value/2;
            long tmp2 = value%2;
            if (tmp != 0)bOut *= (key*tmp);
            if (tmp2 != 0) bIn *= key;
        }

        long cOut = 1;
        long cIn = 1;
        for (long key : cMap.keySet())
        {
            long value  = cMap.get(key);
            long tmp = value/2;
            long tmp2 = value%2;
            if (tmp != 0)cOut *= (key*tmp);
            if (tmp2 != 0) cIn *= key;
        }

        if (aOut == 1) aOut = 0;
        if (bOut == 1) bOut = 0;
        if (cOut == 1) cOut = 0;
        System.out.println(aOut+"√"+aIn);
        System.out.println(bOut+"√"+bIn);
        System.out.println(cOut+"√"+cIn);

        if (aOut+cOut < cOut) System.out.println("Yes");
        else if (aOut+bOut > cOut) System.out.println("No");
        else
        {
            if (aIn + bIn < cIn) System.out.println("Yes");
            else System.out.println("No");
        }
        sc.close();
    }
}