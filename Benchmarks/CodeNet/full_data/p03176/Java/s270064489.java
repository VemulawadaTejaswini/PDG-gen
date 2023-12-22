//package atcoder.dpContest;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        try {
//            FastScanner in = new FastScanner(new FileInputStream("src/input.in"));
//            PrintWriter out = new PrintWriter(new FileOutputStream("src/output.out"));

        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

            solve(1, in, out);

//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void solve(int q, FastScanner in, PrintWriter out) {
        for (int qq = 0; qq < q; qq++) {
            int N = in.nextInt();
            int[] h = new int[N], a = new int[N];
            for(int i = 0; i < N; i++) {
                h[i] = in.nextInt();
            }
            for(int i = 0; i < N; i++) {
                a[i] = in.nextInt();
            }

            long[] dp = new long[N];    //dp[i]: max score from [0, i] that is a monotonic increasing sequence
            dp[0] = a[0];
            long[] stArray = new long[N + 1];
            SegmentTreeRangeMaximumQueryIterative stMax = new SegmentTreeRangeMaximumQueryIterative(stArray);
            stMax.updateNumAtIndex(h[0], dp[0]);

            //need to find the max score dp[j]: such that j < i, h[j] < h[i] and dp[j] is the max out of all such that meet the requirement
            //can this be done in logN time?
            //tree map: height as key, a max priority queue as value?

//            9
//            4 2 5 8 3 6 1 7 9   h
//            6 8 8 4 6 3 5 7 5   a

            for(int i = 1; i < N; i++) {
                long prevMax = stMax.getMaximumInRange(1, h[i] - 1);
                dp[i] = (prevMax > Long.MIN_VALUE ? prevMax : 0)+ a[i];
                stMax.updateNumAtIndex(h[i], dp[i]);
            }
            out.println(dp[N - 1]);
        }
        out.close();
    }

    private static long modularAdd(long a, long b, int mod) {
        long sum = a + b;
        if (sum >= mod) {
            sum -= mod;
        }
        return sum;
    }

    private static long modularSubtract(long a, long b, int mod) {
        long diff = a - b;
        if (diff < 0) {
            diff += mod;
        }
        return diff;
    }

    static class SegmentTreeRangeMaximumQueryIterative {
        private long[] st;
        private int leafNodeNum;
        private int expandedSize;
        private int height;

        public SegmentTreeRangeMaximumQueryIterative(long[] nums) {
            leafNodeNum = nums.length;
            height = (int)(Math.ceil(Math.log(nums.length) / Math.log(2)));
            expandedSize = (int)Math.pow(2, height);
            int max_size = expandedSize * 2 - 1;
            st = new long[max_size];

            for(int i = 0; i < expandedSize; i++) {
                st[expandedSize - 1 + i] = i >= leafNodeNum ? Long.MIN_VALUE : nums[i];
            }
            for(int i = expandedSize - 2; i >= 0; i--) {
                st[i] = Math.max(st[i * 2 + 1], st[i * 2] + 2);
            }
        }

        /*
        @params: [left, right] is a range in the original input array nums
        */
        public long getMaximumInRange(int left, int right) {
            // convert range of the original array to segment tree range
            left += (expandedSize - 1);
            right += (expandedSize - 1);

            long max = Long.MIN_VALUE;

            while(left <= right) {
                if(left % 2 == 0) {
                    max = Math.max(max, st[left]);
                    left++;
                }
                if(right % 2 != 0) {
                    max = Math.max(max, st[right]);
                    right--;
                }
                left = (left - 1) / 2;
                right = (right - 2) /2;
            }
            return max;
        }

        public void updateNumAtIndex(int idx, long newVal) {
            idx += (expandedSize - 1);
            st[idx] = newVal;
            idx = idx % 2 != 0 ? (idx - 1) / 2 : (idx - 2) / 2;
            while(idx >= 0) {
                st[idx] = Math.max(st[idx * 2 + 1], st[idx * 2 + 2]);
                idx = idx % 2 != 0 ? (idx - 1) / 2 : (idx - 2) / 2;
            }
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}


