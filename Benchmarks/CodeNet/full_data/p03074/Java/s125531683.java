
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    int n, k;
    String s;
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            n = sc.nextInt();
            k = sc.nextInt();
            s = sc.next();
            List<Integer> zerodata = new ArrayList<>();
            List<Integer> onedata = new ArrayList<>();


            Boolean isZero = false;
            int zerocount = 0;
            int onecount = 0;
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    if (s.charAt(i) == '0') {
                        isZero = true;
                        zerocount++;
                    } else {
                        onecount ++;
                    }
                } else if (i < n-1 && 0 < i) {
                    if (s.charAt(i) == '0' && !isZero) {
                        isZero = true;
                        zerocount ++;
                        onedata.add(onecount);
                        onecount = 0;
                    } else if (s.charAt(i) == '0' && isZero) {
                        zerocount ++;
                    } else if (s.charAt(i) == '1' && !isZero) {
                        onecount ++;
                    } else if (s.charAt(i) == '1' && isZero) {
                        isZero = false;
                        onecount ++;
                        zerodata.add(zerocount);
                        zerocount = 0;
                    }
                } else{
                    if (s.charAt(i) == '0' && !isZero) {
                        zerodata.add(1);
                        onedata.add(onecount);

                    } else if (s.charAt(i) == '0' && isZero) {
                        zerodata.add(zerocount + 1);
                    } else if (s.charAt(i) == '1' && !isZero) {
                        onedata.add(onecount + 1);
                    } else if (s.charAt(i) == '1' && isZero) {
                        onedata.add(1);
                        zerodata.add(zerocount);
                    }
                }
            }

            if (zerodata.size() == 0) {
                System.out.println(n);
                return;
            } else if (onedata.size() == 0) {
                System.out.println(n);
                return;
            }

            Boolean isFirstZero = s.charAt(0) == '0';
            Boolean isLastZero = s.charAt(n-1) == '0';

            int left = 0;
            int right = 0;
            int max = 0;
            int maxRight = zerodata.size();
            // System.out.println(zerodata.size());
            // System.out.println(onedata.size());

            while(true) {
                /* calculate score and update max here
                *  it is necessary to check first and last
                *  */
                int sum = 0;

                // まずは変化させる0の部分の総和を計算する
                if (zerodata.size() > 0) {
                    for (int i = left; i <= right; i++) {
                        sum += zerodata.get(i);
                    }
                }
                // 最初の文字が０のとき
                if (s.charAt(0) == '0' && onedata.size() > 0) {
                    for (int i = left; i <= right - 1; i++) {
                        sum += onedata.get(i);
                    }
                    if (left != 0) sum += onedata.get(left - 1);
                    if (s.charAt(n - 1) == '1' && right != maxRight - 1)
                        sum += onedata.get(right + 1);
                    else if (right < maxRight - 1)
                        sum += onedata.get(right);
                }
                // 最初の文字が１のとき
                else if (onedata.size() > 0) {
                    for (int i = left; i <= right; i++) {
                        sum += onedata.get(i);
                    }
                    if (s.charAt(n - 1) == '1')
                        sum += onedata.get(right + 1);
                    else if (right != maxRight - 1)
                        sum += onedata.get(right + 1);
                }

                if (sum > max) {
                    max = sum;
                }
                // System.out.println(String.format("left: %d, right: %d, sum: %d", left, right, sum));
                if (left == maxRight-1 && right == maxRight-1) break;
                if (right - left + 1 < k && right < maxRight - 1) {
                    right ++;
                } else {
                    left ++;
                }
            }
            System.out.println(max);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }
}