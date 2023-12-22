import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static long[] as, bs;
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        as = new long[n];
        bs = new long[n];
        for (int i = 0; i < n; i++)
            as[i] = sc.nextLong();
        for (int i = 0; i < n; i++)
            bs[i] = sc.nextLong();
        long sumA = Arrays.stream(as).sum();
        long sumB = Arrays.stream(bs).sum();
        /*
        List<Long> aList = new ArrayList<>();
        List<Long> bList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (as[i] != bs[i]) {
                aList.add(as[i]);
                bList.add(bs[i]);
            }
        }
        */

        long diffNum = 0;
        for (int i = 0; i < n; i++) {
            if (as[i] > bs[i]) {
                diffNum += (as[i] - bs[i]) * 2;
            } else if (as[i] < bs[i]) {
                diffNum += (bs[i] - as[i]);
            }
        }
        if (diffNum <= 2 * (sumB - sumA)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        /*
        for (int i = 0; i <= sumB - sumA; i++) {
            if (aList.equals(bList)) {
                System.out.println("Yes");
                return;
            }
            if (i == sumB - sumA) break;
            boolean flaga = false;
            boolean flagb = false;
            for (int j = 0; j < aList.size(); j++) {
                if (flaga && flagb) break;
                if (!flaga && aList.get(j) < bList.get(j)) {
                    flaga = true;
                    aList.set(j, aList.get(j) + 2);
                }
                if (!flagb && aList.get(j) > bList.get(j)) {
                    flagb = true;
                    bList.set(j, bList.get(j) + 1);
                }
            }
        }
        System.out.println("No");
        */
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
