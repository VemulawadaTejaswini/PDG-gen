import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
            
            String n = sc.next();
            int k = sc.nextInt();

            for (int i = 0; i < k; i++) {
              int d = sc.nextInt();
              for (int j = 0; j < 10; j++) {
                if (numbers.get(j) == d) {
                  numbers.remove(j);
                  break;
                }                
              }
            }

            String[] answerArray = new String[4];
            for (int i = 0; i < n.length(); i++) {
              int number = n.charAt(i);

              for (int j = 0; j < k; j++) {
                if (number <= numbers.get(j)) {
                  answerArray[i] = String.valueOf(numbers.get(j));
                  break;
                }
              }
            }

            System.out.println(Integer.parseInt(String.join("", answerArray)));

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
