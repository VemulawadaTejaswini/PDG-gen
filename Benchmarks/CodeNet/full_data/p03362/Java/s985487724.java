import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    int n;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        solve();
    }

    void solve() {
        int count = 0;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541};
        int[] ans = Arrays.copyOfRange(primes, primes.length - n, primes.length);
        ans[0] = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
            System.out.println();
        }
        /*
        while(true) {
            outer:
            for (int i = 0; i < n - 4; i++) {
                for (int j = i + 1; i < n - 3; i++) {
                    for (int k = j + 1; k < n - 2; k++) {
                        for (int l = k + 1; l < n - 1; l++) {
                            for (int m = l + 1; m < n; m++) {
                                int sum = ans[i] + ans[j] + ans[k] + ans[l] + ans[m];
                                if (Arrays.binarySearch(primes, sum) >= 0) {
                                    for (int c = 0; c < ans.length; c++) {
                                        System.out.print(ans[c]);
                                        if (c < ans.length - 1) {
                                            System.out.print(" ");
                                        }
                                    }
                                    System.out.println();
                                    return;
                                } else {
                                    ans[m] = primes[m + count++];
                                    break outer;
                                }
                            }
                        }
                    }
                }
            }
        }
        */
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
