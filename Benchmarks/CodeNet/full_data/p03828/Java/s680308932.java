import java.io.*;
import java.util.*;
public class Main {
    private static MyScanner scanner;
    private int[] primeNumTable = new int[1001];
    private boolean[] primeTable;

    public static void main (String[] args){
        Main instance = new Main();
        scanner = instance.new MyScanner();
        instance.solve();
    }

    private void solve() {
        try {
            int N = scanner.nextInt();
            createPrimeTable(N);
            for (int i = 2; i <= N; i++) {
                countPrime(i);
            }
            long count = 1;
            for (int i = 2; i < primeNumTable.length; i++) {
                if (primeNumTable[i] != 0) {
                    count *= primeNumTable[i] + 1;
                    count %= 1000000007;
                }
            }
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createPrimeTable (int n) {
        primeTable = new boolean[n+1];
        for (int i = 1; i <= n; i++) {
            primeTable[i] = true;
        }
        for (int i = 2; i <= n; i++) {
            if (primeTable[i]) {
                int prime = i;
                int index = i+1;
                while(index < n+1) {
                    if (index % prime == 0) {
                        primeTable[index] = false;
                    }
                    index++;
                }
            }
        }
    }

    private void countPrime (int n) {
        int index = 2;
        while(n > 1) {
            while(!primeTable[index]) {
                index++;
            }
            int prime = index;
            while(n % prime == 0) {
                n /= prime;
                primeNumTable[prime]++;
            }
            index++;
        }
    }

    private class MyScanner {
        String[] s;
        int i;
        BufferedReader br;
        String reg = " ";

        MyScanner () {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String line = br.readLine();
            while (line.equals("")) {
                line = br.readLine();
            }
            s = line.split(reg, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }

        public long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }
    }
}