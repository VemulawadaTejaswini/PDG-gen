import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    int n;
    int[] as;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        as = new int[3 * n];
        for (int i = 0; i < 3 * n; i++) {
            as[i] = sc.nextInt();
        }
        solve();
    }

    void solve() {
        if (n == 1) {
            long ans = 0;
            if (Math.abs(as[0] - as[1]) < Math.abs(as[1] - as[2])) {
                ans = as[0] - Math.max(as[1], as[2]);
            } else {
                ans = Math.max(as[0], as[1]) - as[2];
            }
            System.out.println(ans);
            return;
        }
        int length = 3 * n;
        boolean[] picked = new boolean[length];
        SortedMap<Integer, List<Integer>> former = new TreeMap<>();
        SortedMap<Integer, List<Integer>> latter = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            if (!former.containsKey(as[i])) {
                List<Integer> temp = new LinkedList<>();
                temp.add(i);
                former.put(as[i], temp);
            } else {
                List<Integer> temp = former.get(as[i]);
                temp.add(i);
                former.put(as[i], temp);
            }
            int index = length - i - 1;
            if (!latter.containsKey(as[index])) {
                List<Integer> temp = new LinkedList<>();
                temp.add(index);
                latter.put(as[index], temp);
            } else {
                List<Integer> temp = latter.get(as[index]);
                temp.add(index);
                latter.put(as[index], temp);
            }
        }
        int l = n;
        int r = length - n - 1;
        for (int i = 0; i < n; i++) {
            Iterator<Integer> formerIt = former.keySet().iterator();
            int formerMin = formerIt.next();
            int formerSecondMin = formerIt.next();
            int formerDiff = formerSecondMin - formerMin;
            if (formerMin >= as[l]) {
                formerDiff = formerMin - as[l];
            } else if (formerSecondMin >= as[l]) {
                formerDiff = as[l] - formerMin;
            }
            Iterator<Integer> latterIt = latter.keySet().iterator();
            int latterMax = latterIt.next();
            int latterSecondMax = latterIt.next();
            int latterDiff = latterMax - latterSecondMax;
            if (as[r] >= latterMax) {
                latterDiff = as[r] - latterMax;
            } else if (as[r] >= latterSecondMax) {
                latterDiff = latterMax - as[r];
            }
            if (formerDiff >= latterDiff) {
                if (formerMin >= as[l]) {
                    picked[l] = true;
                } else {
                    if (!former.containsKey(as[l])) {
                        List<Integer> temp = new LinkedList<>();
                        temp.add(l);
                        former.put(as[l], temp);
                    } else {
                        List<Integer> temp = former.get(as[l]);
                        temp.add(l);
                        former.put(as[l], temp);
                    }
                    picked[former.get(formerMin).get(0)] = true;
                    if (former.get(formerMin).size() == 1) {
                        former.remove(formerMin);
                    } else {
                        List<Integer> temp = former.get(formerMin);
                        temp.remove(0);
                        former.put(formerMin, temp);
                    }
                }
                l++;
            } else {
                if (latterMax <= as[r]) {
                    picked[r] = true;
                } else {
                    if (!latter.containsKey(as[r])) {
                        List<Integer> temp = new LinkedList<>();
                        temp.add(r);
                        latter.put(as[r], temp);
                    } else {
                        List<Integer> temp = latter.get(as[r]);
                        temp.add(r);
                        latter.put(as[r], temp);
                    }
                    picked[latter.get(latterMax).get(0)] = true;
                    if (latter.get(latterMax).size() == 1) {
                        latter.remove(latterMax);
                    } else {
                        List<Integer> temp = latter.get(latterMax);
                        temp.remove(0);
                        latter.put(latterMax, temp);
                    }
                }
                r--;
            }
        }
        long ans = 0;
        int j = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            while(picked[i + j]) {
                j++;
            }
            ans += (long)as[i + j];
            while(picked[length - i - k - 1]) {
                k++;
            }
            ans -= (long)as[length - i - k - 1];
        }
        System.out.println(ans);
    }

    class Pair implements Comparable<Pair> {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int compareTo(Pair p) {
            return this.value - p.value;
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
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

        String nextLine() {
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
