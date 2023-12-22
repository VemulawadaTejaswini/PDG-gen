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
        instance.solve();
    }

    private void solve() {
        try {
            boolean[] numbers = new boolean[10];

            int n = sc.nextInt();
            int k = sc.nextInt();

            for (int i = 0; i < 10; i++) {
              numbers[i] = true;
            }
            for (int i = 0; i < k; i++) {
              int d = sc.nextInt();
              d++;
              numbers[d] = false;
            }

            while (true) {

              boolean isValid = true;
              String number = String.valueOf(n);
              
              for (int j = 0; j < number.length(); j++) {
              int index = Integer.parseInt(String.valueOf(number.charAt(j)));
                if (numbers[index] == false) {
                  isValid = false;
                  break;
                }
              }
              if (isValid) {
                break;
              }
              n++;  
            }

            System.out.println(n);

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
