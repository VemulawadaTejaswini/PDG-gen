import utils.PrintUtil;

import java.io.*;
import java.util.*;

public class Main {

    static class Task {

        private static final int MOD = 998244353;

        private int[] arr;
        private int n;
        private int[] suffixSumArr;
        private Map<Integer, List<List<Integer>>> memoMap;

        private List<List<Integer>> dp(int idx, int sum) {
            if (sum == 0) {
                return new ArrayList<>();
            }

            if (sum < 0 || idx == n || suffixSumArr[idx] < sum) {
                return null;
            }

            int key = idx + 3001 + sum;
//            if (memoMap.containsKey(key)) {
//                return memoMap.get(key);
//            }

            List<List<Integer>> ansList = new ArrayList<>();
            List<List<Integer>> chooseList = dp(idx + 1, sum - arr[idx]);
            if (chooseList != null) {
                if (chooseList.isEmpty()) {
                    List<Integer> addedList = new ArrayList<>();
                    addedList.add(idx);
                    ansList.add(addedList);
                } else {
                    for (List<Integer> list : chooseList) {
                        List<Integer> addedList = new ArrayList<>();
                        addedList.add(idx);
                        addedList.addAll(list);
                        ansList.add(addedList);
                    }
                }
            }

            List<List<Integer>> nonChooseList = dp(idx + 1, sum);
            if (nonChooseList != null) {
                ansList.addAll(nonChooseList);
            }

            if (ansList.isEmpty()) {
                ansList = null;
            }

//            memoMap.put(key, ansList);
            return ansList;
        }

        private void calcSuffixSum() {
            suffixSumArr = new int[n];
            suffixSumArr[n-1] = arr[n-1];
            for (int i = n - 2; i >= 0; i--) {
                suffixSumArr[i] = suffixSumArr[i+1] + arr[i];
            }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            int s = in.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            calcSuffixSum();
            memoMap = new HashMap<>();
            List<List<Integer>> listList = dp(0, s);
            PrintUtil.printIntListList(listList);
            if (listList == null || listList.isEmpty()) {
                out.println(0);
                return;
            }

            long ans = 0;
            for (List<Integer> tmpList : listList) {
                int minIdx = tmpList.get(0);
                int maxIdx = tmpList.get(tmpList.size() - 1);
                ans = (ans + (minIdx + 1L) * (n - maxIdx)) % MOD;
            }

            out.println(ans);
        }
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task task = new Task();
        task.solve(1, in, out);
        out.close();
    }

    static class InputReader {

        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}