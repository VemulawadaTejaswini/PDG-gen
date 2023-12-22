import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class C {
    private static int MOD = 1000000007;


    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        String[] split = str.split(" ");
        long n = Long.parseLong(split[0]);
        int k = Integer.parseInt(split[1]);

        long multiple = n / k;
        long now = n - (multiple * k);
        while(true) {
            long abs = Math.abs(now - k);
            if(now <= abs || now <= k) { // 100000 : 1000 
                System.out.println(now);
                return;
            } else {
                now = abs;
            }
        }

    }
}
