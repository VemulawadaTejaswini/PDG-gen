import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        long[] array = new long[N];
        boolean[] array2 = new boolean[N];
        String[] array3 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            array[i] = Long.parseLong(array3[i]);
        }
        Arrays.sort(array);
        long max = array[N - 1]+ array[N - 2];
        int t =  - 1;
        while (Math.pow(2, t + 1) < max) {
            t++;
        }
        int ans = 0;
        while (t > 0) {
            long beki = (long)Math.pow(2, t);
            outside: for (int i = 0; i < N - 1; i++) {
                if (array2[i]) {
                    continue outside;
                }
                long a = array[i];
                if (a >= beki) {
                    break outside;
                }
                inside: for (int j = i + 1; j < N; j++) {
                    if (array2[j]) {
                        continue inside;
                    }
                    long b = array[j];
                    if (a + b == beki) {
                        ans++;
                        array2[i] = true;
                        array2[j] = true;
                        continue outside;
                    }
                }
            }
            t--;
        }
        out.println(ans);
        out.close();
    }
}
