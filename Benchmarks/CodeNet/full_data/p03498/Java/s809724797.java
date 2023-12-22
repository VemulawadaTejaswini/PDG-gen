import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    int n;
    int[] as;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }
        solve();
    }

    void solve() {
        ArrayList<Integer> xList = new ArrayList<>();
        ArrayList<Integer> yList = new ArrayList<>();
        int maxAbs = 0;
        int maxAbsIndex = -1;
        boolean reverseFlag = false;
        for (int i = 0; i < n; i++) {
            if (Math.abs(as[i]) > Math.abs(maxAbs)) {
                maxAbs = as[i];
                maxAbsIndex = i;
            }
        }
        if (maxAbs == 0) {
            System.out.println(0);
            return;
        }
        if (maxAbs < 0) {
            reverseFlag = true;
            int[] bs = new int[n];
            for (int i = 0; i < n; i++) {
                bs[n - i - 1] = -as[i];
            }
            maxAbs = -maxAbs;
            maxAbsIndex = n - maxAbsIndex - 1;
        }
        boolean[] nonDec = new boolean[n - 1];
        for (int i = 0; i < n - 1; i++) {
            if (as[i] <= as[i + 1]) {
                nonDec[i] = true;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (nonDec[i]) {
                while(as[i] > as[i + 1]) {
                    as[i + 1] += maxAbs;
                    if (reverseFlag) {
                        xList.add(n - maxAbsIndex);
                        yList.add(n - i - 1);
                    } else {
                        xList.add(maxAbsIndex + 1);
                        yList.add(i + 2);
                    }
                    if (maxAbsIndex == i + 1) {
                        maxAbs += maxAbs;
                    }
                }
            } else {
                if (maxAbs < as[i]) {
                    maxAbs = as[i];
                    if (reverseFlag) {
                        maxAbsIndex = n - i - 1;
                    } else {
                        maxAbsIndex = i;
                    }
                }
                while(as[i] > as[i + 1]) {
                    as[i + 1] += maxAbs;
                    if (reverseFlag) {
                        xList.add(n - maxAbsIndex);
                        yList.add(n - i - 1);
                    } else {
                        xList.add(maxAbsIndex + 1);
                        yList.add(i + 2);
                    }
                }
                if (maxAbs < as[i + 1]) {
                    maxAbs = as[i + 1];
                    if (reverseFlag) {
                        maxAbsIndex = n - i - 2;
                    } else {
                        maxAbsIndex = i + 1;
                    }
                }
            }
        }
        System.out.println(xList.size());
        for (int i = 0; i < xList.size(); i++) {
            System.out.println(xList.get(i) + " " + yList.get(i));
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
