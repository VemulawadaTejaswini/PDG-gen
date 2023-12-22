import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int[] as = new int[n];
        int[] bs = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bs[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (as[i] > max) {
                max = as[i];
            }
            if (bs[i] > max) {
                max = bs[i];
            }
        }
        int maxBits = Integer.toBinaryString(max).length();
        //System.out.println(maxBits);
        int ans = 0;
        for (int b = 0; b <= maxBits; b++) {
            int[] maskedAs = new int[n];
            int[] maskedBs = new int[n];
            int mask = (1 << (b + 1)) - 1;
            for (int i = 0; i < n; i++) {
                maskedAs[i] = as[i] & mask;
                maskedBs[i] = bs[i] & mask;
            }
            Arrays.sort(maskedBs);
            int T = 1 << b;
            int count = 0;
            for (int i = 0; i < n; i++) {
                //int index1 = Arrays.binarySearch(maskedBs, T - maskedAs[i]);
                //int index2 = Arrays.binarySearch(maskedBs, 2 * T - maskedAs[i]);
                //int index3 = Arrays.binarySearch(maskedBs, 3 * T - maskedAs[i]);
                int index1 = lower_bound(maskedBs, T - maskedAs[i]);
                int index2 = lower_bound(maskedBs, 2 * T - maskedAs[i]);
                int index3 = lower_bound(maskedBs, 3 * T - maskedAs[i]);
                int index4 = lower_bound(maskedBs, 4 * T - maskedAs[i]);
                if (index1 < 0) {
                    index1 = ~index1;
                }
                if (index2 < 0) {
                    index2 = ~index2;
                }
                if (index3 < 0) {
                    index3 = ~index3;
                }
                count += index2 - index1 + index4 - index3;
                System.out.printf("%d %d %d %d\n", index1, index2, index3, index4);
            }
            System.out.println(count);
            if (count % 2 == 1) {
                ans |= 1 << b;
            }
        }
        System.out.println(ans);
    }

    static int lower_bound(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (high - low >= 0) {
            int mid = (low + high) / 2;
            if (key <= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
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
                catch (IOException e)
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
