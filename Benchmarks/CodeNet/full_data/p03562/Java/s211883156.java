import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    private FastScanner in;
    private PrintWriter out;

    final int HASH_MOD = (int) 1e9 + 7;

    class MyNumber {
        BigInteger value;
        int[] hash;
        int[] firstOne;
        int len;

        MyNumber(String s) {
            value = new BigInteger(s, 2);
            hash = new int[s.length() + 1];
            for (int i = 0; i < s.length(); i++) {
                hash[i + 1] = (int) ((hash[i] * 29L + s.charAt(i) - '0') % HASH_MOD);
            }
            len = s.length();
            firstOne = new int[s.length() + 1];
            firstOne[s.length()] = s.length();
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == '1') {
                    firstOne[i] = i;
                } else {
                    firstOne[i] = firstOne[i + 1];
                }
            }
        }

        @Override
        public String toString() {
            return value.toString(2);
        }
    }

    final int MAX = 1010;

    MyNumber[] numbers = new MyNumber[MAX];

    int getSameLen(MyNumber a, MyNumber b) {
        int r = Math.min(a.len, b.len) + 1;
        int l = 0;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            if (a.hash[m] == b.hash[m]) {
                l = m;
            } else {
                r = m;
            }
        }
        return l;
    }

    int calcLenOfDiff(MyNumber a, MyNumber b) {
        if (a.len < b.len) {
            return calcLenOfDiff(b, a);
        }
        int sameLen = getSameLen(a, b);
        if (sameLen == b.len) {
            int firstOne = a.firstOne[sameLen];
            return a.len - firstOne;
        } else {
            return a.len - sameLen;
        }
    }

    List<MyNumber> list = new ArrayList<>();

    void add(MyNumber number) {
        if (numbers[number.len] == null) {
            numbers[number.len] = number;
        }
        for (int i = 0; i < MAX; i++) {
            if (numbers[i] != null) {
                int diffLen = calcLenOfDiff(number, numbers[i]);
                if (diffLen != 0 && numbers[diffLen] == null) {
                    BigInteger first = number.value;
                    BigInteger second = numbers[i].value;
                    if (number.len > numbers[i].len) {
                        second = second.shiftLeft(number.len - numbers[i].len);
                    } else {
                        first = first.shiftLeft(numbers[i].len - number.len);
                    }
                    MyNumber next = new MyNumber(first.xor(second).toString(2));
                    numbers[diffLen] = next;
                    if (next.len != diffLen) {
                        throw new AssertionError();
                    }
                    list.add(next);
                }
            } else {
                if (i > number.len) {
                    MyNumber next = new MyNumber(number.value.shiftLeft(i - number.len).toString(2));
                    numbers[i] = next;
                    list.add(next);
                }
            }
        }
    }

    private void solve() {
        int n = in.nextInt();
        long START = System.currentTimeMillis();
        BigInteger X = new BigInteger(in.next(), 2);
        for (int i = 0; i < n; i++) {
            MyNumber number = new MyNumber(in.next());
            add(number);
        }
        while (list.size() > 0) {
            MyNumber last = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            add(last);
        }
        final int mod = 998244353;
        BigInteger current = BigInteger.ZERO;
        int[] pow2 = new int[MAX];
        pow2[0] = 1;
        for (int i = 1; i < MAX; i++) {
            pow2[i] = pow2[i - 1];
            if (numbers[i] != null) {
                pow2[i] *= 2;
                pow2[i] %= mod;
            }
        }
        long result = 0;
        boolean found = true;
        for (int i = MAX - 2; i >= 0; i--) {
            boolean xBit = X.testBit(i);
            boolean myBit = current.testBit(i);
            if (numbers[i + 1] != null) {
                if (xBit) {
                    result += pow2[i];
                    if (!myBit) {
                        current = current.xor(numbers[i + 1].value);
                    }
                } else {
                    if (myBit) {
                        current = current.xor(numbers[i + 1].value);
                    }
                }
            } else {
                if (xBit != myBit) {
                    if (myBit) {
                        found = false;
                        break;
                    } else {
                        result += pow2[i + 1];
                    }
                }
            }
        }
        if (found) {
            result++;
        }
        out.println(result % mod);
        System.err.println(System.currentTimeMillis() - START);
    }

    private void run() {
        try {
            in = new FastScanner(new File("ARC_084_D.in"));
            out = new PrintWriter(new File("ARC_084_D.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void runIO() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    private class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
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
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}