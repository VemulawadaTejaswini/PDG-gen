import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int n = sc.nextInt();
            int[] odd = new int[150000];
            int[] even = new int[150000];
            Arrays.fill(odd, 0);
            Arrays.fill(even, 0);

            int oddMax = 0;
            int oddMaxIndex=0;
            int oddSec = 0;
            int oddSecIndex=0;
            int evenMax = 0;
            int evenMaxIndex=0;
            int evenSec = 0;
            int evenSecIndex=0;

            for (int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                if (i%2 == 1) {
                    odd[tmp]++;
                    if (oddMax < odd[tmp]) {
                        if (oddMaxIndex != tmp) {
                            oddSec = oddMax;
                            oddSecIndex = oddMaxIndex;
                            oddMax = odd[tmp];
                            oddMaxIndex = tmp;
                        }
                    } else if (oddSec < odd[tmp]) {
                        oddSec = odd[tmp];
                        oddSecIndex = tmp;
                    }
                } else {
                    even[tmp] ++;
                    if (evenMax < even[tmp]) {
                        if (evenMaxIndex != tmp) {
                            evenSec = evenMax;
                            evenSecIndex = evenMaxIndex;
                            evenMax = even[tmp];
                            evenMaxIndex = tmp;   
                        }
                    } else if (evenSec < even[tmp]) {
                        evenSec = even[tmp];
                        evenSecIndex = tmp;
                    }
                }
            }
            if (evenMaxIndex == oddMaxIndex) {
                if (evenSecIndex== oddSecIndex && evenSecIndex == evenMaxIndex) {
                    System.out.println(n/2);
                } else if (evenMaxIndex == evenSecIndex) {
                    System.out.println(n - even[evenMaxIndex] - odd[oddSecIndex]);
                } else if (oddMaxIndex == oddSecIndex) {
                    System.out.println(n - odd[oddMaxIndex]- even[evenSecIndex]);
                } else {
                    System.out.println(n - Math.max(even[evenMaxIndex] + odd[oddSecIndex], even[evenSecIndex] + odd[oddMaxIndex]));
                }
            } else {
                System.out.println(n - even[evenMaxIndex] - odd[oddMaxIndex]);
            }




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