import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class newclas {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] lo = reader.readLine().split(" ");
        long N = Long.parseLong(lo[0]);
        long K = Long.parseLong(lo[1]);
        if(K==1) System.out.println(0);
        else {
            HashSet<Long> hs = new HashSet<Long>();
            while (!hs.contains(N)) {
                hs.add(N);
                N = Math.abs(N - K);
            }
            long min = Long.MAX_VALUE;
            for (Long t :
                    hs) {
                min = Math.min(min, t);
            }
            System.out.println(min);
        }
    }
}
